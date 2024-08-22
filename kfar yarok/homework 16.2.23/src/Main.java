import java.util.*;

public class Main {
    //טענת כניסה: הפעולה מקבלת אובייקט מסוג bankAccount, סכום כסף חיובי, וקוד הפעלה (0 אומר משיכת כסף, 1 אומר הפקדה)
    //טענת יציאה: הפעולה משנה את המאפיין money של האובייקט שניתן
    public static void action(bankAccount ba1, int code, int amount) {
        if ((code == 1 || code == 0) && amount >= 0) {
            if (amount > ba1.getMoney() && code == 0) {
                System.out.println("Not enough money!");
            } else {
                if (code == 1) {
                    ba1.setMoney(ba1.getMoney()+amount);
                } else {
                    ba1.setMoney(ba1.getMoney()-amount);
                    System.out.println("Withdrawal executed successfully!");
                }
            }
        }
        else {
            System.out.println("Either code invalid or amount negative!");
        }
    }
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        bankAccount ba1 = new bankAccount();
        System.out.println("Enter name: ");
        ba1.setName(sc.nextLine());
        System.out.println("Enter number: ");
        ba1.setNumber(sc.nextLine());
        System.out.println("Enter money: ");
        ba1.setMoney(sc.nextInt()); //שורות 24-30 יוצרות הופעה ba1 של bankAccount וממלאות את כל מאפייניו לפי קלט מהמשתמש
        System.out.println("Please enter 1 if you wish to deposit money, and 0 if you wish to withdraw: ");
        int code = sc.nextInt();
        System.out.println("Please enter how much money you wish to deposit/withdraw: ");
        int amount = sc.nextInt();
        int totalWithdrawn = 0;
        int totalDeposited = 0;
        while (code != 999) {
            if (code == 1) {
                totalDeposited += amount;
            } else if (code == 0 && amount <= ba1.getMoney()) {
                totalWithdrawn += amount;
            }
            action(ba1, code, amount);
            System.out.println("Please enter 1 if you wish to deposit money, and 0 if you wish to withdraw: ");
            code = sc.nextInt();
            if (code == 1 || code == 0) {
                System.out.println("Please enter how much money you wish to deposit/withdraw: ");
                amount = sc.nextInt();
            }
        }
        System.out.println(ba1.getName() + " Has " + ba1.getMoney() + "Money");
        System.out.println("Total withdrawn: " + totalWithdrawn);
        System.out.println("Total deposited: " + totalDeposited);
        String yes = sc.nextLine();
        String str = sc.nextLine();
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}