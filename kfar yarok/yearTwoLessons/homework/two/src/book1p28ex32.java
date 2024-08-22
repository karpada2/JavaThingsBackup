public class book1p28ex32 {

    public static void printIfNextValueBigger(int[] arr, int indexToCheck) {
        if (arr[indexToCheck] < arr[indexToCheck+1]) {
            System.out.println(arr[indexToCheck]);
        }

        if (indexToCheck < arr.length-2) {
            printIfNextValueBigger(arr, indexToCheck+1);
        }
    }

    public static void printIfNextValueBigger(int[] arr) {
        printIfNextValueBigger(arr, 0);
    }

    public static void main(String[] args) {
        int[] arr = {1,17,27,15,875,146,62,34,53};
        printIfNextValueBigger(arr); //expected: 1,17,15,34
    }
}
