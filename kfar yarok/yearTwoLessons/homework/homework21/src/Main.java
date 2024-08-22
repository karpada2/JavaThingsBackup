import java.util.*;

public class Main {
    public static boolean isFatherToEqual(BinNode<Integer> t) {
        if (t == null) {
            return false;
        }
        BinNode<Integer> l = t.getLeft();
        BinNode<Integer> r = t.getRight();
        if (l != null && l.hasRight() && !l.hasLeft() && l.getRight().getValue()*-1 == l.getValue()) {
            return true;
        }
        if (r != null && !r.hasRight() && r.hasLeft() && r.getLeft().getValue()*-1 == r.getValue()) {
            return true;
        }
        return false;
    }

    public static int amountOfEqual(BinNode<Integer> t) {
        if (t == null) {
            return 0;
        }
        if (isFatherToEqual(t)) {
            return 1 + amountOfEqual(t.getLeft()) + amountOfEqual(t.getRight());
        }
        return amountOfEqual(t.getLeft()) + amountOfEqual(t.getRight());
    }

    public static void printPreOrder(BinNode<Integer> node) {
        if (node != null) {
            // Print the current node's data
            System.out.print(node.getValue().toString() + ", ");

            // Traverse the left subtree
            printPreOrder(node.left);


            // Traverse the right subtree
            printPreOrder(node.right);
        }
    }

    public static<T> BinNode<T> treeArrToTree(T[][] arr, int level, int index) {
        if (level == arr.length) {
            return null;
        }
        if (arr[level][index] == null) {
            return null;
        }
        BinNode<T> a = new BinNode<T>(arr[level][index]);
        a.setLeft(treeArrToTree(arr, level+1, index * 2));
        a.setRight(treeArrToTree(arr, level+1, (index * 2) + 1));
        return a;
    }

    public static<T> BinNode<T> treeArrToTree(T[][] arr) {
        return treeArrToTree(arr, 0, 0);
    }

    static Scanner sc = new Scanner(System.in);

    public static Integer[][] initializeTreeArr(int depth) {
        if (depth < 0) {
            return null;
        }
        Integer[][] arr = new Integer[depth+1][1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Integer[(int)(Math.pow(2, i))];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = null;
            }
        }
        return arr;
    }

    public static Integer[][] inputToTreeArr() {
        System.out.println("-99 means insert null, input depth of tree");
        Integer[][] arr = initializeTreeArr(sc.nextInt());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Input element in: (" + i + "," + j + "). if -99 is inputted, null will be inserted.");
                int in = sc.nextInt();
                if (in != -99) {
                    arr[i][j] = in;
                }
            }
        }
        return arr;
    }

    public static int sum(BinNode<Integer> T) {
        if (T == null) {
            return 0;
        }
        return T.getValue() + sum(T.getLeft()) + sum(T.getRight());
    }

    public static boolean isThereEqualToNum(BinNode<Integer> T, int num) {
        if (T == null) {
            return false;
        }
        if (sum(T) == num) {
            return true;
        }
        return isThereEqualToNum(T.getLeft(), num) || isThereEqualToNum(T.getRight(), num);
    }

    public static void main(String[] args) {
        Integer[][] arr = {
                            {8},
                            {6, -4},
                            {20, 20, 4, null},
                            {null, -20, null, null, null, 5, null, null}
                          };
        System.out.println(amountOfEqual(treeArrToTree(arr)));
        System.out.println(isThereEqualToNum(treeArrToTree(arr), -20));
    }
}
