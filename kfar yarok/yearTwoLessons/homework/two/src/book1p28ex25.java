public class book1p28ex25 {

    public static void printAllDividers(int num, int currentCheck) {

        int topCheck = (int)(Math.sqrt(num))+1;

        if (num % currentCheck == 0) {
            System.out.println(currentCheck);
            System.out.println(num/currentCheck + "\n");
        }

        if (currentCheck < topCheck) {
            printAllDividers(num, currentCheck+1);
        }

    }

    public static void printAllDividers(int num) {
        printAllDividers(num, 1);
    }

    public static void main(String[] args) {
        printAllDividers(36);
    }
}
