import java.util.Scanner;

public class ex40 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter your grade in the psychometric test: ");
        int psychometric = sc.nextInt();
        System.out.println("Please enter your score average in the final exams: ");
        float finals = sc.nextFloat();
        if (psychometric >= 600 && finals >= 90.0) {
            System.out.println("You can enter the course in university");
        }
        else if (psychometric >= 600 && finals < 90.0) {
            System.out.println("You need to improve your finals score");
        }
        else if (psychometric < 600 && finals >= 90.0) {
            System.out.println("You need to take the psychometric test again");
        }
        else {
            System.out.println("You can't get into the course");
        }
    }
}