public class book1p28ex24 {
    public static void printFromCharToChar(char char1, char char2) {

        if (char1 == char2) {
            System.out.println(char1);
        }

        if (char1 < char2) {
            System.out.println(char1);
            printFromCharToChar((char)(char1+1), char2);
        }

        if (char2 < char1) {
            System.out.println(char2);
            printFromCharToChar(char1, (char)(char2+1));
        }
    }

    public static void main(String[] args) {
        printFromCharToChar('z', 'a');
    }
}
