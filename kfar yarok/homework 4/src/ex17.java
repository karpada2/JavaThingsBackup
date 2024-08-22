import java.util.Scanner;

public class ex17 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String out = "";
        for (int i = 1; i <= 6; i++) {
            System.out.println("Please enter your math grade: ");
            int math = sc.nextInt();
            System.out.println("Please enter your computer science grade: ");
            int computer = sc.nextInt();
            System.out.println("Please enter your physics grade: ");
            int physics = sc.nextInt();
            if (math >= 90 && computer >= 90 && physics >= 90 && (math+physics+computer)/3 >= 92) {
                out += i + ", " + (math+physics+computer)/3 + "\n";
            }
        }
        System.out.println(out);
    }
}
