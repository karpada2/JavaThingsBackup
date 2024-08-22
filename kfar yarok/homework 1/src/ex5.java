import java.util.*;

public class ex5 {

    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your age as a whole number: ");
        int age = sc.nextInt();
        System.out.println("Days: " + age*365);
        System.out.println("Days: " + age*8760);
    }
}