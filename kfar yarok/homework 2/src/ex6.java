import java.util.*;

public class ex6 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        float extraProfit = 0;
        System.out.println("Please enter the package's postal code(4 digits)");
        int postalCode = sc.nextInt();
        System.out.println("Please enter the package's weight");
        float weight = sc.nextFloat();
        int averageDivider = 0;
        float allWeights = 0;
        float heavyPackage = 0;
        int heavyPostalCode = 0;
        while (weight != 999.9 && postalCode != 0) {
            System.out.println("Please enter the package's postal code(4 digits)");
            postalCode = sc.nextInt();
            System.out.println("Please enter the package's weight");
            weight = sc.nextFloat();
            if (weight == 999.9 && postalCode == 0) {
                break;
            }
            averageDivider += 1;
            allWeights += weight;
            if (heavyPackage < weight) {
                heavyPackage = weight;
                heavyPostalCode = postalCode;
            }
            if (weight > 10.0) {
                weight -= 10;
            }
            extraProfit += (Math.ceil(weight)*1.25);
        }
        System.out.println("The average weight for a package this day is: " + allWeights/averageDivider);
        System.out.println("The heaviest package had a weight of: " + heavyPackage + ", and it's postal code was: " + heavyPostalCode);
        System.out.println("Today's profits are: " + extraProfit);
    }
}
