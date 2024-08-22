public class p152ex3 {
    public static void removeDoubleAppearance(Queue<Integer> queue) {
        Queue<Integer> goodQueue = new Queue<Integer>();
        goodQueue.insert(queue.remove());

        Queue<Integer> temp = new Queue<Integer>();
        while (!queue.isEmpty()) {
            boolean hasAppeared = false;
            while (!goodQueue.isEmpty()) {
                if (queue.head() == goodQueue.head()) {
                    hasAppeared = true;
                }
                temp.insert(goodQueue.remove());
            }
            while (!temp.isEmpty()) {
                goodQueue.insert(temp.remove());
            }
            if (hasAppeared) {
                queue.remove();
            } else {
                goodQueue.insert(queue.remove());
            }
        }

        while (!goodQueue.isEmpty()) {
            queue.insert(goodQueue.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> test = new Queue<Integer>();

        test.insert(5);
        test.insert(5);
        test.insert(2);
        test.insert(16);
        test.insert(2);
        test.insert(16);
        test.insert(16);
        test.insert(19);
        test.insert(5);
        test.insert(1631);
        test.insert(5);

        removeDoubleAppearance(test);

        while (!test.isEmpty()) {
            System.out.println(test.remove());
        }
    }
}
