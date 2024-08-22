import java.util.*;

public class ex1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int gen = 0;
        System.out.println("Please enter the amount of germs currently existing: ");
        int num = sc.nextInt();
        System.out.println("Please enter the maximum amount of germs: ");
        int limit = sc.nextInt();
        while (num <= limit) {
            gen = gen + 1;
            num = num * 2;
        }
        System.out.print(gen);
    }
}