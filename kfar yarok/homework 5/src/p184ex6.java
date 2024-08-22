import java.util.*;

public class p184ex6 {
    // part A of the question
    static int evenDigits(int num) {
        int counter = 0;
        while (num >= 1) {
            if ((num % 10) % 2 == 0) {
                counter++;
            }
            num /= 10;
        }
        return counter;
    }

    static Scanner sc = new Scanner(System.in);
    // part B of the question
    public static void main(String[] args) {
        System.out.println("Please enter the amount of numbers you wish to input: ");
        int n = sc.nextInt();
        int big_even = 0;
        int big_num = 0;
        int current_num;
        for (int i = 0; i < n; i++) {
            System.out.println("Please input a number that hasn't been inputted before: ");
            current_num = sc.nextInt();
            if (evenDigits(current_num) > big_even) {
                big_num = current_num;
                big_even = evenDigits(current_num);
            }
        }
        System.out.println(big_num + "");
        System.out.println(big_even + "");
    }
}