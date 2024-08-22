import java.util.Scanner;

public class ex43 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the lengths of all 3 edges in the triangle: ");
        int zela1 = sc.nextInt();
        int zela2 = sc.nextInt();
        int zela3 = sc.nextInt();
        if (zela1 + zela2 > zela3 && zela2 + zela3 > zela1 && zela1 + zela3 > zela2) {
            if (zela1 == zela2 && zela2 == zela3) {
                System.out.println("These edges make an equilateral triangle");
            }
            else if (zela1 == zela2 || zela1 == zela3 || zela2 == zela3) {
                System.out.println("These edges make an Isosceles triangle");
            }
            else {
                System.out.println("These edges make a scalene triangle");
            }
        }
    }
}