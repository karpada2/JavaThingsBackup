import java.util.*;

public class ex8 {

    public static int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static int SadCell (int[][] a, int num){
        for (int i = 1; i < a.length - 1; i++){
            for (int j = 1; j < (a[i].length) - 1; j++){
                if (a[i][j] == num){
                    if (a[i][j] == a[i - 1][j]){
                        return 1;
                    }
                    else if (a[i][j] == a[i - 1][j - 1]){
                        return 1;
                    }
                    else if (a[i][j] == a[i][j - 1]){
                        return 1;
                    }
                    else if (a[i][j] == a[i + 1][j - 1]){
                        return 1;
                    }
                    else if (a[i][j] == a[i - 1][j + 1]){
                        return 1;
                    }
                    else if (a[i][j] == a[i][j + 1]){
                        return 1;
                    }
                    else if (a[i][j] == a[i + 1][j]){
                        return 1;
                    }
                    else if (a[i][j] == a[i + 1][j + 1]){
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = random(1,200);
            }
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println("");
        }
        System.out.println("sad cell: " + SadCell(arr, 10));
    }
}
