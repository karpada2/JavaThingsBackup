import java.util.*;

public class ex35 {
    static boolean Similar(int num1, int num2) {
        int permanent = num2;
        if (num2 == num1) {
            return true;
        }
        num2 = num2 % 10;
        if (num2 == (num1/10)%10) {
            num2 = (permanent/10)%10;
            if (num2 == num1%10) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }

    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        int counter = 0;
        while (num2 != 0 && num1 != 0) {
            System.out.println("Please input two positive integers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            if (num1 != 0 && num2 != 0) {
                System.out.println(Similar(num1, num2));
                if (Similar(num1, num2)) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}