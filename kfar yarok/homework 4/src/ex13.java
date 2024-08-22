import java.util.Scanner;

public class ex13 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x;
        for (int i = 0; i<=5; i++) {
            System.out.println("Please enter any natural 2 digit number: ");
            x= sc.nextInt();
            if ((x/10)%2 == 0 && (x%10)%2 == 0) {
                System.out.println("The two digits are even");
            }
            else if ((x/10)%2 == 1 && (x%10)%2 == 1) {
                System.out.println("The two digits are odd");
            }
            else {
                System.out.println("One digit is odd and the other is even");
            }
        }
    }
}
