public class p151ex2 {
    public static Time differenceBetweenFirstAndLast(Queue<Time> queue) { //O(n), no nested while/for loops
        Queue<Time> tempQueue = new Queue<Time>();
        tempQueue.insert(queue.head());
        int firstGuySeconds = Time.allToSeconds(queue.remove());
        int lastGuySeconds = 0;
        while (!queue.isEmpty()) {
            Time tempTime = queue.remove();
            if (queue.isEmpty()) {
                lastGuySeconds = Time.allToSeconds(tempTime);
            }
            tempQueue.insert(tempTime);
        }
        while (!tempQueue.isEmpty()) {
            queue.insert(tempQueue.remove());
        }
        if (lastGuySeconds > firstGuySeconds) {
            return new Time(lastGuySeconds - firstGuySeconds);
        }

        return new Time(firstGuySeconds - lastGuySeconds);
    }

    public static void smallestDifference(Queue<Time> queue) {
        int frontMoreSmallestPlace = 1;
        Queue<Time> tempQueue = new Queue<Time>();
        tempQueue.insert(queue.remove());
        int smallestDifference = tempQueue.head().differenceInSeconds(queue.head());
        int currentPlace = 1;

        while (!queue.isEmpty()) {
            tempQueue.insert(queue.remove());
            currentPlace++;
            if (!queue.isEmpty() && tempQueue.head().differenceInSeconds(queue.head()) < smallestDifference) {
                frontMoreSmallestPlace = currentPlace;
                smallestDifference = tempQueue.head().differenceInSeconds(queue.head());
            }
        }

        System.out.println(frontMoreSmallestPlace + ", " + (frontMoreSmallestPlace+1));
    }
}
