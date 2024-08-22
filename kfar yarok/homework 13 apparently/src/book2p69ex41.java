import java.util.*;

public class book2p69ex41 {
    static Scanner sc = new Scanner(System.in);
    public static void printEvenAndUneven(int N) {
        int[] arr = new int[N];
        int amountOfEvens = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Enter next element in array: ");
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                amountOfEvens++;
            }
        }
        int[] evenArr = new int[amountOfEvens];
        int[] unevenArr = new int[N-amountOfEvens];
        int evenIndex = 0;
        int unevenIndex = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[evenIndex] = arr[i];
                evenIndex++;
            } else {
                unevenArr[unevenIndex] = arr[i];
                unevenIndex++;
            }
        }
        System.out.println("Printing evens: ");
        for (int i = 0; i < evenArr.length; i++) {
            System.out.println("" + evenArr[i]);
        }
        System.out.println("Printing unevens: ");
        for (int i = 0; i < unevenArr.length; i++) {
            System.out.println("" + unevenArr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter wanted length of array: ");
        printEvenAndUneven(sc.nextInt());
    }
}
