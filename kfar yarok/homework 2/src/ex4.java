import java.util.*;

public class ex4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter any number");
        int s = sc.nextInt();
        while (s >= 10) {
            int i = s;
            s = 0;
            while (i != 0) {
                s += i%10;
                i /= 10;
            }
        }
        System.out.println("" + s);
    }
}