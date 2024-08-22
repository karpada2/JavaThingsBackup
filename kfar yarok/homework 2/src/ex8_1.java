import java.util.*;

public class ex8_1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int repeats = 1;
        int fib1 = 0;
        int fib2 = 1;
        int temp;
        System.out.println("Please enter any number");
        int N = sc.nextInt();
        while (repeats != N) {
            repeats += 1;
            temp = fib2;
            fib2 = fib2+fib1;
            fib1 = temp;
        }
        System.out.println("" + fib2);
    }
}