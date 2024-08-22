import java.util.*;

public class ex31 {
    static int digits(int n) {
        int d = 0;
        while (n != 0) {
            n /= 10; d++;
        }
        return d;
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 1;
        while (n != 0) {
            System.out.println("Please enter any number");
            n = sc.nextInt();
            System.out.println("The number of digits in your number is " + digits(n));
        }
    }
}