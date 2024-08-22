public class Queue <T>{

    private Node<T> head;
    private Node<T> tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public T head() {
        return head.getValue();
    }

    public void insert(T x) {
        if (isEmpty()) {
            tail = new Node<T>(x);
            head = tail;
        } else {
            head = new Node<T>(x, head);
        }
    }

    public T remove() {
        T temp = head.getValue();
        head = head.getNext();
        return temp;
    }

    @Override
    public String toString() {
        return "Queue{" + head + "}";
    }
}
