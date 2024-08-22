import java.util.*;

public class book2p46x15 {
    public static int[] biggestArray(int[] a, int[] b, int[] c) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            if (a[i] > b[i]) {
                c[i] = a[i];
            }
            else if (b[i] > a[i]) {
                c[i] = b[i];
            }
            else c[i] = 0;
        }
        return c;
    }


//    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        final int TOP = 10;
        int[] a = new int[TOP];
        int[] b = new int[TOP];
        int[] c = new int[TOP];
//        for (int i = 0; i < TOP; i++) {
//            System.out.println("Please enter the " + (i+1) + " value in a: ");
//            a[i] = sc.nextInt();
//            System.out.println("Please enter the " + (i+1) + " value in b: ");
//            b[i] = sc.nextInt();
//        }
        c = biggestArray(a, b, c);
        for (int i = 0; i < c.length; i++) {
            System.out.println("" + c[i]);
        }
    }
}
