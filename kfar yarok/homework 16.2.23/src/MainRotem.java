import java.util.*;

public class MainRotem {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        BankAccountRotem ba1 = new BankAccountRotem();
        System.out.println("Enter your name: ");
        ba1.setName(scanner.next());
        System.out.println("Enter your account number: ");
        ba1.setNumber(scanner.next());
        System.out.println("Enter the amount of money in your account:  ");
        ba1.setMoney(scanner.nextInt());

    }
}