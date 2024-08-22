import java.util.Scanner;

public class ex42 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the four bids: ");
        int bid1 = sc.nextInt();
        int bid2 = sc.nextInt();
        int bid3 = sc.nextInt();
        int bid4 = sc.nextInt();
        if (bid1 > bid2 && bid1 > bid3 && bid1 > bid4) {
            System.out.println("" + bid1);
        } else if (bid2 > bid1 && bid2 > bid3 && bid2 > bid4) {
            System.out.println("" + bid2);
        } else if (bid3 > bid1 && bid3 > bid2 && bid3 > bid4) {
            System.out.println("" + bid3);
        }
        else {
            System.out.println("" + bid4);
        }
    }
}