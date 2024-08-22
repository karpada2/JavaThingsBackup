import java.util.*;

public class prettyAverage {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Grade:");
        int[] gradeTotal = new int[2];
        gradeTotal[1] = sc.nextInt();
        int count = 1;
        while (gradeTotal[1] != -1) {
            gradeTotal[0] += gradeTotal[1];
            System.out.println("Grade:");
            gradeTotal[1] = sc.nextInt();
            count++;
        }
        System.out.println(gradeTotal[0]/count);

        int[] test = new int[4];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        test[0] = i;
                        test[1] = j;
                        test[2] = k;
                        test[3] = l;
                        int[] countDigits = new int[2];
                        for (int m = 0; m < test.length; m++) {
                            countDigits[test[m]]++;
                        }
                        if (countDigits[0] == countDigits[1]) {
                            System.out.println(test[0] + "" + test[1] + "" + test[2] + "" + test[3]);
                        }
                    }
                }
            }
        }
    }
}
