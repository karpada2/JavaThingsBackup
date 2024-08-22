import java.util.*;

public class book2p46ex18 {
    public static int[] randomArray(int Max, int Min) {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = Min + (int)(Math.random() * ((Max - Min) + 1));
        }
        return arr;
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter min value: ");
        int n1 = sc.nextInt();
        System.out.println("Please enter max value: ");
        int n2 = sc.nextInt();
        int[] array = randomArray(n2, n1);
        int streakAmount = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (i != 19 && ((array[i] == n1 && array[i+1] == n2) || (array[i] == n2 && array[i+1] == n1))) {
                streakAmount++;
            }
        }
        System.out.println("streak amount: " + streakAmount);
    }
}
