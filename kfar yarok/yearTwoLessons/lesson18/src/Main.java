public class Main {

    public static<T> int size(Node<T> list) {
        int size = 0;
        while (list != null) {
            size++;
            list = list.getNext();
        }
        return size;
    }

    public static<T> Node<T> mergedPoint(Node<T> lis1, Node<T> lis2) {
        int size1 = size(lis1);
        int size2 = size(lis2);
        while (size2 > size1) {
            lis2 = lis2.getNext();
            size2--;
        }
        while (size1 > size2) {
            lis1 = lis1.getNext();
            size1--;
        }
        while (lis1 != lis2) {
            lis1 = lis1.getNext();
            lis2 = lis2.getNext();
        }
        return lis1;
    }

    public static void main(String[] args) {
        Node<Integer> lis1 = null;
        Node<Integer> lis2 = null;
        for (int i = 10; i > 0; i--) {
            if (i == 4) {
                lis2 = new Node<Integer>(i, lis1);
            }
            lis1 = new Node<Integer>(i, lis1);
        }
        for (int i = 3; i > 0; i--) {
            lis2 = new Node<Integer>(i, lis2);
        }
        System.out.println(mergedPoint(lis1, lis2));
    }
}
