import java.util.*;

public class book2p47ex21 {
    public static int[] actionToResult(int[] action) {
        int[] result = new int[action.length/3];
        int resultIndex = 0;
        for (int i = 0; i < action.length; i+=3) {
            if (action[i] == 1) {
                result[resultIndex] = action[i+1] + action[i+2];
            } else {
                result[resultIndex] = action[i+1] * action[i+2];
            }
            resultIndex++;
        }
        return result;
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter length of array: ");
        int n = sc.nextInt();
        int[] action = {1,6,2,2,61,2,1,63,1};
        int[] result = actionToResult(action);
        for (int i = 0; i < result.length; i++) {
            System.out.println("" + result[i]);
        }
    }
}
