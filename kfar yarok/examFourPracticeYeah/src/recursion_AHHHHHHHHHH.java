public class recursion_AHHHHHHHHHH {
    public static int numDigits(int num) {
        if (num <= 9) {
            return 1;
        }
        return numDigits(num/10);
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return factorial(num-1)*num;
    }

    public static boolean collatz(int num) {
        if (num == 1) {
            return true;
        }
        if (num%2==0) {
            return collatz(num/2);
        } else {
            return collatz((num*3)+1);
        }
    }

    public static int biggestDigit(int num) {
        if (num<=9) {
            return num;
            // there are at least two digits
        }
        return Math.max(num%10, biggestDigit(num/10));
    }

    public static int addBetween(int min, int max) {
        if (max == min) {
            return min;
        }
        return addBetween(min, max-1)+max;
    }

    public static void main(String[] args) {
        System.out.println(collatz(42));
    }
}
