import java.util.*;

public class book2p46ex13 {
    public static boolean ascending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter desired array length: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter next number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("" + ascending(arr));
    }
}