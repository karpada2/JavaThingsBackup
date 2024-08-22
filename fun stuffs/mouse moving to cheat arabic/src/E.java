import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.KeyEvent;

public class E {
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int num = 5000;
        for (int i = 0; i < num; i++) {
            robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
        }
        stopWatch.stop();
        System.out.println("Nanosec: " + stopWatch.getElapsedTime());
        System.out.println("Sec: " + stopWatch.getElapsedTimeSecs());
        System.out.println("Clicks/sec = " + num/stopWatch.getElapsedTimeSecs());
    }
}
