import java.util.*;

public class ex32 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int place = -1;
        char nameChar = 'G';
        System.out.println("Please enter a string: ");
        String receivedString = sc.nextLine();
        for (int i = 0; i < receivedString.length(); i++) {
            if (receivedString.charAt(i) == nameChar || receivedString.charAt(i) == nameChar+32) {
                if (place == -1) {
                    place = i;
                }
            }
        }
        System.out.println("The first letter of your name, Gon, appears first in place " + place + " of the string");
    }
}