import java.awt.Robot;

public class gottaKeepMoving {

    public static void glide(int x, int y, int time) {
        
    }

    public static void main(String[] args) throws  Exception {
        Robot robot = new Robot();
        while (true) {
            robot.mouseMove(10, 10);
            for (int i = 0; i < 5; i++) {
                robot.delay(60000);
            }
            robot.mouseMove(100, 100);
        }
    }
}
