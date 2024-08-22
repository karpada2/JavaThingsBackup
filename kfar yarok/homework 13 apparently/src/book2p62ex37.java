import java.util.*;

public class book2p62ex37 {
    public static int maxIndex(int[] arr) {
        int maxIndex = 0;
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    static Scanner sc = new Scanner(System.in);
    public static void grades() {
        int[] commonRanges = new int[10]; //index 0 is 0-9, index 1 is 10-19, 2: 20-29,3:30-39,4:40-49,5:50-59,6:60-69,7:70-79,8:80-89,9:90-100
        int[] gradeCounter = new int[101];
        int input;
        for (int i = 0; i < 200; i++) {
            System.out.println("Please enter your grade: ");
            input = sc.nextInt();
            gradeCounter[input]++;
            if (input <= 9) {
                commonRanges[0]++;
            } else if (input <= 19) {
                commonRanges[1]++;
            } else if (input <= 29) {
                commonRanges[2]++;
            } else if (input <= 39) {
                commonRanges[3]++;
            } else if (input <= 49) {
                commonRanges[4]++;
            } else if (input <= 59) {
                commonRanges[5]++;
            } else if (input <= 69) {
                commonRanges[6]++;
            } else if (input <= 79) {
                commonRanges[7]++;
            } else if (input <= 89) {
                commonRanges[8]++;
            } else {
                commonRanges[9]++;
            }
        }
        for (int i = 100; i >= 0; i--) {
            if (gradeCounter[i] != 0) {
                System.out.println(gradeCounter[i] + " Students got " + i);
            }
        }
        if (maxIndex(commonRanges) == 9) {
            System.out.println("The most common range of grades is: 90-100");
        } else {
            System.out.println("The most common range of grades is: " + maxIndex(commonRanges)*10 + "-" + maxIndex(commonRanges)*10+9);
        }
    }

    public static void main(String[] args) {
        grades();
    }
}
