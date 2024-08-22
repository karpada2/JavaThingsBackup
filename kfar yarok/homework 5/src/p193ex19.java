import java.util.*;


public class p193ex19 {
    static int finalsScore(int grade, int yehidot) {
        grade += yehidot*10-30;
        return grade;
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int average = 0;
        System.out.println("Please enter your Science finals grade: ");
        int grade = sc.nextInt();
        System.out.println("Please enter your Science finals yehidot: ");
        int yehidot = sc.nextInt();
        average += finalsScore(grade, yehidot);
        System.out.println("" + finalsScore(grade, yehidot));
        System.out.println("Please enter your Computer science finals grade: ");
        grade = sc.nextInt();
        System.out.println("Please enter your Computer science finals yehidot: ");
        yehidot = sc.nextInt();
        average += finalsScore(grade, yehidot);
        System.out.println("" + finalsScore(grade, yehidot));
        System.out.println("Please enter your Mathematics finals grade: ");
        grade = sc.nextInt();
        System.out.println("Please enter your Mathematics finals yehidot: ");
        yehidot = sc.nextInt();
        average += finalsScore(grade, yehidot);
        System.out.println("" + finalsScore(grade, yehidot));
        System.out.println("Please enter your English finals grade: ");
        grade = sc.nextInt();
        System.out.println("Please enter your English finals yehidot: ");
        yehidot = sc.nextInt();
        average += finalsScore(grade, yehidot);
        System.out.println("" + finalsScore(grade, yehidot));
        System.out.println("" + average/4);
    }
}