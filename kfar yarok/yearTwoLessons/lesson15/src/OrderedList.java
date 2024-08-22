public class OrderedList {
    private Node<NumCount> lst;

    public OrderedList(Node<NumCount> head) {
        this.lst = head;
    }

    public void insertNum(int num) {
        if (lst.getValue().getNum() > num) {
            lst = new Node<NumCount>(new NumCount(num, 1), lst);
        } else {
            Node<NumCount> curr = lst;
            while (curr != null) {
                if (curr.getValue().getNum() == num) {
                    curr.getValue().setCount(curr.getValue().getCount() + 1);
                }
                else if (curr.getValue().getNum() < num) {
                    if (curr.getNext() == null) {
                        curr.setNext(new Node<NumCount>(new NumCount(num, 1)));
                        curr = curr.getNext();
                    } else if (curr.getNext().getValue().getNum() > num) {
                        curr.setNext(new Node<NumCount>(new NumCount(num, 1), curr.getNext()));
                        curr = curr.getNext();
                    }
                }
                curr = curr.getNext();
            }
        }
    }

    public int valueN(int n) {
        Node<NumCount> curr = lst;
        while (true) {
            n -= curr.getValue().getCount();
            if (n <= 0) {
                return curr.getValue().getNum();
            }
            curr = curr.getNext();
        }
    }

    @Override
    public String toString() {
        return "OrderedList{" +
                "lst=" + lst +
                '}';
    }
}
