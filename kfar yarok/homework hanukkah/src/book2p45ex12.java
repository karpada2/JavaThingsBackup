import java.util.*;

public class book2p45ex12 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the desired length of the array: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter the next number in the array: ");
            array[i] = sc.nextInt();
        }
        int comapringInt = array[0];
        boolean same = true;
        for (int i = 1; i < length; i++) {
            if (same) {
                if (array[i] == comapringInt) {
                    same = true;
                }
                else {
                    same = false;
                }
            }
        }
        System.out.println(same);
    }
}