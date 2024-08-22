import java.util.*;

public class InputStringsThenItShuffle {

    static Scanner sc = new Scanner(System.in);

    public static String[] getStringsFromUser() {
        System.out.println("Input amount of strings needed");
        String[] arr = new String[sc.nextInt()];
        sc.nextLine();
        for (int i = 1; i <= arr.length; i++) {
            System.out.println("Input string #" + i);
            arr[i-1] = sc.nextLine();
        }
        return arr;
    }

    public static int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static<T> void shuffle(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int randResult = random(0, arr.length-1);
            T temp = arr[i];
            arr[i] = arr[randResult];
            arr[randResult] = temp;
        }
    }

    public static void main(String[] args) {
        String[] arr = getStringsFromUser();
        shuffle(arr);
        boolean[] correct = new boolean[arr.length];
        int amtCorrect = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println("Write 1 if you got it right, 0 otherwise");
            if (sc.nextInt() == 1) {
                correct[i] = true;
                amtCorrect++;
            }
        }
        System.out.println(amtCorrect + "/" + arr.length);
        System.out.println("You got these wrong:");
        for (int i = 0; i < arr.length; i++) {
            if (!correct[i]) {
                System.out.println(arr[i]);
            }
        }
    }

}
