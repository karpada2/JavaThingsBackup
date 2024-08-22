public class p133ex17 {

    public static int count(Stack<Integer> s){ //used an array cuz couldnt figure out any other way
        int counter = 0;
        Stack<Integer> temp1 = new Stack<>();
        while(!s.isEmpty()){
            temp1.push(s.pop());
            counter++;
        }
        while(!temp1.isEmpty()){
            s.push(temp1.pop());
        }
        return counter;
    }

    public static int[] StackToArr(Stack<Integer> s){
        int count = count(s);
        int[] arr = new int[count];
        for(int i = 0; i < arr.length-1; i++){
            arr[i] = s.pop();
        }
        return arr;
    }

    public static int findLongestAscendingStreak(int[] input) {
        if (input == null || input.length == 0) {
            return 0;
        }

        int longestStart = 0;
        int longestLength = 1;
        int currentStart = 0;
        int currentLength = 1;

        for (int i = 1; i < input.length; i++) {
            if (input[i] > input[i - 1]) {
                currentLength++;
                if (currentLength > longestLength) {
                    longestStart = currentStart;
                    longestLength = currentLength;
                }
            }
            else {
                currentStart = i;
                currentLength = 1;
            }

        }

        return longestLength;
    }

}
