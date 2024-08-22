import java.util.*;
import java.lang.*;

public class p184ex7 {
    static int items(int numPeople, int capacity) {
        int out = 0;
        if (numPeople % capacity != 0) {
            out = 1;
            numPeople -= numPeople % capacity;
        }
        out += numPeople / capacity;
        return out;
    }

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter how many guests there will be: ");
        int guests = sc.nextInt();
        System.out.println("Please enter bus capacity: ");
        int busCapacity = sc.nextInt();
        System.out.println("Please enter table capacity: ");
        int tableCapacity = sc.nextInt();
        System.out.println("Please enter boat capacity: ");
        int boatCapacity = sc.nextInt();
        System.out.println("You will need: " + items(guests, busCapacity) + " busses");
        System.out.println("You will need: " + items(guests, tableCapacity) + " tables");
        System.out.println("You will need: " + items(guests, boatCapacity) + " boats");
    }
}