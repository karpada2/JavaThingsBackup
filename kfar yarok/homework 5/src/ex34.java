import java.util.*;

public class ex34 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter a number and a digit: ");
        int number = sc.nextInt();
        int digit = sc.nextInt();
        int changedNum = number;
        while (changedNum%10 != digit && changedNum >= 10) {
            changedNum /= 10;
        }
        if (changedNum%10 != digit) {
            System.out.println("" + (number*10+digit));
        }
        else {
            System.out.println("" + number);
        }
    }
}