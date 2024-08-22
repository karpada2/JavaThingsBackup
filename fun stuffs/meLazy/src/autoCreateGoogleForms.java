import java.awt.*;
import java.awt.event.*;

public class autoCreateGoogleForms {

    public static void press(Robot robot, int button) {
        robot.keyPress(button);
        robot.keyRelease(button);
    }

    public static void rowDown(Robot robot) {
        press(robot, KeyEvent.VK_DOWN);
        press(robot, KeyEvent.VK_END);
    }

    public static void newRow(Robot robot) {
        press(robot, KeyEvent.VK_ENTER);
        press(robot, KeyEvent.VK_END);
    }

    public static void writeDate(Robot robot, int day, int month) { //0 <= day, month <= 99
        int[] arr = {KeyEvent.VK_0, KeyEvent.VK_1, KeyEvent.VK_2, KeyEvent.VK_3, KeyEvent.VK_4, KeyEvent.VK_5, KeyEvent.VK_6, KeyEvent.VK_7, KeyEvent.VK_8, KeyEvent.VK_9};
        if (day >= 10) {
            press(robot, arr[day/10]);
        }
        press(robot, arr[day%10]);
        press(robot, KeyEvent.VK_PERIOD);
        if (month >= 10) {
            press(robot, arr[month/10]);
        }
        press(robot, arr[month%10]);
    }

    public static void writeDayHebrew(Robot robot) { // huo
        press(robot, KeyEvent.VK_H);
        press(robot, KeyEvent.VK_U);
        press(robot, KeyEvent.VK_O);
    }

    public static void writeDayNameHebrew(Robot robot, int day) { // 1 <= day <= 7
        String[] dayNames = {"error", "rtaui", "abh", "akhah", "rchgh", "jnhah", "ahah", "ac"};
        char[] wantedDay = dayNames[day].toCharArray();
        for (int i = 0; i < wantedDay.length; i++) {
            press(robot, KeyEvent.getExtendedKeyCodeForChar(wantedDay[i]));
        }
    }

    public static void main(String[] args) throws AWTException {

        Robot robot = new Robot();
        robot.delay(5000);
        for (int i = 3; i <= 38; i++) {
            writeDayHebrew(robot);
            press(robot, KeyEvent.VK_SPACE);
            writeDayNameHebrew(robot, (i % 7) + 1);
            rowDown(robot);
            press(robot, KeyEvent.VK_SPACE);
        }
    }
}
