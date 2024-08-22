public class book1p27ex14 {
    public static int sumUntil(int[] arr, int untilIndex, int currentIndex, int sum) { //recursive function
        if (currentIndex == untilIndex) {
            return sum + arr[currentIndex];
        }
        sum +=  arr[currentIndex];
        return sumUntil(arr, untilIndex, currentIndex+1, sum);
    }

    public static int sumUntil(int[] arr, int untilIndex) { //wrapper function
        return sumUntil(arr, untilIndex, 0, 0);
    }

    public static void main(String[] args) {
        int[] arr = {2,51,7,3,21};
        System.out.println(sumUntil(arr, 4));
    }
}
