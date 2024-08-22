import java.util.*;
import java.lang.*;

public class Question_A {
    static boolean doubleDigit(int n) {
        int permanent = n;
        int n2; // n2 becomes last digit and goes over whole number
        while (n >= 10) {
            n2 = permanent%10;
            n /= 10;
            if (n2 == n%10) {
                return true;
            }
        }
        return false;
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter any number: ");
        System.out.println("" + doubleDigit(sc.nextInt()));
    }
}