import java.util.*;

public class part1q1finals2021 {
    public static int[] filter(int[] arr, int num) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                length++;
            }
        }
        int[] filteredArray = new int[length];
        int filterIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                filteredArray[filterIndex] = arr[i];
                filterIndex++;
            }
        }
        return filteredArray;
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the desired length of the array: ");
        int length = sc.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please enter the next number in the array: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Please enter number you want to remove: ");
        int num = sc.nextInt();
        int[] newArray = filter(array, num);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ", ");
        }
    }
}
