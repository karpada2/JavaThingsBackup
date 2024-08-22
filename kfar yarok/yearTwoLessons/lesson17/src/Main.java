public class Main {
    public static<T> boolean isPalindrome(BinNode<T> list) {
        BinNode<T> last = list;
        while (last.hasRight()) {
            last = last.getRight();
        }
        while (last.hasLeft()) {
            if (last.getValue() != list.getValue()) {
                return false;
            }
            last = last.getLeft();
            list = list.getRight();
        }
        return true;
    }

    public static<T> BinNode<T> middle(BinNode<T> list) {
        BinNode<T> end = list;
        while (end.hasRight()) {
            end = end.getRight().getRight();
        }
        while (true) {
            if (end == list) {
                return end;
            }
            end = end.getLeft();
            list = list.getRight();
        }
    }
}
