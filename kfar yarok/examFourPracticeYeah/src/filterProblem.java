public class filterProblem {
    public static int[] filter(int[] arr, int num) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                length++;
            }
        }
        int newIndex = 0;
        int[] newArr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }
        return newArr;
    }
}
