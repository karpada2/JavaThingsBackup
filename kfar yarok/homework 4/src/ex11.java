import java.util.Scanner;

public class ex11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String out = "";
        int x;
        for (int i = 1; i<=5; i++) {
            System.out.println("Enter any 3 digit number: ");
            x = sc.nextInt();
            if (x/100 != (x/10)%10 && x/100 != x%10 && (x/10)%10 != x%10) {
                out += x + ", \n";
            }
        }
        System.out.println(out);
    }
}
