public class book2p69ex42 {
    public static void sharedElements(int[] arr1, int[] arr2) {
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr1[i]) {
                    counter++;
                }
            }
        }
        int[] resultArr = new int[counter];
        int resultIndex = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr1[i]) {
                    resultArr[resultIndex] = arr2[j];
                    resultIndex++;
                }
            }
        }
        System.out.println("Printing result array: ");
        for (int i = 0; i < resultArr.length; i++) {
            System.out.println("" + resultArr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,63,132,12,85,145,2};
        int[] arr2 = {35,85,2,73,346,63};
        sharedElements(arr1, arr2);
    }
}
