public class book2p54ex24 {
    public static int[] smallerThanNextIndexes(int[] ar) {
        int counter = 0;
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i] < ar[i+1]) {
                counter++;
            }
        }
        int[] result = new int[counter];
        int resultIndex = 0;
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i] < ar[i+1]) {
                result[resultIndex] = i;
                resultIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] randArray = new int[20];
        System.out.println("Random array: ");
        for (int i = 0; i < 20; i++) {
            randArray[i] = (int) (Math.random() * (100 + 1));
            System.out.println("" + randArray[i]);
        }

        System.out.println("Indexes: ");
        for (int i = 0; i < smallerThanNextIndexes(randArray).length; i++) {
            System.out.println("" + smallerThanNextIndexes(randArray)[i]);
        }
    }
}
