import java.util.*;

public class ex6 {

    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the amount of hours you worked in day shift: ");
        int x = sc.nextInt();
        System.out.println("Please enter the amount of hours you worked in night shift: ");
        int y = sc.nextInt();
        System.out.println("this month's wage:" + (18*x + 27.5*y));
    }
}