import java.util.*;

public class ex3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter any number: ");
        int N = sc.nextInt();
        System.out.println("Please enter a digit(0-9): ");
        int digit = sc.nextInt();
        while (N%10 != digit) {
            if (N/10 < 1) {
                break;
            }
            N /= 10;
        }
        if (N%10 == digit) {
            System.out.println("The number " + N + " does contain the digit " + digit);
        }
        else if (N%10 != digit) {
            System.out.println("The number " + N + " doesn't contain the digit " + digit);
        }
    }
}
