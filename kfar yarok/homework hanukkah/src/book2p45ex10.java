import java.util.*;

public class book2p45ex10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the desired length of the array: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter the next number in the array: ");
            array[i] = sc.nextInt();
        }
        int sumEven = 0;
        int sumUneven = 0;
        for (int i = 0; i < length; i++) {
            if (i%2 == 0) {
                sumEven += array[i];
            }
            else {
                sumUneven += array[i];
            }
        }
        if (sumEven ==  sumUneven) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}