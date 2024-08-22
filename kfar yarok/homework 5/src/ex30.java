import java.util.*;

public class ex30 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int shir = 0;
        int li = 0;
        String result;
        while (li < 3 && shir < 3) {
            System.out.println("Please enter Shir's result: ");
            result = sc.nextLine();
            if (result.equalsIgnoreCase("etz")) {
                shir++;
            }
            System.out.println("Please enter Li's result: ");
            result = sc.nextLine();
            if (result.equalsIgnoreCase("etz")) {
                li++;
            }
        }
        if (shir == 3) {
            System.out.println("Shir won!");
        }
        else {
            System.out.println("Li won!");
        }
    }
}