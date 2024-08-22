public class Main {

    public static int size(Stack<Integer> stack) {
        Stack<Integer> stack2 = new Stack<Integer>();
        int count = 0;
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
            count++;
        }
        while (!stack2.isEmpty()) {
            stack.push(stack2.pop());
        }

        return count;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 6; i <= 14; i++) {
            stack.push(i);
        }
        System.out.println(size(stack));
    }
}
