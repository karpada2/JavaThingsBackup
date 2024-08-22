public class TestRandomlyPuttingEnemiesInRectangleForGame {

    public static int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static void print2DArray(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            System.out.print("[");
            for (int x = 0; x < arr[y].length; x++) {
                System.out.print(arr[y][x]);
                if (x + 1 < arr[y].length) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static void randomizeEnemyPositions(int[][] arr, int enemyAmount) {
        int placesLeft = 0;

        for (int y = 0; y < arr.length; y++) {
            placesLeft += arr[y].length;
            for (int x = 0; x < arr[y].length; x++) {
                arr[y][x] = 0;
            }
        }

        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (random(1, placesLeft) <= enemyAmount) {
                    arr[y][x] = 1;
                    enemyAmount--;
                }
                placesLeft--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[4][10];
        randomizeEnemyPositions(arr, 11);
        int enemiesActuallyPlaced = 0;
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (arr[y][x] == 1) {
                    enemiesActuallyPlaced++;
                }
            }
        }

        System.out.println(enemiesActuallyPlaced);
        print2DArray(arr);
    }
}
