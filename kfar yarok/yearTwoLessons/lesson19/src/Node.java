public class Node<T>
{
    //תכונות

    private T value;
    private Node<T> next;

    //בנאים
    public Node(T value)
    {
        this.value = value;
        this.next = null;
    }

    public Node(T value, Node<T> next)
    {
        this.value = value;
        this.next = next;
    }

    public T getValue()
    {
        return this.value;
    }
    public Node<T> getNext()
    {
        return this.next;
    }

    public Boolean hasNext()
    {
        return (this.next != null);
    }

    public void setValue(T value)
    {
        this.value=value;
    }
    public void setNext(Node<T> next)

    {
        this.next = next;
    }
    public  String toString()
    {
        return this.value + "--> " + this.next;
    }
}