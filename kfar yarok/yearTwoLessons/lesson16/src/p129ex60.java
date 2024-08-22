public class p129ex60 {
    public static<T> Node<T> reverse(Node<T> n) { //Works in O(n)
        Node<T> r = null;
        while (n != null) {
            r = new Node<T>(n.getValue(), r);
            n = n.getNext();
        }
        return r;
    }

    public static<T> boolean isPalindrome(Node<T> n) {
        Node<T> r = reverse(n);
        while (n != null) {
            if (!n.getValue().equals(r.getValue())) {
                return false;
            }
            n = n.getNext();
            r = r.getNext();
        }
        return true;
    }
}
