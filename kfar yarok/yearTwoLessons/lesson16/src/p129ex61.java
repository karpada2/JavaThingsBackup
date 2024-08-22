public class p129ex61 {
    public static<T> Node<T> middle(Node<T> n) {
        Node<T> goTwice = n;
        while (goTwice.hasNext()) {
            goTwice = goTwice.getNext().getNext();
            n = n.getNext();
        }
        return n;
    }
}
