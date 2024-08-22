import java.util.Scanner;

public class ex14 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input a number: ");
        int num = sc.nextInt();
        if (num/100 == num%10) {
            System.out.println("Your number is a palindrome");
        }
        else {
            System.out.println("Your number isn't a palindrome");
        }
    }
}