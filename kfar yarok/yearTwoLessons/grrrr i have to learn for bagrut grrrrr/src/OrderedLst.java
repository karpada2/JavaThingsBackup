public class OrderedLst {
    private Node<NumCount> LST;

    public OrderedLst(Node<NumCount> lST) {
        LST = lST;
    }

    public Node<NumCount> getLST() {
        return LST;
    }

    public void setLST(Node<NumCount> lST) {
        LST = lST;
    }

    public void insertNUm(int x) {
        Node<NumCount> cur = this.getLST();
        Node<NumCount> prev = this.getLST();

        if(x > cur.getValue().getNum())
            this.setLST(new Node<>(new NumCount(x, 1), this.getLST())) ;
        else {

            while(cur != null && x > cur.getValue().getNum()) {
                prev = cur;
                cur = cur.getNext();
            }
            if(cur==null)
                prev.setNext(new Node<>(new NumCount(x,1)));

            else
                prev.setNext(new Node<>(new NumCount(x,1), cur));

        }
    }

    public String toString() {
        return "OrderedLst [LST=" + LST + "]";
    }
}