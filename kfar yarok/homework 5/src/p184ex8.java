import java.util.*;


public class p184ex8 {
    static int smallDivider(int num1, int num2) {
        int check;
        if (num1 > num2) {
            check = num2;
        } else {
            check = num1;
        }
        for (int i = 2; i <= check; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return -1;
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int counter = 0;
        int num1, num2;
        for (int i = 0; i < 20; i++) {
            System.out.println("Please enter a pair of numbers: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            if (smallDivider(num1, num2) == -1) {
                counter++;
            }
        }
        System.out.println("" + counter);
    }
}