import java.util.Scanner;

public class ex41 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char P1Group = 'a';
        char P2Group = 'a';
        System.out.println("Player one, please enter your age(1-17: ");
        int P1Age = sc.nextInt();
        System.out.println("Player one, please enter your gender(male, female): ");
        sc.nextLine();
        String P1Gender = sc.nextLine();
        switch (P1Age) {
            case 1,2,3,4,5,6,7:
                System.out.println("Player one, you are in group A");
                P1Group = 'A';
                break;
            case 8,9,10,11,12:
                System.out.println("Player one, you are in group B");
                P1Group = 'B';
                break;
            case 13,14,15,16,17:
                System.out.println("Player one, you are in group C");
                P1Group = 'C';
                break;
        }
        System.out.println("Player two, please enter your age: ");
        int P2Age = sc.nextInt();
        System.out.println("Player two, please enter your gender(male, female): ");
        sc.nextLine();
        String P2Gender = sc.nextLine();
        switch (P2Age) {
            case 1,2,3,4,5,6,7:
                System.out.println("Player one, you are in group A");
                P2Group = 'A';
                break;
            case 8,9,10,11,12:
                System.out.println("Player one, you are in group B");
                P2Group = 'B';
                break;
            case 13,14,15,16,17:
                System.out.println("Player one, you are in group C");
                P2Group = 'C';
                break;
        }
        if (P1Group == P2Group && P1Gender.equalsIgnoreCase(P2Gender)) {
            System.out.println("Player one and player two can fight");
        }
        else {
            System.out.println("Player one and player two cannot fight");
        }
    }
}