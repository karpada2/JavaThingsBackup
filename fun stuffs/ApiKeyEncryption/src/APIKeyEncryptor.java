import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.SecureRandom;
import java.util.Base64;

public class APIKeyEncryptor {
    // SECURITY CONSTANTS - These control the strength of the encryption
    private static final int ITERATIONS = 100_000;  // How many times PBKDF2 runs (higher = slower but more secure)
    private static final int KEY_LENGTH = 256;     // Length of the derived encryption key in bits
    private static final int IV_LENGTH = 12;       // Length of initialization vector for GCM mode
    private static final int TAG_LENGTH = 16;      // Length of authentication tag for GCM mode

    public static String encryptAPIKey(String apiKey, String password) throws Exception {
        // RANDOM NUMBER GENERATOR - Creates unpredictable values for security
        SecureRandom random = new SecureRandom();

        // SALT - Random bytes that make each encryption unique
        // Even if you encrypt the same API key twice, the result will be different
        byte[] salt = new byte[16];  // 16 bytes = 128 bits of randomness
        random.nextBytes(salt);

        // IV (Initialization Vector) - Random bytes required for AES-GCM encryption
        // Ensures that encrypting the same data twice produces different results
        byte[] iv = new byte[IV_LENGTH];  // 12 bytes for GCM mode
        random.nextBytes(iv);

        // KEY DERIVATION SETUP - Converts password into encryption key
        // PBEKeySpec holds the password, salt, iterations, and desired key length
        PBEKeySpec spec = new PBEKeySpec(
                password.toCharArray(),  // Your master password as char array (more secure than String)
                salt,                    // The random salt we generated
                ITERATIONS,              // Number of hash iterations (makes brute force harder)
                KEY_LENGTH              // We want a 256-bit key
        );

        // KEY FACTORY - The actual PBKDF2 implementation
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");

        // DERIVED KEY - The actual encryption key created from your password
        // This is what's used to encrypt/decrypt, not the original password
        byte[] derivedKey = factory.generateSecret(spec).getEncoded();

        // SECRET KEY SPEC - Wraps the derived key for use with AES encryption
        SecretKeySpec secretKey = new SecretKeySpec(derivedKey, "AES");

        // CIPHER - The encryption engine that does the actual work
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        // AES = encryption algorithm, GCM = mode (provides authentication), NoPadding = GCM handles padding

        // GCM PARAMETER SPEC - Configuration for GCM mode
        // Tells the cipher how to use the IV and authentication tag
        GCMParameterSpec gcmSpec = new GCMParameterSpec(
                TAG_LENGTH * 8,  // Tag length in bits (16 bytes = 128 bits)
                iv              // The initialization vector
        );

        // CIPHER INITIALIZATION - Set up the cipher for encryption
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, gcmSpec);

        // ENCRYPTION - Convert your API key into encrypted bytes
        byte[] encrypted = cipher.doFinal(apiKey.getBytes());
        // This contains both the encrypted data AND the authentication tag

        // COMBINE ALL COMPONENTS - Create a single byte array with all the data needed for decryption
        byte[] result = new byte[salt.length + iv.length + encrypted.length];
        // Format: [SALT][IV][ENCRYPTED_DATA_WITH_TAG]

        System.arraycopy(salt, 0, result, 0, salt.length);                           // Copy salt to beginning
        System.arraycopy(iv, 0, result, salt.length, iv.length);                     // Copy IV after salt
        System.arraycopy(encrypted, 0, result, salt.length + iv.length, encrypted.length); // Copy encrypted data last

        // BASE64 ENCODING - Convert binary data to text for storage/transmission
        return Base64.getEncoder().encodeToString(result);
    }

    public static String decryptAPIKey(String encryptedData, String password) throws Exception {
        // BASE64 DECODING - Convert the stored text back to binary data
        byte[] combined = Base64.getDecoder().decode(encryptedData);

        // EXTRACT COMPONENTS - Pull apart the combined data
        byte[] salt = new byte[16];                                    // Salt is always 16 bytes
        byte[] iv = new byte[IV_LENGTH];                              // IV is always 12 bytes for GCM
        byte[] encrypted = new byte[combined.length - 16 - IV_LENGTH]; // Encrypted data is the rest

        // COPY DATA - Separate the components back into individual arrays
        System.arraycopy(combined, 0, salt, 0, 16);                                    // First 16 bytes = salt
        System.arraycopy(combined, 16, iv, 0, IV_LENGTH);                             // Next 12 bytes = IV
        System.arraycopy(combined, 16 + IV_LENGTH, encrypted, 0, encrypted.length);    // Rest = encrypted data

        // RECREATE THE ENCRYPTION KEY - Use same process as encryption
        PBEKeySpec spec = new PBEKeySpec(password.toCharArray(), salt, ITERATIONS, KEY_LENGTH);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        byte[] derivedKey = factory.generateSecret(spec).getEncoded();
        SecretKeySpec secretKey = new SecretKeySpec(derivedKey, "AES");

        // SETUP DECRYPTION - Same cipher configuration as encryption
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        GCMParameterSpec gcmSpec = new GCMParameterSpec(TAG_LENGTH * 8, iv);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, gcmSpec);  // DECRYPT_MODE instead of ENCRYPT_MODE

        // DECRYPTION - Convert encrypted bytes back to original text
        byte[] decrypted = cipher.doFinal(encrypted);
        // GCM mode automatically verifies the authentication tag during decryption

        // RETURN ORIGINAL API KEY - Convert bytes back to string
        return new String(decrypted);
    }
}