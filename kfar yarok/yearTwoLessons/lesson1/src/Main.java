public class Main {
    public static int pow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return base * pow(base, exponent-1);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }

    public static int len(int num) {
        if (num < 10) {
            return 1;
        }

        return len(num/10) + 1;
    }

    public static int sod1(int x, int n) {
        if (x == 0) {
            return 0;
        } else {
            return sod1(x-1,n) + sod2(x-1,n);
        }
    }

    public static int sod2(int x, int n) {
        if (x == 0) {
            return 1;
        } else {
            if (n < x) {
                n = x;
                return sod1(x,n)+sod2(x,n);
            } else {
                return sod1(x-1,n) + sod2(x-1,n);
            }
        }
    }


    //input: num n, digit dig
    //output how many times dig appears in n
    public static int appears(int n, int dig) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == dig) {
            return appears(n/10, dig)+1;
        } else {
            return appears(n/10, dig);
        }
    }

    public static int maxDigit(int n) {
        if (n < 10) {
            return n;
        }
        if (maxDigit(n/10) > n%10) {
            return maxDigit(n/10);
        }
        return n % 10;
    }

    public static void main(String[] args) {
        System.out.println(maxDigit(452));
    }
}
