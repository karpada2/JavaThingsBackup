public class book1p27ex20 {
    public static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static boolean areTwoElementsEqual(int[] arr, int index1, int index2) {
        return arr[index1] == arr[index2];
    }

    public static boolean isPalindromeBetweenIndexes(int[] arr, int startIndex, int endIndex, int firstCurrentIndex, int secondCurrentIndex) {
        if (firstCurrentIndex == startIndex || secondCurrentIndex == endIndex) {
            if (areTwoElementsEqual(arr, firstCurrentIndex, secondCurrentIndex)) {
                return true;
            } else {
                return false;
            }
        }

        if (areTwoElementsEqual(arr, firstCurrentIndex, secondCurrentIndex)) {
            return isPalindromeBetweenIndexes(arr, startIndex, endIndex, firstCurrentIndex - 1, secondCurrentIndex + 1);
        }

        return false;
    }

    public static boolean isPalindromeBetweenRandomIndexes(int[] arr) {
        int randLow = random(0, arr.length-1);
        int randHigh = random(1, arr.length-1);
        if (randLow > randHigh) {
            int swapHolder = randHigh;
            randHigh = randLow;
            randLow = swapHolder;
        }

        int randsDifference = randHigh-randLow;

        System.out.println(randLow);
        System.out.println(randHigh);

        if ((randHigh-randLow+1)%2 == 0) {
            return isPalindromeBetweenIndexes(arr, randLow, randHigh, randsDifference-1, randsDifference);
        } else {
            return isPalindromeBetweenIndexes(arr, randLow, randHigh, randsDifference-1,randsDifference+1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        System.out.println(isPalindromeBetweenRandomIndexes(arr));
    }
}
