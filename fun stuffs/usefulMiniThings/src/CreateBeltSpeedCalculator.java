import java.util.*;

public class CreateBeltSpeedCalculator {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter amount of affected belts");
        int amountOfBeltsAffected = sc.nextInt();
        System.out.println("Max RPM for amount of items: ");
        System.out.println("----------------------------------------------");
        System.out.println("1-16  items per stack on belt: " + (int)(3.2 *amountOfBeltsAffected) + " RPM");
        System.out.println("17-32 items per stack on belt: " + (int)(1.6 *amountOfBeltsAffected) + " RPM");
        System.out.println("33-48 items per stack on belt: " + (int)(1.06*amountOfBeltsAffected) + " RPM");
        System.out.println("49-64 items per stack on belt: " + (int)(0.8 *amountOfBeltsAffected) + " RPM");
    }
}
