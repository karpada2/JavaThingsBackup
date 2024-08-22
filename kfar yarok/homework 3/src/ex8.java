import java.util.Scanner;

public class ex8 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the amount of hours you worked: ");
        float hrWorked = sc.nextInt();
        System.out.println("Please enter the amount of hours you missed: ");
        float hrMissed = sc.nextInt();
        System.out.println("Please enter your salary per hour: ");
        float salary = sc.nextFloat();
        if (hrMissed < 3.5) {
            System.out.println("You got a bonus of 10%! Your final salary is " + (salary*hrWorked)*1.1);
        }
        else {
            System.out.println("Your salary is" + (salary*hrWorked));
        }
    }
}