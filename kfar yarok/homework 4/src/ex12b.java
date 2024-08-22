import java.util.Scanner;

public class ex12b {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter any whole number: ");
        int x = sc.nextInt();
        System.out.println("Please enter any whole number: ");
        int y = sc.nextInt();
        if (x < y) {
            for (; x <= y; x++) {
                System.out.println("" + x);
            }
        }
        else {
            for (; y <= x; y++) {
                System.out.println("" + y);
            }
        }
    }
}
