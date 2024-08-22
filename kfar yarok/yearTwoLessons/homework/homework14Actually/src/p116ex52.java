public class p116ex52 {
    public static int maxIndex(int[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int minIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static boolean isUnbalanced(int[] arr) {
        return arr[maxIndex(arr)] - arr[minIndex(arr)] < 20;
    }

    public static int amountOfUnbalanced(Node<int[]> results) {
        int amount = 0;
        while (results != null) {
            if (isUnbalanced(results.getValue())) {
                amount++;
            }
            results = results.getNext();
        }
        return amount;
    }

    public static int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static int[] generateRandom() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random(1, 40);
        }
        return arr;
    }

    public static void main(String[] args) {
        Node<int[]> results = null;
        for (int i = 0; i < 50; i++) {
            results = new Node<int[]>(generateRandom(), results);
        }
        System.out.println(results);
        System.out.println(amountOfUnbalanced(results));
    }
}
