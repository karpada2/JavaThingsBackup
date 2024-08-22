import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int biggestIndex(double[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args) {
        int numBooks = sc.nextInt();
        int money = sc.nextInt();
        int[] bookCost = new int[numBooks];
        int[] BookPageNum = new int[numBooks];
        for (int i = 0; i < numBooks; i++) {
            bookCost[i] = sc.nextInt();
        }
        for (int i = 0; i < numBooks; i++) {
            BookPageNum[i] = sc.nextInt();
        }
        double[] ratios = new double[numBooks]; //pages for 1 money
        for (int i = 0; i < numBooks; i++) {
            ratios[i] = (double)(BookPageNum[i])/bookCost[i];
        }
        int totalPages = 0;
        while (money > bookCost[biggestIndex(ratios)]) {
            if (money > bookCost[biggestIndex(ratios)]) {
                money -= bookCost[biggestIndex(ratios)];
                totalPages += BookPageNum[biggestIndex(ratios)];
                ratios[biggestIndex(ratios)] = 0;
            }
        }
        System.out.println(totalPages);
    }
}