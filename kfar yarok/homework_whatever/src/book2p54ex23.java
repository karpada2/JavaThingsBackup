public class book2p54ex23 {
    public static boolean balancedArray(int[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float average = sum/arr.length;
        int biggerAverage = 0;
        int smallerAverage = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                biggerAverage++;
            }
            else if (arr[i] < average) {
                smallerAverage++;
            }
        }
        return smallerAverage == biggerAverage;
    }

    public static void main(String[] args) {
        int[] arr = {16,17};
        System.out.println("" + balancedArray(arr));
    }
}
