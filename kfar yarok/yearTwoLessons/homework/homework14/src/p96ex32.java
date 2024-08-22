public class p96ex32 {
    public static int biggerNumberList(Node<Integer> lis1, Node<Integer> lis2) {
        while (lis1 != null && lis2 != null) {
            if (lis1.getValue() > lis2.getValue()) {
                return 1;
            } else if (lis2.getValue() > lis1.getValue()) {
                return 2;
            }
            lis1 = lis1.getNext();
            lis2 = lis2.getNext();
        }

        if (lis1 == null && lis2 != null) {
            return 2;
        } else if (lis1 != null && lis2 == null) {
            return 1;
        } else {
            return 0;
        }
    }
}
