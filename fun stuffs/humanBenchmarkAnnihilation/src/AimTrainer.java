import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

public class AimTrainer {

    public static void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) throws Exception {
        new Wait(1_000_000_000l);
        Robot robot = new Robot();
        int topLeftXCord = 787;
        int topLeftYCord = 225;
        Rectangle captureArea = new Rectangle(topLeftXCord, topLeftYCord, 970, 570); //now we just need to find out the circle size (it's 100)
        int targetBlue = new Color(165, 191, 230).getRGB();
        int targetWhite = new Color(253, 253, 254).getRGB();
        leftClick(1240, 430, robot);
        BufferedImage capture = robot.createScreenCapture(captureArea);
        for (int clicks = 0; clicks < 30; capture = robot.createScreenCapture(captureArea)) {
            for (int x = 0; x < captureArea.width; x+=10) {
                for (int y = 1; y < captureArea.height; y+=10) {
                    int current = capture.getRGB(x, y-1);
                    System.out.println("x:" + (x + topLeftXCord) +", y:" + (y + topLeftYCord) + ", color:" + current);
                    if (current == targetBlue || current == targetWhite) {
//                        leftClick(x + topLeftXCord, y + topLeftYCord, robot);
                        clicks+=30;
                        if (clicks == 30) {
                            return;
                        }
                    }
                    capture.setRGB(x, y, targetBlue);
                }
            }
        }
    }

    public static void leftClick(double x, double y, Robot robot) {
        robot.mouseMove((int) x, (int) y);
        robot.mousePress(MouseEvent.BUTTON1_MASK);
        robot.mouseRelease(MouseEvent.BUTTON1_MASK);
    }

    public static class Wait {
        public Wait(long nano) {
            for (long time = System.nanoTime(); true;)
                if (time + nano <= System.nanoTime())
                    break;
        }
    }
}