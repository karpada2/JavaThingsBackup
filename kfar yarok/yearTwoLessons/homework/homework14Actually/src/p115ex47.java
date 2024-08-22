public class p115ex47 {

    public static int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static int biggestIndex(int[] arr) {
        int maxIndex = 0;
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int mostAppearancesOfDice(Node<Integer> list) {
        int[] counter = new int[13]; //indexes 0 and 1 aren't used.
        for (int i = 0; i < counter.length; i++) {
            counter[i] = 0;
        }
        while (list != null) {
            counter[list.getValue()]++;
            list = list.getNext();
        }
        return biggestIndex(counter);
    }

    public static void main(String[] args) {
        Node<Integer> list = null;
        for (int i = 0; i < 50; i++) {
            list = new Node<Integer>(random(1,6) + random(1,6), list);
        }
        System.out.println(list);
        System.out.println(mostAppearancesOfDice(list));
    }
}
