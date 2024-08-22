import java.util.Scanner;

public class ex13 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input three numbers in a mathematical series");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n2-n1 == n3-n2) {
            System.out.println("Your numbers are a mathematical series");
        }
        else {
            System.out.println("Your numbers are not a mathematical series");
        }
    }
}