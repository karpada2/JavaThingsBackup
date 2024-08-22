import java.util.*;

public class book2p46ex17 {

    public static void productOrSumEqualNum(int[] a, int num) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]*a[j] == num || a[i]+a[j] == num) {
                    System.out.println("(" + a[i] + ", " + a[j] + ")");
                }
            }
        }
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter desired array length: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter next item in array: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Please enter any number: ");
        int num = sc.nextInt();
        productOrSumEqualNum(a, num);
    }
}
