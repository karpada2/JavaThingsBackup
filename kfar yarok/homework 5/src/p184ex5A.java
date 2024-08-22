import java.util.*;

public class p184ex5A {
    static int Random(int num1, int num2) {
        return rand.nextInt(num1, num2);
    }
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(Random(sc.nextInt(), sc.nextInt()));
    }
}