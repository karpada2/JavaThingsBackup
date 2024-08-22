import java.util.Scanner;

public class ex12a {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter any whole number: ");
        int Low = sc.nextInt();
        System.out.println("Please enter any whole number: ");
        int High = sc.nextInt();
        for (; Low<=High; Low++) {
            System.out.println("" + Low);
        }
    }
}
