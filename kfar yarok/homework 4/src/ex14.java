import java.util.Scanner;
import java.util.Random;

public class ex14 {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args) {
        System.out.println("Enter a number between 10 and 20: ");
        int x = sc.nextInt();
        int r;
        for (int i = 0; i < 5; i++) {
            r = random.nextInt(20-10+1)+10;
            if (Math.abs(x-r) <=4) {
                System.out.println(r + "True ");
            }
        }
    }
}
