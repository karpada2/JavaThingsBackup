import java.util.*;

public class ex7 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int temp;
        System.out.println("Please enter any number: ");
        int n = 18;//sc.nextInt();
        System.out.println("Please enter any number: ");
        int m = 30;//sc.nextInt();
        while (m != 0) {
            temp = m;
            m = n%m;
            n = temp;
        }
        System.out.println("" + n);
    }
}