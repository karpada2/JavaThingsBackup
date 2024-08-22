public class HiTec {
    Stack<Worker> jobOne;
    Stack<Worker> jobTwo;
    Stack<Worker> jobThree;
    Stack<Worker> jobFour;
    Stack<Worker> jobFive;
    Stack<Worker> jobSix;
    Stack<Worker> jobSeven;
    Stack<Worker> jobEight;
    Stack<Worker> jobNine;

    public HiTec() {
        jobOne = new Stack<Worker>();
        jobTwo = new Stack<Worker>();
        jobThree = new Stack<Worker>();
        jobFour = new Stack<Worker>();
        jobFive = new Stack<Worker>();
        jobSix = new Stack<Worker>();
        jobSeven = new Stack<Worker>();
        jobEight = new Stack<Worker>();
        jobNine = new Stack<Worker>();
    }

    private Stack<Worker> findStack(int job) {
        if (job == 1) {
            return jobOne;
        } else if (job == 2) {
            return jobTwo;
        } else if (job == 3) {
            return jobThree;
        } else if (job == 4) {
            return jobFour;
        } else if (job == 5) {
            return jobFive;
        } else if (job == 6) {
            return jobSix;
        } else if (job == 7) {
            return jobSeven;
        } else if (job == 8) {
            return jobEight;
        } else {
            return jobNine;
        }
    }

    public void addWorker(Worker worker, int job) {
        findStack(job).push(worker);
    }

    public Worker deleteWorker(int job) {
        return findStack(job).pop();
    }

    public void deleteMultiple(int job, int amount) {
        Stack<Worker> relevant = findStack(job);
        for (int i = 0; i < amount && !relevant.isEmpty(); i++) {
            System.out.println(relevant.pop().getId());
            if (!relevant.isEmpty()) {
                System.out.println("No more workers!");
            }
        }
    }
}
