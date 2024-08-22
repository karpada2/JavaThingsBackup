public class book1p27ex15 {
    public static int countUntil(int[] arr, int untilIndex, int currentIndex, int amount) { //recursive function
        if (arr[currentIndex] > 0) {
            amount++;
        }

        if (currentIndex == untilIndex) {
            return amount;
        }

        return countUntil(arr, untilIndex, currentIndex+1, amount);
    }

    public static int countUntil(int[] arr, int untilIndex) { //wrapper function
        return countUntil(arr, untilIndex, 0, 0);
    }

    public static void main(String[] args) {
        int[] arr = {2, -1, 0, 6, 1, -241};
        System.out.println(countUntil(arr, 3));
    }
}
