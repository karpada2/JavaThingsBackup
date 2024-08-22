import java.util.Scanner;

public class ex12 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String operator;
        System.out.println("Please enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter another number: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter an operator(- or +): ");
        sc.nextLine();
        operator = sc.nextLine();
        if (operator.equals("-")) {
            System.out.println("" + num1 + " - " + num2 + " = " + (num1-num2));
        }
        else {
            System.out.println("" + num1 + " + " + num2 + " = " + (num1+num2));
        }
    }
}
