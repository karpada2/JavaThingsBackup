import java.util.*;

public class ex7 {

    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your math grade: ");
        int math = sc.nextInt();
        System.out.println("Please enter your english grade: ");
        int english = sc.nextInt();
        System.out.println("Please enter your sports grade: ");
        int sports = sc.nextInt();
        System.out.println("Please enter your science grade: ");
        int science = sc.nextInt();
        System.out.println("Average grade: " + ((math+english+sports+science)/4));
    }
}