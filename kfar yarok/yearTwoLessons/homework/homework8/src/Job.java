public class Job {
    private int code;
    private int time; //seconds needed to finish the Job

    public Job(int code, int time) {
        this.code = code;
        this.time = time;
    }

    public void printCode() {
        System.out.println(this.code);
    }

    public int getTime() {
        return time;
    }
}
