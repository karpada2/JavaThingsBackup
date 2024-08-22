public class ex1 {
    public static void main(String[] args) {
        AllNumbers[] tests = new AllNumbers[5];
        int[] arr0 = {2, 3, -2, 8, 9, -1};
        tests[0] = new AllNumbers(arr0);
        int[] arr1 = {2, 2};
        tests[1] = new AllNumbers(arr1);
        int[] arr2 = {2, -7};
        tests[2] = new AllNumbers(arr2);
        int[] arr3 = {3, 5, -2, 5};
        tests[3] = new AllNumbers(arr3);
        int[] arr4 = {-5, 1};
        tests[4] = new AllNumbers(arr4);

        for (int i = 0; i < tests.length; i++) {
            System.out.print("[");
            for (int j = 0; j < tests[i].getArrayNum().length; j++) {
                System.out.print(tests[i].getArrayNum()[j] + ", ");
            }
            System.out.println("]");
            System.out.print("out: ");
            System.out.println(tests[i].flValue());
        }
    }
}
//2
//0
//14
//-10
//0