public class book1p27ex17 {
    public static boolean isSorted(int[] arr, int currentIndex) {
        if (arr.length == 1) {
            return true;
        }

        if (currentIndex == arr.length-1) {

            if (arr[currentIndex] >= arr[currentIndex-1]) {
                return true;
            } else {
                return false;
            }

        }

        if (arr[currentIndex] <= arr[currentIndex+1]) {
            return isSorted(arr, currentIndex+1);
        }

        return false;
    }

    public static boolean isSorted(int[] arr) {
        return isSorted(arr, 0);
    }

    public static void main(String[] args) {
        int[] arr = {-2,0,1,4,4,7,21676};
        System.out.println(isSorted(arr));
    }
}
