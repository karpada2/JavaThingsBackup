import java.util.*;

public class ex8 {

    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        int a = sc.nextInt();
        System.out.println("Please enter another number: ");
        int b = sc.nextInt();
        int a2 = b;
        int b2 = a;
        System.out.println("A = " + a + " B = " + b);
        System.out.println("Reversed A = " + a2 + " reversed B = " + b2);
    }
}