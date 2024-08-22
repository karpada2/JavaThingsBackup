import java.util.Scanner;

public class ex7 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the ball's height from the ground: ");
        int groundHeight = sc.nextInt();
        System.out.println("Please enter the ball's new height: ");
        int newGroundHeight = sc.nextInt();
        if (newGroundHeight > groundHeight) {
            System.out.println("The ball is ascending");
        }
        else {
            System.out.println("The ball is falling");
        }
    }
}