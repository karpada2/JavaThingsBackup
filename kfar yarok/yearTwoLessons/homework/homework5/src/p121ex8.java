import java.util.*;

public class p121ex8 {

    static Scanner sc = new Scanner(System.in);

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


    public static boolean similar(Stack<Integer> s1, Stack<Integer> s2) {

        if (size(s1) != size(s2)) {
            return false;
        }

        Stack<Integer> temp = new Stack<Integer>();
        Stack<Integer> s1Copy = new Stack<Integer>();
        Stack<Integer> s2Copy = new Stack<Integer>();

        while (!s1.isEmpty()) {
            temp.push(s1.pop());
        }

        while (!temp.isEmpty()) {
            s1.push(temp.top());
            s1Copy.push(temp.pop());
        }

        while (!s2.isEmpty()) {
            temp.push(s2.pop());
        }

        Stack<Integer> s2SecondCopy = new Stack<Integer>();
        while (!temp.isEmpty()) {
            s2.push(temp.top());
            s2SecondCopy.push(temp.top());
            s2Copy.push(temp.pop());
        }

        while (!s1Copy.isEmpty()) {
            boolean foundEqual = false;
            while(!s2Copy.isEmpty()) {
                if (s2Copy.top().equals(s1Copy.top())) {
                    foundEqual = true;
                }
                s2Copy.pop();
            }
            if (!foundEqual) {
                return false;
            }

            s1Copy.pop();
            while (!s2SecondCopy.isEmpty()) {
                temp.push(s2SecondCopy.pop());
            }

            while (!temp.isEmpty()) {
                s2Copy.push(temp.top());
                s2SecondCopy.push(temp.pop());

            }
        }

        return true;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();
        System.out.println("Stack 1 size: ");
        int size = sc.nextInt();
        System.out.println("Enter stack elements");
        for (int i = 0; i < size; i++) {
            s1.push(sc.nextInt());
        }

        Stack<Integer> s2 = new Stack<Integer>();
        System.out.println("Stack 2 size: ");
        size = sc.nextInt();
        System.out.println("Enter stack elements");
        for (int i = 0; i < size; i++) {
            s2.push(sc.nextInt());
        }

        System.out.println(similar(s1, s2));
    }
}
