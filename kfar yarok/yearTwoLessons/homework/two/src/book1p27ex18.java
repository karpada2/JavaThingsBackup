public class book1p27ex18 {
    public static boolean isPrime(int num) {
        if (num > 2 && num % 2 == 0) {
            return false;
        }

        int maxToCheck = (int)(Math.sqrt(num))+1;

        for (int i = 3; i < maxToCheck; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean noPrimes(int[] arr, int currentIndex) {
        if (currentIndex == arr.length-1) {
            if (!isPrime(arr[currentIndex])) {
                return true;
            } else {
                return false;
            }
        }

        if (!isPrime(arr[currentIndex])) {
            return noPrimes(arr, currentIndex+1);
        } else {
            return false;
        }
    }

    public static boolean noPrimes(int[] arr) {
        return noPrimes(arr, 0);
    }

    public static void main(String[] args) {
        int[] arr = {4,8,12,6453};
        System.out.println(noPrimes(arr));
    }
}
