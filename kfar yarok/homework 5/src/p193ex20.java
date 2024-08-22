import java.util.*;


public class p193ex20 {
    static int totalTime(int min, int hr) {
        return min + hr*60;
    }

    static int timeDifference(int min1, int hr1, int min2, int hr2) {
        int time1 = totalTime(min1, hr1);
        int time2 = totalTime(min2, hr2);
        return Math.abs(time2 - time1);
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int h1;
        int m1;
        int h2;
        int m2;
        int bigTime = 0;
        int bigDay = 0;
        for (int i = 1; i <= 30; i++) {
            System.out.println("Please enter when the worker started working on day " + i + "(e.g: '18 30', '9 20'): " );
            h1 = sc.nextInt();
            m1 = sc.nextInt();
            System.out.println("Please enter when the worker finished working on day " + i + "(e.g: '18 30', '9 20'): ");
            h2 = sc.nextInt();
            m2 = sc.nextInt();
            if (timeDifference(m1, h1, m2, h2) > bigTime) {
                bigTime = timeDifference(m1, h1, m2, h2);
                bigDay = i;
            }
        }
        System.out.println("The worker worked the most time on day " + bigDay + "(" + bigTime + " minutes)");
    }
}