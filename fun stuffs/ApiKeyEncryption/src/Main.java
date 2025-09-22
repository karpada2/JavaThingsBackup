import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String pass = "yantiParazi";
        pass = pass + "=".repeat((4 - pass.length() % 4) % 4);
        System.out.println("Enter API Key: ");
        String apiKey = sc.nextLine();

        String encryptedKey = APIKeyEncryptor.encryptAPIKey(apiKey, pass);

        System.out.println("Password hash:  " + Arrays.toString(SHA_256(Base64.getDecoder().decode(pass))));

        System.out.println("Encrypted key: \"" + encryptedKey + "\"");
        System.out.println("Decrypted key: " + APIKeyEncryptor.decryptAPIKey(encryptedKey, pass));
        System.out.println("Original Key:  " + apiKey);
    }

    public static byte[] SHA_256(byte[] input) {
        try {
            return MessageDigest.getInstance("SHA-256").digest(input);
        }
        catch (Exception e) {
            System.out.println("should not happen");
        }
        return null;
    }
}