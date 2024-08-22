import java.awt.Robot;
import java.awt.event.MouseEvent;

public class testing {
    public static void leftClick(Robot robot) {
        robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
    }
    public static void main(String[] args) throws Exception {
        Robot robot = new Robot();
        robot.delay(1000);
        robot.mouseMove(960, 600);
//        leftClick(robot);
        robot.delay(1500);
        for (int y = 700; y <= 800; y += 100) {
            for (int x = 160; x <= 1720; x += 260) {
                robot.delay(1000);
                robot.mouseMove(x, y);
//                leftClick(robot);
            }
        }

        int y = 900;
        for (int x = 300; x < 1620; x += 260) {
            robot.delay(1000);
            robot.mouseMove(x, y);
//            leftClick(robot);
        }
    }
}
