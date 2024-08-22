public class p152ex5 {
    public static Stack<Integer> sortQueueIntoStack(Queue<Integer> q) { //a
        Stack<Integer> sortedStack = new Stack<Integer>();
        Queue<Integer> mainQueue = new Queue<Integer>();
        int head = q.head();
        mainQueue.insert(q.head());
        q.insert(q.remove());
        while (q.head() != head) {
            mainQueue.insert(q.head());
            q.insert(q.remove());
        }

        while (!mainQueue.isEmpty()) {
            int lowest = mainQueue.head();
            int originalHead = mainQueue.head();
            mainQueue.insert(mainQueue.remove());
            while (mainQueue.head() != originalHead) {
                if (mainQueue.head() < lowest) {
                    lowest = mainQueue.head();
                }
                mainQueue.insert(mainQueue.remove());
            }

            mainQueue.insert(mainQueue.remove());
            while (!mainQueue.isEmpty() && (mainQueue.head() != originalHead || mainQueue.head() == lowest)) {
                if (mainQueue.head() == lowest) {
                    sortedStack.push(mainQueue.remove());
                    if (!mainQueue.isEmpty()) {
                        originalHead = mainQueue.head();
                    }
                } else {
                    mainQueue.insert(mainQueue.remove());
                }
            }
        }

        return sortedStack;

        //b O(n^2)

        //c I don't think that is possible, as you cannot wrap around and thus perfectly clone a stack using only 2 total stacks, including the original.
        //thus, sorting it without destroying the original data is impossible.
    }


    public static void main(String[] args) {
        Queue<Integer> toSort = new Queue<Integer>();

        toSort.insert(5);
        toSort.insert(1);
        toSort.insert(63);
        toSort.insert(123);
        toSort.insert(73);

        System.out.println(sortQueueIntoStack(toSort));
    }
}
