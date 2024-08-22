public class Board {
    private int[][] numero;

    private boolean[][] boomBoom;

    private void zeroBoomBoom(int length, int arrLength) {
        boomBoom = new boolean[length][arrLength];

        for (int i = 0; i < boomBoom.length; i++) {
            for (int j = 0; j < boomBoom[i].length; j++) {
                boomBoom[i][j] = false;
            }
        }
    }

    private static int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }


    private static void shuffleBoom(boolean[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rand = random(0, arr.length-1);
            boolean temp = arr[rand];
            arr[rand] = arr[i];
            arr[i] = temp;
        }
    }

    private void shuffleBoomComplete() {
        for (int i = 0; i < boomBoom.length; i++) {
            shuffleBoom(boomBoom[i]);
        }

        for (int i = 0; i < boomBoom.length; i++) {
            int rand = random(0, boomBoom.length-1);
            boolean[] temp = boomBoom[rand];
            boomBoom[rand] = boomBoom[i];
            boomBoom[i] = temp;
        }
    }

    private void prepareBoomBoard(int mineCount, int length, int arrLength) {
        zeroBoomBoom(length, arrLength);

        for (int i = 0; i < boomBoom.length; i++) {
            int minesToBePut = (mineCount)/(boomBoom[i].length - i);
            mineCount -= minesToBePut;
            for (int j = 0; j < minesToBePut; j++) {
                boomBoom[i][j] = true;
            }
        }

        shuffleBoomComplete();


    }

    private int numberOn(int arrIndex, int index) { //-1 means it is bomb, otherwise normal

        if (boomBoom[arrIndex][index]) {
            return -1;
        }

        int[][][] surroundingIndexes = {
                {
                        {arrIndex-1, index-1},
                        {arrIndex-1, index},
                        {arrIndex-1, index+1}
                },
                {
                        {arrIndex, index-1},
                        {arrIndex, index+1}
                },
                {
                        {arrIndex+1, index-1},
                        {arrIndex+1, index},
                        {arrIndex+1, index+1}
                },
        };
        int count = 0;

        for (int i = 0; i < surroundingIndexes.length; i++) {
            for (int j = 0; j < surroundingIndexes[i].length; j++) {
                //this if makes sure the indexes are in bounds
                // makes sure in points to a 0 or more index                                   makes sure non of the indexes pass the arr length
                if (surroundingIndexes[i][j][0] >= 0 && surroundingIndexes[i][j][1] >= 0 && surroundingIndexes[i][j][0] < boomBoom.length && surroundingIndexes[i][j][1] < boomBoom[i].length) {
                    count += boomBoom[surroundingIndexes[i][j][0]][surroundingIndexes[i][j][1]] ? 1 : 0;
                }
            }
        }

        return count;
    }

    private void zeroNumero() {
        numero = new int[boomBoom.length][boomBoom[1].length];

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                numero[i][j] = 0;
            }
        }
    }

    private void makeNumero() {
        zeroNumero();
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                numero[i][j] = numberOn(i, j);
            }
        }
    }

    public String toString() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < boomBoom.length; i++) {
            out.append("[");
            for (int j = 0; j < boomBoom[i].length; j++) {
                if (j != boomBoom[i].length - 1) {
                    out.append(boomBoom[i][j] + ",");
                } else {
                    out.append(boomBoom[i][j]);
                }
            }
            out.append("],\n");
        }
        return out.toString();
    }
}
