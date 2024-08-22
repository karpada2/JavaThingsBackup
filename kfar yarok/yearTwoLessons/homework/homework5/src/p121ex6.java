public class p121ex6 {
    public static void rotateByOne(Stack<Integer> s) {
        int tempInt = s.pop();

        Stack<Integer> tempStack = new Stack<Integer>();

        while (!s.isEmpty()) {
            tempStack.push(s.pop());
        }
        s.push(tempInt);

        while(!tempStack.isEmpty()) {
            s.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < 16; i++) {
            stack.push(i);
        }
        System.out.println("---");

        rotateByOne(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
