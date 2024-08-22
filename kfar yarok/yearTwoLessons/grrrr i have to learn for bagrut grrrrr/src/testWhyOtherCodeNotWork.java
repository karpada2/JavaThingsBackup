public class testWhyOtherCodeNotWork {
    public static void main(String[] args) {
        Node<NumCount> n1 = new Node<>(new NumCount(3, 2));
        Node<NumCount> n = new Node<>(new NumCount(1,1), n1);
        OrderedLst olst = new OrderedLst(n);

        olst.insertNUm(4);
    }
}
