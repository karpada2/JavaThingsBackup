public class book2p47ex22 {
    public static int[] negativeThenPositive(int[] a) {

        int[] b = new int[a.length];
        int w = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                b[w] = a[i];
                w++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                b[w] = a[i];
                w++;
            }
        }

        return b;

    }

    public static void main(String[] args) {
        int[] a = { 5, -2, 23, 7, 87, -42, 509 };
        int[] b = negativeThenPositive(a);
        for (int num : b) {
            System.out.println(" " + num);
        }
    }
}
