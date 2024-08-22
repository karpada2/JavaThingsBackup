import java.util.*;

public class p184ex5B {
    static int Random(int num1, int num2) {
        return rand.nextInt(num1, num2);
    }
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        while (x != -999 && y != -999) {
            for (int i = 0; i <= 5; i++) {
                System.out.println(Random(x, y));
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
    }
}