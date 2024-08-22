public class Main {
    public static Node<Integer> cloneList(Node<Integer> head) {
        Node<Integer> c = new Node<>(head.getValue());
        Node<Integer> curr = c;
        head = head.getNext();
        while (head != null) {
            curr.setNext(new Node<Integer>(head.getValue()));
            head = head.getNext();
            curr = curr.getNext();
        }
        return c;
    }

    public static void main(String[] args) {
        OrderedList orderList = new OrderedList(new Node<NumCount>(new NumCount(1, 1)));
        orderList.insertNum(24);
        orderList.insertNum(41);
        orderList.insertNum(268);
        orderList.insertNum(24);
        orderList.insertNum(75);
        orderList.insertNum(41);
        orderList.insertNum(24);
        orderList.insertNum(4353);
        orderList.insertNum(6);
        System.out.println(orderList);

    }
}
