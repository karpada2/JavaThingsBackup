import java.util.*;

public class book2p62ex35 {

    public static int biggestIndex(int[] arr) {
        int maxIndex = 0;
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    static Scanner sc = new Scanner(System.in);
    public static void CulturalRevolution() {
        int[] showCounter = new int[16];
        int showNumber = 1;
        while (showNumber != 0) {
            System.out.println("Please enter wanted show's number(1-15): ");
            showNumber = sc.nextInt();
            if (showNumber != 0) {
                System.out.println("Please enter the amount of tickets for wanted show(natural numbers only): ");
                showCounter[showNumber] += sc.nextInt();
            }
        }

            for (int i = 1; i < showCounter.length; i++) {
                System.out.println("Tickets needed for show number " + i + ": " + showCounter[i]);
            }
            System.out.println("And the show with the most tickets needed is show number " + biggestIndex(showCounter));
    }

    public static void main(String[] args) {
        CulturalRevolution();
    }
}