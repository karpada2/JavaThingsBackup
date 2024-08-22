public class p96ex35 {
    public static Node<Integer> merge(Node<Integer> lis1, Node<Integer> lis2) {
        if (lis2 == null) {
            return lis1;
        }
        if (lis1 == null) {
            return lis2;
        }
        Node<Integer> m;
        if (lis1.getValue() > lis2.getValue()) {
            m = new Node<Integer>(lis2.getValue());
            lis2 = lis2.getNext();
        } else {
            m = new Node<Integer>(lis1.getValue());
            lis1 = lis1.getNext();
        }
        Node<Integer> curr = m;
        while (lis1 != null && lis2 != null) {
            if (lis1.getValue() > lis2.getValue()) {
                curr.setNext(new Node<Integer>(lis2.getValue()));
                curr = curr.getNext();
                lis2 = lis2.getNext();
            } else {
                curr.setNext(new Node<Integer>(lis1.getValue()));
                curr = curr.getNext();
                lis1 = lis1.getNext();
            }
        }
        while (lis1 != null) {
            curr.setNext(new Node<Integer>(lis1.getValue()));
            curr = curr.getNext();
            lis1 = lis1.getNext();
        }
        while (lis2 != null) {
            curr.setNext(new Node<Integer>(lis2.getValue()));
            curr = curr.getNext();
            lis2 = lis2.getNext();
        }
        return m;
    }

    public static void main(String[] args) {
        Node<Integer> test1 = new Node<Integer>(3);
        Node<Integer> curr = test1;
        curr.setNext(new Node<Integer>(16));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(17));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(17));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(99));

        Node<Integer> test2 = new Node<Integer>(2);
        curr = test2;
        curr.setNext(new Node<Integer>(2));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(17));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(100));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(250));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(251));

        System.out.println(merge(test1, test2));
    }
}
