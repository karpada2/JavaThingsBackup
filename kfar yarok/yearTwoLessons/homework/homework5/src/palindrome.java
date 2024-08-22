import java.util.*;

public class palindrome {
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

    public static boolean wayOne(Stack<Integer> stack) {
        Stack<Integer> modifiableStack1 = new Stack<Integer>();
        Stack<Integer> modifiableStack2 = new Stack<Integer>();
        Stack<Integer> modifiableStack3 = new Stack<Integer>();

        while (!stack.isEmpty()) {
            modifiableStack1.push(stack.top());
            modifiableStack2.push(stack.pop());
        }

        while (!modifiableStack1.isEmpty()) {
            stack.push(modifiableStack1.top());
            modifiableStack3.push(modifiableStack1.pop());
        }

        boolean isEqual = true;
        while(!modifiableStack3.isEmpty()) {
            if (!modifiableStack2.pop().equals(modifiableStack3.pop())) {
                isEqual = false;
            }
        }

        return isEqual;
    }

    public static boolean wayTwo(Stack<Integer> stack) {
        Stack<Integer> copyStack = new Stack<Integer>();
        Stack<Integer> secondCopyStack = new Stack<Integer>();

        while (!stack.isEmpty()) {
            copyStack.push(stack.top());
            secondCopyStack.push(stack.pop());
        }

        while(!secondCopyStack.isEmpty()) {
            stack.push(secondCopyStack.pop());
        }

        int stackSize = size(copyStack);
        for (int i = 0; i < stackSize/2; i++) {
            secondCopyStack.push(copyStack.pop());
        }

        if (size(copyStack) > size(secondCopyStack)) {
            copyStack.pop();
        }

        boolean isPalindrome = true;
        while (!copyStack.isEmpty()) {
            if (!copyStack.pop().equals(secondCopyStack.pop())) {
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Stack<Integer> test = new Stack<Integer>();
        System.out.println("how many numbers in stack");
        int amount = sc.nextInt();
        System.out.println("Start inputting numbers");
        for (int i = 1; i <= amount; i++) {
            System.out.println("enter number " + i);
            test.push(sc.nextInt());
        }

        System.out.println("Way one: " + wayOne(test));
        System.out.println("Way two: " + wayTwo(test));
    }
}
