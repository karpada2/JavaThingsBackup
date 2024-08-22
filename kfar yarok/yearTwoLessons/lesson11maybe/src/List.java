public class List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public List() {
        head = null;
        tail = head;
        size = 0;
    }

    public List(T value) {
        head = new Node<T>(value);
        tail = head;
        size = 1;
    }

    public void add(T value) {
        if (head == null) {
            head = new Node<T>(value);
            tail = head;
            size = 1;
        } else {
            tail.setNext(new Node<T>(value));
            tail = tail.getNext();
            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public void replace(int index, T value) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            current.setValue(value);
        }
    }

    public void insert(int index, T value) {
        if (index > size) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (index == size) {
            add(value);
        } else {
            if (index == 0) {
                head = new Node<T>(value, head);
            } else {
                Node<T> current = head;
                for (int i = 0; i < index-1; i++) {
                    current = current.getNext();
                }
                Node<T> temp = current.getNext();
                current.setNext(new Node<T>(value, temp));
            }
        }
    }

    public T get(int index) {
        Node<T> current = head;
        for (int i = 0; i <= index; i++) {
            current = current.getNext();
        }
        return current.getValue();
    }

    @Override
    public String toString() {
        String str = "[";
        Node<T> curr = this.head;

        while (curr != null) {
            if (curr.hasNext())
                str += curr.getValue() + " --> ";
            else
                str += curr.getValue();
            curr = curr.getNext();
        }

        return str + "]";
    }
}
