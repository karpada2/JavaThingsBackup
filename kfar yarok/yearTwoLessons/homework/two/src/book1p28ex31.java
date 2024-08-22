public class book1p28ex31 {

    public static void printEvenIndexValue(int[] arr, int indexToCheck) {
        if (indexToCheck % 2 == 0) {
            System.out.println(arr[indexToCheck]);
        }

        if (indexToCheck < arr.length-1) {
            printEvenIndexValue(arr, indexToCheck+1);
        }
    }

    public static void printEvenIndexValue(int[] arr) {
        printEvenIndexValue(arr, 0);
    }

    public static void main(String[] args) {
        int[] arr = {1,67,27,15,875,146,62,34,53};
        printEvenIndexValue(arr); //expected: 1,27,875,62,53
    }
}
