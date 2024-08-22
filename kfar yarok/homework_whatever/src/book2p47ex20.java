public class book2p47ex20 {
    public static int[] DivisableByThree(int[] a) {
        int[] b = new int[(int)(a.length*1.5)];
        for (int i = 0; i < a.length/2; i++) {
            b[3*i] = a[2*i];
            b[3*i+1] = a[2*i+1];
            if ((a[2*i] + a[2*i+1]) % 3 == 0) {
                b[3*i+2] = a[2*i] + a[2*i+1];
            }
        }
        return b;
    }


    public static void main(String[] args) {
        int[] a = {1,5,9,5,6,3,4,1};
        int[] b = DivisableByThree(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}