public class ex4 {
    public static int amountOfAppearances(int[][] arr) {
        int counter = -1;
        int num = arr[arr.length/2][arr.length/2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == num) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {

    }
}