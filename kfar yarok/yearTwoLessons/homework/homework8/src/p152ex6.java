public class p152ex6 {
    public static void printPossibleToDoJobs(Queue<Job> JobsQueue, int timeToFinish) {
        while (!JobsQueue.isEmpty() && JobsQueue.head().getTime() <= timeToFinish) {
            JobsQueue.head().printCode();
            timeToFinish -= JobsQueue.head().getTime();
            JobsQueue.remove();
        }
    }

    public static void main(String[] args) {
        Queue<Job> main = new Queue<Job>();

        main.insert(new Job(314, 10));
        main.insert(new Job(572, 40000));
        main.insert(new Job(5241, 1));
        main.insert(new Job(435376, 16));
        main.insert(new Job(123, 2));
        main.insert(new Job(6346314, 10));

        printPossibleToDoJobs(main, 111200);
    }
}
