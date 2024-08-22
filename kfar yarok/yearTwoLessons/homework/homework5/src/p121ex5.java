public class p121ex5 {
    public static boolean descendingStack(Stack<Integer> s) {
        Stack<Integer> temp = new Stack<Integer>();
        Stack<Integer> mainStack = new Stack<Integer>();

        while (!s.isEmpty()) {
            temp.push(s.pop());
        }

        while (!temp.isEmpty()) {
            s.push(temp.top());
            mainStack.push(temp.pop());
        }

        int lastInt = mainStack.pop();
        while (!mainStack.isEmpty()) {
            if (mainStack.top() > lastInt) {
                return false;
            }
            lastInt = mainStack.pop();
            System.out.println(lastInt);
        }

        return true;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 16; i++) {
            stack.push(i);
        }

        System.out.println(descendingStack(stack));
    }
}
