public class p133ex14 {

    public static int[] intToArr(int num) {
        int temp = num;
        int numLength = 0;
        while (num > 0) {
            numLength++;
            num /= 10;
        }
        num = temp;

        int[] returnArr = new int[numLength];

        for (int i = numLength-1; i >= 0; i--) {
            returnArr[i] = temp % 10;
            temp /= 10;
        }

        return returnArr;
    }

    //turns an array into a stack
    public static Stack<Integer> AtoS (int[] a){
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++){
            s.push(a[i]);
        }
        return s;
    }

    public static boolean isArrInStack(Stack<Integer> stackCheck, int[] arr) {
        Stack<Integer> temp = new Stack<Integer>();
        while (!stackCheck.isEmpty()) {
            if (stackCheck.top().equals(arr[0])) {
                boolean found = true;
                for (int i = 0; i < arr.length; i++) {
                    if (stackCheck.isEmpty()) {
                        return false;
                    }
                    temp.push(stackCheck.pop());
                    if (!temp.top().equals(arr[i])) {
                        found = false;
                    }
                }

                while (!temp.isEmpty()) {
                    stackCheck.push(temp.pop());
                }

                if (found) {
                    return true;
                }
            }

            stackCheck.pop();
        }

        return false;
    }

    public static boolean isNumInStack (Stack<Integer> s, int n1){
        Stack<Integer> temp = new Stack<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> reverseStack = new Stack<Integer>();

        while (!s.isEmpty()) {
            reverseStack.push(s.top());
            temp.push(s.pop());
        }

        while (!temp.isEmpty()) {
            s.push(temp.top());
            stack.push(temp.pop());
        }

        int[] arrNum = intToArr(n1);

        if (isArrInStack(stack, arrNum) || isArrInStack(reverseStack, arrNum)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,4,5,6,7,8,9};
        boolean d = isNumInStack(AtoS(a),123);
        System.out.println(d);
    }
}
