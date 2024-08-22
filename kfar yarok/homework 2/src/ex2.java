public class ex2 {
    public static void main(String[] args) {
        int before = 500;
        int num = 0;
        int subtract = 1;
        while (before >= 0) {
        before = before - subtract;
        subtract = subtract + 1;
        num = num + 1;
        }
        System.out.print(num);
    }
}
