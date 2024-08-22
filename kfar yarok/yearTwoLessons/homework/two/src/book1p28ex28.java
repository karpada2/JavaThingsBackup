public class book1p28ex28 {

    public static void printMathSeries(int a1, int d, int n) {
        int amountChecked = (a1/d)+1;

        if (amountChecked <= n) {
            System.out.println(a1);
            printMathSeries(a1+d, d, n);
        }
    }

    public static void main(String[] args) {
        printMathSeries(2,3,10);
    }
}
