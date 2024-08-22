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
    public static boolean areSame(Stack<Integer> s1, Stack<Integer> s2, Stack<Integer> s1Temp, Stack<Integer> s2Temp) {
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }

        s1Temp.push(s1.pop());
        s2Temp.push(s2.pop());

        return (s1Temp.top() == s2Temp.top() && areSame(s1, s2));
    }

    public static boolean areSame(Stack<Integer> s1, Stack<Integer> s2) {
        if (size(s1) != size(s2)) {
            return false;
        }

        Stack<Integer> s1Temp = new Stack<Integer>();
        Stack<Integer> s2Temp = new Stack<Integer>();

        boolean areSame = areSame(s1, s2, s1Temp, s2Temp);
        while (!s1Temp.isEmpty()) {
            s1.push(s1Temp.pop());
            s2.push(s2Temp.pop());
        }
        return areSame;
    }

    public static void pushToStart(Queue<Integer> q, int num) {
        Queue<Integer> temp = new Queue<Integer>();
        while (!q.isEmpty()) {
            temp.insert(q.remove());
        }
        q.insert(num);
        while (!temp.isEmpty()) {
            q.insert(temp.remove());
        }
    }

    public static void main(String[] args) {

    }
}
