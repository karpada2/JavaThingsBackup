public class book2p21ex7 {
    //טענת כניסה: מחרוזת
    //טענת יציאה: הפעולה מדפיסה את כל האותיות העוקבוצ שצמודות
    public static void lexiconOrderedLetters(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                if (str.charAt(i)+1 == str.charAt(i+1)) {
                    System.out.println(str.charAt(i) + ", " + str.charAt(i+1));
                }
            }
        }
    }

    public static void main(String[] args) {
        lexiconOrderedLetters("$5cd#nm$uvw");
    }
}
