public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 8;
        int c = 16;

        StopWatch watch = new StopWatch();
        for (int A = 1; A < 40; A++) {
            for (int B = 1; B < 40; B++) {
                for (int C = 1; C < 40 && (A + B + C == 40 && a*A + b*B + c*C == 160); C++) {
                    if (A + B + C == 40 && a*A + b*B + c*C == 160) {
                        System.out.println("a: " + A + ", b: " + B + ", c: " + C);
                        System.out.println(watch.getElapsedTime());
                    }
                }
            }
        }
        System.out.println(watch.getElapsedTime());
    }
}
