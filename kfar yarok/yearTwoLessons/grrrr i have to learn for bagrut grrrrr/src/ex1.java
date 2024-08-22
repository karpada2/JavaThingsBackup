public class ex1 {
    public static int absSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.abs(arr[i]);
        }
        return sum;
    }

    public static int[] biggerAbsSumArr(int[] arr) {
        int[] neg = new int[arr.length];
        int[] pos = new int[arr.length];
        for (int i = 0; i < neg.length; i++) {
            neg[i] = 0;
            pos[i] = 0;
        }
        int negIndex = 0;
        int posIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                pos[posIndex] = arr[i];
                posIndex++;
            }
            else if (arr[i] < 0) {
                neg[negIndex] = arr[i];
                negIndex++;
            }
        }
        if (absSum(pos) > absSum(neg)) {
            neg = new int[posIndex];
            for (int i = 0; i < neg.length; i++) {
                neg[i] = pos[i];
            }
            return neg;
        }
        else {
            pos = new int[negIndex];
            for (int i = 0; i < pos.length; i++) {
                pos[i] = neg[i];
            }
            return pos;
        }
    }

    public static void main(String[] args) {
        int[] test = {2, -3, 0, 4, 7, 1, 2, 0};
        test = biggerAbsSumArr(test);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }
}
