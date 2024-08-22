public class book1p28ex29 {

    public static void printMathSeries(int a1, int d, int n, int amountPrinted) {
        if (amountPrinted <= n) {
            System.out.println(a1);
            printMathSeries(a1+d, d+1, n, amountPrinted+1);
        }
    }

    public static void printMathSeries(int n) {
        printMathSeries(1, 1,n,1);
    }

    public static void main(String[] args) {
        printMathSeries(7);
    }
}
