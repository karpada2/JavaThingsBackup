public class p96ex34 {
    public static Node<Integer> reverse(Node<Integer> list) {
        Node<Integer> r = new Node<Integer>(list.getValue());
        list = list.getNext();
        while (list != null) {
            r = new Node<Integer>(list.getValue(), r);
            list = list.getNext();
        }
        return r;
    }

    public static void makeEqualLengthPlusOne(Node<Integer> lis1, Node<Integer> lis2) {
        while (lis1 != null && lis2 != null) {
            if (!lis1.hasNext() && lis2.hasNext()) {
                lis1.setNext(new Node<Integer>(0));
            }
            else if (lis1.hasNext() && !lis2.hasNext()) {
                lis2.setNext(new Node<Integer>(0));
            }
            lis1 = lis1.getNext();
            lis2 = lis2.getNext();
        }
    }

    public static Node<Integer> sumNumberLists(Node<Integer> lis1, Node<Integer> lis2) {
        makeEqualLengthPlusOne(lis1, lis2);
        lis1 = reverse(lis1);
        lis2 = reverse(lis2);
        int sum = lis1.getValue() + lis2.getValue();
        int remainder = 0;
        if (sum >= 10) {
            sum -= 10;
            remainder = 1;
        }
        Node<Integer> sumList = new Node<Integer>(sum);
        Node<Integer> curr = sumList;
        lis1 = lis1.getNext();
        lis2 = lis2.getNext();
        while (lis1 != null) {
            sum = lis1.getValue() + lis2.getValue() + remainder;
            remainder = 0;
            if (sum >= 10) {
                sum -= 10;
                remainder = 1;
            }
            curr.setNext(new Node<Integer>(sum));
            curr = curr.getNext();
            lis1 = lis1.getNext();
            lis2 = lis2.getNext();
        }
        if (remainder == 1) {
            curr.setNext(new Node<Integer>(1));
        }
        return reverse(sumList);
    }

    public static void main(String[] args) {
        Node<Integer> test1 = new Node<Integer>(3);
        Node<Integer> curr = test1;
        curr.setNext(new Node<Integer>(6));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(8));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(1));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(7));

        Node<Integer> test2 = new Node<Integer>(6);
        curr = test2;
        curr.setNext(new Node<Integer>(2));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(6));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(0));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(9));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(5));
        System.out.println(sumNumberLists(test1, test2));
    }
}
