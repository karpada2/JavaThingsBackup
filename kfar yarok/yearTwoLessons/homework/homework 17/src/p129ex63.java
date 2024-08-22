import java.util.*;

public class p129ex63 {

    static Scanner sc = new Scanner(System.in);
    public static BinNode<Integer> buildReverse() {
        int i = sc.nextInt();
        BinNode<Integer> b = null;
        while (i != -999) {
            b = new BinNode<>(null, i, b);
            if (b.hasRight()) {
                b.getRight().setLeft(b);
            }
            i = sc.nextInt();
        }
        return b;
    }

    public static<T> String binNodeToString(BinNode<T> list) {
        String out = "null <---> ";
        BinNode<T> curr = list;
        while (curr.hasLeft()) {
            curr = curr.getLeft();
        }

        while (curr != null) {
            out += curr.getValue() + " <---> ";
            curr = curr.getRight();
        }

        return out + "null";
    }

    public static void main(String[] args) {
        BinNode<Integer> test = buildReverse();
        System.out.println(binNodeToString(test));
    }
}
