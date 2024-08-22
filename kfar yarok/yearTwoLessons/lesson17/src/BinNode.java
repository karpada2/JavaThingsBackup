public class BinNode<T> {
    protected BinNode<T> left, right;
    protected T value;

    public BinNode(T value) {
        this.right = this.left = null;
        this.value = value;
    }

    public BinNode(BinNode<T> left, T value, BinNode<T> right) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinNode<T> getLeft() {
        return this.left;
    }

    public void setLeft(BinNode<T> left) {
        this.left = left;
    }

    public boolean hasLeft() {
        return this.left != null;
    }
    public BinNode<T> getRight() {
        return this.right;
    }

    public void setRight(BinNode<T> right) {
        this.right = right;
    }

    public boolean hasRight() {
        return this.right != null;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }
}