public class StopWatch {

    private long startTime;
    private long stopTime;
    private boolean running;

    //constructor that starts the timer automatically
    public StopWatch() {
        this.startTime = System.nanoTime();
        this.running = true;
    }


    public void start() {
        this.startTime = System.nanoTime();
        this.running = true;
    }


    public void stop() {
        this.stopTime = System.nanoTime();
        this.running = false;
    }


    //elaspsed time in nanoseconds
    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.nanoTime() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }

    //elapsed time in milliseconds
    public long getElapsedTimeMilliSecs() {
        return this.getElapsedTime() / 1_000_000;
    }


    //elaspsed time in seconds
    public long getElapsedTimeSecs() {
        return getElapsedTime() / 1_000_000_000;
    }
}