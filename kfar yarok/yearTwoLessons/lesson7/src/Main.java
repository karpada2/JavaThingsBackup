public class Main {

    public static boolean isExist(int num, Queue<Integer> q) {
        Queue<Integer> tempQueue = new Queue<Integer>();
        boolean isExist = false;
        while (!q.isEmpty()) {
            if (q.head() == num) {
                isExist = true;
            }
            tempQueue.insert(q.remove());
        }
        while (!tempQueue.isEmpty()) {
            q.insert(tempQueue.remove());
        }

        return isExist;
    }

    public static int size(Queue<Integer> q) {
        Queue<Integer> temp = new Queue<Integer>();
        int size = 0;
        while (!q.isEmpty()) {
            size++;
            temp.insert(q.remove());
        }
        while (!temp.isEmpty()) {
            q.insert(temp.remove());
        }
        return size;
    }

    public static boolean isPalindrome(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<Integer>();
        Stack<Integer> modifiableStack2 = new Stack<Integer>();
        Stack<Integer> modifiableStack3 = new Stack<Integer>();

        while (!stack.isEmpty()) {
            temp.push(stack.top());
            modifiableStack2.push(stack.pop());
        }

        while (!temp.isEmpty()) {
            stack.push(temp.top());
            modifiableStack3.push(temp.pop());
        }

        boolean isEqual = true;
        while(!modifiableStack3.isEmpty()) {
            if (!modifiableStack2.pop().equals(modifiableStack3.pop())) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    public static boolean isPalindrome(Queue<Integer> q) {
        Queue<Integer> temp = new Queue<Integer>();
        Stack<Integer> mainStack = new Stack<Integer>();
        Queue<Integer> mainQueue = new Queue<Integer>();

        while (!q.isEmpty()) {
            mainStack.push(q.head());
            mainQueue.insert(q.head());
            temp.insert(q.remove());
        }
        while (!temp.isEmpty()) {
            q.insert(temp.remove());
        }

        boolean isEqual = true;
        while (!mainQueue.isEmpty()) {
            if (!mainQueue.remove().equals(mainStack.pop())) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    public static int check(Queue<Integer> q, int x) {
        if (q.isEmpty() || x != q.head()) {
            return 1;
        }
        x = q.remove();
        return 1 + check(q, x);
    }

    public static void main(String[] args) {
        Queue<Integer> test = new Queue<Integer>();
        test.insert(2);
        test.insert(3);
        test.insert(1);
        test.insert(1);
        test.insert(4);
        test.insert(4);
        test.insert(4);
        test.insert(5);

        System.out.println(check(test, 2));
    }
}
