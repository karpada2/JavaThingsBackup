public class Stack<T> {
    private Node<T> head;

    public Stack() {
        head = null;
    }

    public void push(T x) {
        head = new Node<T>(x, head);
    }

    public T top() {
        return this.head.getValue();
    }

    public T pop() {
        T temp = this.top();
        head = head.getNext();
        return temp;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public String toString() {
        return "Stack{" + this.head + "}";
    }
}
