public class balance {
    public static boolean isBalanced(int[] arr) {
        int middleIndex = arr.length/2;
        for (int i = 0; i < middleIndex; i++) {
            if (arr[i] <= arr[middleIndex]) {
                return false;
            }
        }
        for (int i = middleIndex+1; i < arr.length; i++) {
            if (arr[i] >= arr[middleIndex]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = new String[15];
        System.out.println(arr[2]);
    }
}