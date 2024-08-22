import java.util.*;

public class ClownMain {

    static Scanner sc = new Scanner(System.in);

    public static boolean isDescendingOrder(Stack<Clown> pyramid) {
        Stack<Clown> temp = new Stack<Clown>();
        temp.push(pyramid.pop());
        while (!pyramid.isEmpty() && temp.top().getWeight() < pyramid.top().getWeight()) {
            temp.push(pyramid.pop());
        }

        if (!pyramid.isEmpty()) {
            while (!temp.isEmpty()) {
                pyramid.push(temp.pop());
            }
            return false;
        }

        while (!temp.isEmpty()) {
            pyramid.push(temp.pop());
        }

        return true;
    }

    public static boolean isBottomWeightThirdOfSum(Stack<Clown> pyramid) {
        Stack<Clown> temp = new Stack<Clown>();
        Stack<Clown> reverse = new Stack<Clown>();
        while (!pyramid.isEmpty()) {
            reverse.push(pyramid.top());
            temp.push(pyramid.pop());
        }
        while (!temp.isEmpty()) {
            pyramid.push(temp.pop());
        }

        Double sum = 0.0;
        Double maxWeight = reverse.pop().getWeight()*3;

        while (!reverse.isEmpty()) {
            sum += reverse.pop().getWeight();
        }

        return maxWeight >= sum;
    }

    public static boolean isBalanced(Stack<Clown> pyramid) {
        Stack<Clown> temp = new Stack<Clown>();
        Stack<Clown> copy = new Stack<Clown>();
        while (!pyramid.isEmpty()) {
            temp.push(pyramid.pop());
        }
        while (!temp.isEmpty()) {
            copy.push(temp.top());
            pyramid.push(temp.pop());
        }

        if (!isDescendingOrder(copy)) {
            return false;
        }
        while (!copy.isEmpty()) {
            if (!isBottomWeightThirdOfSum(copy)) {
                return false;
            }
            copy.pop();
            Clown tempClown = copy.pop();
            if (copy.isEmpty()) {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Stack<Clown> pyramid = new Stack<Clown>();
        System.out.println("Weight(double)");
        for (int i = 0; i < 6; i++) {
            Double weight = sc.nextDouble();
            pyramid.push(new Clown(weight, String.valueOf(i)));
        }

        System.out.println(isBalanced(pyramid));
        while (!pyramid.isEmpty()) {
            System.out.println(pyramid.pop().toString());
        }
    }
}
