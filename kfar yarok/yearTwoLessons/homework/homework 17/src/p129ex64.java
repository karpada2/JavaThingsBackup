import java.util.*;

public class p129ex64 {

    static Scanner sc = new Scanner(System.in);

    public static<T> void mergeBinNodes(BinNode<T> list1, BinNode<T> list2) {
        BinNode<T> end = list1;
        while (end.hasRight()) {
            end = end.getRight();
        }
        while (end.getLeft() != list1) {
            end = end.getLeft();
            list1 = list1.getRight();
        }
        list1.setRight(list2);
        list2.setLeft(list1);
        while (list2.hasRight()) {
            list2 = list2.getRight();
        }
        list2.setRight(end);
        end.setLeft(list2);
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

    public static BinNode<Integer> buildReverseBinNode() {
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

    public static void main(String[] args) {
        BinNode<Integer> l1 = buildReverseBinNode();
        BinNode<Integer> l2 = buildReverseBinNode();
        mergeBinNodes(l1, l2);
        System.out.println(binNodeToString(l1));
    }
}
