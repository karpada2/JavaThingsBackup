public class p151ex1 {
    public static boolean isStreakOfInQueue(int numToLookFor, Queue<Integer> queue) {
        Queue<Integer> temp = new Queue<Integer>();
        Queue<Integer> main = new Queue<Integer>();
        while (!queue.isEmpty()) {
            main.insert(queue.head());
            temp.insert(queue.remove());
        }
        while (!temp.isEmpty()) {
            queue.insert(temp.remove());
        }

        while (!main.isEmpty()) {
            if (main.head().equals(numToLookFor)) {
                temp.insert(main.remove());
                if (!main.isEmpty() && main.head().equals(numToLookFor)) {
                    return true;
                }
            } else {
                temp.insert(main.remove());
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Queue<Integer> test = new Queue<Integer>();

        test.insert(5);
        test.insert(51);
        test.insert(24);
        test.insert(156);
        test.insert(6);
        test.insert(5);

        System.out.println(isStreakOfInQueue(5, test));

    }
}
