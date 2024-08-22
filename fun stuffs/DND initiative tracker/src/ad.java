import java.util.*;
public class ad {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("num: " + arr[i]);
        }
    }
}
