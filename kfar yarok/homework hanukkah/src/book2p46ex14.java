import java.util.*;

public class book2p46ex14 {
    public static boolean halvesEven(int[] arr) {
        int halfLength = arr.length/2;
        for (int i = 0; i < halfLength; i++) {
            if (arr[i] != arr[i+halfLength]) {
                return false;
            }
        }
        return true;
    }


    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter desired array length: ");
        int length = sc.nextInt();
        while (!(length%2 == 0)) {
            System.out.println("Please enter desired array length: ");
            length = sc.nextInt();
        }
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter next number: ");
            arr[i] = sc.nextInt();
        }
        if (halvesEven(arr)) {
            System.out.println("Half");
        }
    }
}