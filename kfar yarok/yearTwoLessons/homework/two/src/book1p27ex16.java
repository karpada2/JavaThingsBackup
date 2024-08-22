public class book1p27ex16 {
    public static int isExist(int[] arr, int num, int currentIndex) { //recursive function

        if (arr[currentIndex] == num) {
            return currentIndex;
        }

        if (currentIndex == arr.length-1) {
            return -1;
        }

        return isExist(arr, num, currentIndex+1);
    }

    public static int isExist(int[] arr, int num) { //wrapper function
        return isExist(arr, num, 0);
    }

    public static void main(String[] args) {
        int[] arr = {65,2,7,1,-2,61,2};
        System.out.println(isExist(arr, 8));
    }
}
