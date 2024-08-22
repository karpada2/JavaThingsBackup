import  java.util.*;

public class book2p62ex36 {
    public static int biggestIndex(int[] arr) {
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
    public static void workerElection(int num) {
        int[] arr = new int[num];
        int currentWorker = 0;
        while (currentWorker != -999) {
            System.out.println("Please enter current worker number: ");
            currentWorker = sc.nextInt();
            if (currentWorker != -999) {
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("Please enter 1 if you support candidate number " + i + " or 0 if you don't: ");
                    arr[i] += sc.nextInt();
                }
            }
        }
        System.out.println("The winning candidate is candidate number " + biggestIndex(arr) + " with " + arr[biggestIndex(arr)] + " Votes!");
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float average = sum/num;
        System.out.println("Candidates with below average votes: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                System.out.println("candidate number " + i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter how many candidates there are: ");
        workerElection(sc.nextInt());
    }
}
