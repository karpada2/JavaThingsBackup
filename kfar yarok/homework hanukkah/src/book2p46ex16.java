public class book2p46ex16 {
    public static void commonItemPlaces(int[] arr) {
        int numSmall = arr[0];
        int numBig = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (numSmall > arr[i]) {
                numSmall = arr[i];
            }
            if (numBig < arr[i]) {
                numBig = arr[i];
            }
        }
        int num1 = numBig;
        int num2 = numSmall;
        int num1Scarcity = 0;
        int num2Scarcity = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num1) {
                num1Scarcity++;
            } else {
                num2Scarcity++;
            }
        }
        int commonNum;
        if (num2Scarcity > num1Scarcity) {
            commonNum = num2;
            System.out.println("" + num2Scarcity);
        } else {
            commonNum = num1;
            System.out.println("" + num1Scarcity);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == commonNum)
                System.out.print(" " + i);
        }
    }


    public static void main(String[] args) {
//        int[] array = new int[7];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Please enter the " + (i+1) + " value in the array: ");
//            array[i] = sc.nextInt();
//        }
        int[] array = new int[]{6,16,6,6,16,16,16};
        commonItemPlaces(array);
    }
}
