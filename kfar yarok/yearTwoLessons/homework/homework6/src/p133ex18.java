import java.util.*;

public class p133ex18 {

    static Scanner sc = new Scanner(System.in);

    public static Couple popLowest(Stack<Couple> stack) {
        Stack<Couple> temp = new Stack<Couple>();
        Couple lowestFound = stack.pop();

        while(!stack.isEmpty()) {
            if (stack.top().getNum() < lowestFound.getNum()) {
                temp.push(lowestFound);
                lowestFound = stack.pop();
            } else {
                temp.push(stack.pop());
            }
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return lowestFound;
    }

    public static Stack<Integer> sortCoupleStack(Stack<Couple> stack) { //O(n^2)
        Stack<Couple> temp = new Stack<Couple>();
        Stack<Couple> coupleMain = new Stack<Couple>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        while(!temp.isEmpty()) {
            if (temp.top().getAppears() > 0) {
                coupleMain.push(temp.top());
            }
            stack.push(temp.pop());
        }

        while (!coupleMain.isEmpty()) { //critical complexity, O(n^2)
            temp.push(popLowest(coupleMain));
        }

        while (!temp.isEmpty()) {
            coupleMain.push(temp.pop());
        }

        Stack<Integer> returnStack = new Stack<Integer>();

        while (!coupleMain.isEmpty()) {
            for (int i = 0; i < coupleMain.top().getAppears(); i++) { //m is appears, thus O(n*m)???
                returnStack.push(coupleMain.top().getNum());
            }
            coupleMain.pop();
        }

        return returnStack;
    }

    public static void main(String[] args) {
        Stack<Couple> stack = new Stack<Couple>();
        System.out.println("enter amount of couple wanted");
        int repeat = sc.nextInt();

        System.out.println("enter appears and then num");
        for (int i = 0; i < repeat; i++) {
            int appears = sc.nextInt();
            stack.push(new Couple(appears, sc.nextInt()));
            System.out.println("-----");
        }

        Stack<Integer> finale = sortCoupleStack(stack);

        while (!finale.isEmpty()) {
            System.out.print(finale.pop() + ", ");
        }
    }
}
