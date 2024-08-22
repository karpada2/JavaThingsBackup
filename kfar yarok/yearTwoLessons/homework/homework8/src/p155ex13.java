public class p155ex13 {
    public static Stack<Queue<Integer>> fillMissing(Stack<Queue<Integer>> SQ) { //O(n*m), n is the length of the stack and m is the length of each queue in the stack as it has 2 while loops for going over every queue in all of the stack SQ
        Stack<Queue<Integer>> reverseSL = new Stack<Queue<Integer>>();
        Stack<Queue<Integer>> SQtemp = new Stack<Queue<Integer>>();

        while (!SQ.isEmpty()) {
            reverseSL.push(new Queue<Integer>());
            int first = SQ.top().head();
            Queue<Integer> temp = new Queue<Integer>();
            while (!SQ.top().isEmpty()) {
                if (SQ.top().head() == first) {
                    temp.insert(SQ.top().remove());
                } else {
                    reverseSL.top().insert(first);
                }
                first++;
            }
            SQ.pop();
            SQtemp.push(temp);
        }

        Stack<Queue<Integer>> SL = new Stack<Queue<Integer>>();

        while (!SQtemp.isEmpty()) {
            SL.push(reverseSL.pop());
            SQ.push(SQtemp.pop());
        }

        return SL;
    }

    public static void main(String[] args) {
        Stack<Queue<Integer>> test = new Stack<Queue<Integer>>();

        test.push(new Queue<Integer>());
        test.top().insert(1);
        test.top().insert(5);
        test.top().insert(8);
        test.top().insert(9);
        test.top().insert(10);

        test.push(new Queue<Integer>());
        test.top().insert(7);
        test.top().insert(9);
        test.top().insert(10);

        test.push(new Queue<Integer>());
        test.top().insert(20);
        test.top().insert(21);
        test.top().insert(22);
        test.top().insert(25);
        test.top().insert(26);

        test.push(new Queue<Integer>());
        test.top().insert(4);
        test.top().insert(5);
        test.top().insert(6);
        test.top().insert(7);
        test.top().insert(8);

        Stack<Queue<Integer>> returnStack = fillMissing(test);

        System.out.println(test);

        System.out.println("------");

        System.out.println(returnStack);
    }
}
