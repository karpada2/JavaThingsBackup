import java.util.*;

public class p133ex15 {

    static Scanner sc = new Scanner(System.in);
    public static int minInStack(Stack<Integer> s){ //O(n) n is size of stack
        Stack<Integer> temp = new    Stack<>();
        temp.push(s.top());
        int min = s.pop();
        while (!s.isEmpty()){
            if(min > s.top()){
                min = s.top();
            }

            temp.push(s.pop());
        }
        while(!temp.isEmpty()){
            if(temp.top() == min){
                temp.pop();
            }
            s.push(temp.pop());
        }
        return min;
    }

    // n מוגדר כמספר בראש המחסנית מחוץ לפעולה
    public static int minInStackRecursive(Stack<Integer> s, int n){
        System.out.println(s);
        boolean bool = s.isEmpty();
        if(bool){
            return n;
        }
        if(s.top() < n){
            n = s.top();
        }
        s.pop();
        return minInStackRecursive(s,n);
    }

    public static int minInStackRecursive(Stack<Integer> s) {
        return minInStackRecursive(s, s.top());
    }


    public static void sort(Stack<Integer> s){ // O(n^2) n is size of stack
        Stack<Integer> temp1 = new Stack<>();
        Stack<Integer> temp2 = new Stack<>();
        while(!s.isEmpty()){
            temp1.push(s.pop());
        }
        while(!temp1.isEmpty()){
            temp2.push(temp1.pop());
        }
        while(!temp2.isEmpty()){
            int min = minInStack(temp2);
            temp1.push(min);
        }
        while(!temp1.isEmpty()){
            s.push(temp1.pop());
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter amount of numbers in stack");
        int length = sc.nextInt();
        Stack<Integer> s = new Stack<Integer>();
        System.out.println("Start entering numbers");
        for (int i = 0; i < length; i++) {
            s.push(sc.nextInt());
        }

        sort(s);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
