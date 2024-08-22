import java.util.*;

public class ex36 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input a series of positive integers that end in 0");
        int pre_n = sc.nextInt();
        int n = sc.nextInt();
        int counter = 0;
        int big_combo = 0;
        while (n != 0) {
            if (n != 0) {
                if (n > pre_n) {
                    counter++;
                    if (counter > big_combo) {
                        big_combo = counter;
                    }
                }
                else {
                    counter = 0;
                }
                pre_n = n;
                n = sc.nextInt();
            }

        }
        System.out.println(big_combo);
    }
}