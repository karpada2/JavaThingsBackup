public class Queue<T> {
    protected Node<T> first;
    protected Node<T> last;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    public void insert(T t) {
        Node<T> tmp = new Node<T>(t);
        if (this.last == null)
            this.first = tmp;
        else
            this.last.setNext(tmp);
        this.last = tmp;
    }

    public T remove() {
        T tmp = this.first.getValue();
        this.first = this.first.getNext();
        if (this.first == null)
            this.last = null;
        return tmp;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public T head() {
        return this.first.getValue();
    }

    @Override
    public String toString() {
        String str = "[";
        Node<T> curr = this.first;

        while (curr != null) {
            if (curr.hasNext())
                str += curr.getValue() + ", ";
            else
                str += curr.getValue();
            curr = curr.getNext();
        }

        return str + "]";
    }
}