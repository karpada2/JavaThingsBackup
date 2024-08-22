public class p96ex33 {

    public static Node<Integer> assumeInStart(Node<Integer> lis1, Node<Integer> lis2) {
        while (lis2 != null) {
            if (lis1.getValue() != lis2.getValue()) {
                return null;
            }
            lis2 = lis2.getNext();
            lis1 = lis1.getNext();
        }
        return lis1;
    }

    public static Node<Integer> removeList(Node<Integer> lis1, Node<Integer> lis2) {
        if (assumeInStart(lis1, lis2) != null) {
            return assumeInStart(lis1, lis2);
        }

        Node<Integer> ogLis1 = lis1;

        while (lis1 != null) {
            if (lis1.getNext().getValue() == lis2.getValue()) {
                if (assumeInStart(lis1.getNext(), lis2) != null) {
                    lis1.setNext(assumeInStart(lis1.getNext(), lis2));
                    return ogLis1;
                } else {
                    Node<Integer> lis1Curr = lis1.getNext();
                    Node<Integer> lis2Curr = lis2;
                    while (lis2Curr.hasNext()) {
                        lis2Curr = lis2Curr.getNext();
                        lis1Curr = lis1Curr.getNext();
                    }
                    if (lis1Curr.getValue() == lis2Curr.getValue()) {
                        lis1.setNext(null);
                        return ogLis1;
                    }
                }
            }
            lis1 = lis1.getNext();
        }
        return null;
    }

    public static void main(String[] args) {
        Node<Integer> lis1 = new Node<Integer>(6);
        Node<Integer> curr = lis1;
        curr.setNext(new Node<Integer>(18));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(2));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(7));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(5));
        Node<Integer> lis2 = new Node<Integer>(6);
        lis2.setNext(new Node<Integer>(18));
        System.out.println(removeList(lis1, lis2));
    }
}
