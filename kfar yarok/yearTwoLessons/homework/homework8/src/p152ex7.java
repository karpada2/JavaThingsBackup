public class p152ex7 {
    public static void mergeQueuesFairly(Queue<String> queue1, Queue<String> queue2) { //queue2 is inactive
        Queue<String> returnQueue = new Queue<String>();
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            returnQueue.insert(queue1.remove());
            returnQueue.insert(queue2.remove());
        }

        while (!queue1.isEmpty()) {
            returnQueue.insert(queue1.remove());
        }
        while (!queue2.isEmpty()) {
            returnQueue.insert(queue2.remove());
        }

        while (!returnQueue.isEmpty()) {
            queue1.insert(returnQueue.remove());
        }
    }

    public static void main(String[] args) {
        Queue<String> queue1 = new Queue<String>();
        Queue<String> queue2 = new Queue<String>();

        queue1.insert("Mark");
        queue2.insert("Sarrah");

        queue1.insert("John");
        queue2.insert("Bob");

        queue1.insert("Rachel");
        queue2.insert("Shira");

        queue1.insert("Jeff");
        queue2.insert("David");

        queue1.insert("Billy");
        queue1.insert("Karen");

        mergeQueuesFairly(queue1, queue2);

        System.out.println(queue1);
    }
}
