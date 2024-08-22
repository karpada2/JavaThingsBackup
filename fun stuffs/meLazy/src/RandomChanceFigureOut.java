import java.util.*;

public class RandomChanceFigureOut {

    static Scanner sc = new Scanner(System.in);

    public static int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static void resetArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    // arr is a counter array
    public static int areThereTargetAmountOfSame(int[] arr, int target) {
        int biggestIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[biggestIndex]) {
                biggestIndex = i;
            }
        }
        return (arr[biggestIndex] >= target) ? 1:0;
    }

    public static void main(String[] args) {
        int timesToRepeat = 10_000_000;
        int timesThereHaveBeen13OfSame = 0;
        int peopleWhoAnswered = sc.nextInt();
        int targetAmountOfPeople = sc.nextInt();
        int[] counterOfResults = new int[4];
        for (int i = 0; i < timesToRepeat; i++) {
            for (int j = 0; j < peopleWhoAnswered; j++) {
                counterOfResults[random(0, counterOfResults.length-1)]++;
            }
            timesThereHaveBeen13OfSame += areThereTargetAmountOfSame(counterOfResults, targetAmountOfPeople);
            resetArr(counterOfResults);
        }

        System.out.println("Chance: " + ((float)(timesThereHaveBeen13OfSame)/(float)(timesToRepeat))*100 + "%");
    }

}
