import java.util.Scanner;

public class book2p21ex6 {
    // טענת כניסה: סיסמה כלשהי
    // טענת יציאה: מחזיר מערך בוליאני, כאשר המקום האפס הוא 'נכון' אם הסיסמה באורך לא טוב, המקום האחד 'נכון' אם אין אות בסיסמה, והמקום השתיים 'נכון' אם אין מספר בסיסמה
    public static boolean[] validPassword(String password) {
        password = password.toLowerCase();
        boolean[] output = {false, true, true};
        if (password.length() < 6) {
            output[0] = true;
        }
        for (int i = 0; i < password.length(); i++) {
            if ((password.charAt(i) <= 'z' && password.charAt(i) >= 'a') || (password.charAt(i) <= 'Z' && password.charAt(i) >= 'A')) {
                output[1] = false;
            }
            if (password.charAt(i) <= '9' && password.charAt(i) >= '0') {
                output[2] = false;
            }
        }
        return output;
    }
    public static boolean isAllFalse(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                return false;
            }
        }
        return true;
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] passwordErrors = {"Bad length! length must be 6 or more!", "Password does not contain a letter!", "Password does not contain a number!"};
        System.out.println("Please enter password: ");
        String password = sc.nextLine();
        boolean valid = isAllFalse(validPassword(password));
        while (!valid) {
            for (int i = 0; i < passwordErrors.length; i++) {
                if (validPassword(password)[i]) {
                    System.out.println(passwordErrors[i]);
                }
            }
            System.out.println("Please enter password: ");
            password = sc.nextLine();
            valid = isAllFalse(validPassword(password));
        }
        System.out.println("Valid password!");
    }
}