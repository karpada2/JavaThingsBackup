import java.util.*;

public class ex5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int grapefruit1 = 0;
        int grapefruit2 = 0;
        int grapefruit3 = 0;
        int weight;
        while (true) {
            System.out.println("Please enter the weight of the grapefruit");
            weight = sc.nextInt();
            if (weight >= 350 && weight < 450) {
                grapefruit1 += 1;
            }
            else if (weight >= 250 && weight < 350) {
                grapefruit2 += 1;
            }
            else {
                grapefruit3 += 1;
            }
            if (grapefruit1 == 5 || grapefruit2 == 7 || grapefruit3 == 10) {
                break;
            }
        }
        if (grapefruit1 == 5) {
            System.out.println("The first grapefruit crate got filled first!");
        }
        else if (grapefruit2 == 7) {
            System.out.println("The second grapefruit crate got filled first!");
        }
        else {
            System.out.println("The third grapefruit crate got filled first!");
        }
    }
}
