public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds) {
        this.hours = seconds/3600;
        this.minutes = (seconds % 3600)/60;
        this.seconds = (seconds % 3600) % 60;
    }

    public static int allToSeconds(Time time) {
        return time.seconds + time.minutes*60 + time.hours*3600;
    }

    public int differenceInSeconds(Time anotherTime) {
        int firstGuySeconds = allToSeconds(this);
        int secondGuySeconds = allToSeconds(anotherTime);

        if (secondGuySeconds > firstGuySeconds) {
            return secondGuySeconds - firstGuySeconds;
        }

        return firstGuySeconds - secondGuySeconds;
    }
}
