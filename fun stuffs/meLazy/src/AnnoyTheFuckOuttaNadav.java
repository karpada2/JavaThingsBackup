import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class AnnoyTheFuckOuttaNadav {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws AWTException {
        int num = sc.nextInt();
        Robot robot = new Robot();
        robot.delay(3000);
        for (int i = 0; i < num; i++) {
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(650);
        }
    }
}
