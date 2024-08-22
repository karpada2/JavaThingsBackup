import java.util.*;
import java.lang.*;

public class ex16 {
    static long DigitSum(long n)
    {
        long sum = 0;
        while (n != 0) {
            sum += n%10;
            n /= 10;
        }
        return sum;
    }

    static void printSmallerNum(long num) {
        for (int i = 0; i < num; i++) {
            if (DigitSum(i) == DigitSum(num)) {
                System.out.println("" + i);
            }
        }
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long inpt = sc.nextInt();
        printSmallerNum(inpt);
    }
}