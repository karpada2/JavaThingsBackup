import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static Node<Integer> buildList(int size) {
        System.out.println("Enter index 0 number");
        Node<Integer> start = new Node<Integer>(sc.nextInt());
        Node<Integer> current = start;
        for (int i = 1; i < size; i++) {
            System.out.println("Enter index " + i + " number");
            current.setNext(new Node<Integer>(sc.nextInt()));
            current = current.getNext();
        }
        return start;
    }

    public static Node<Integer> addToEndOfList(Node<Integer> list, int num) {
        Node<Integer> temp = list;
        while (temp.hasNext()) {
            temp = temp.getNext();
        }
        temp.setNext(new Node<Integer>(num));
        return list;
    }

    public static Node<Integer> addToStartOfList(Node<Integer> list, int num) {
        Node<Integer> temp = list;
        list = new Node<Integer>(num);
        list.setNext(temp);
        return list;
    }

    public static boolean isAppear(Node<Integer> list, int num) {
        Node<Integer> current = list;
        while(current.hasNext()) {
            if (current.getValue() == num) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public static int size(Node<Integer> list) {
        if (list == null) {
            return 0;
        }
        int size = 1;
        Node<Integer> current = list;
        while(current.hasNext()) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public static void main(String[] args) {
        System.out.println("Enter wanted size of list");
        int size = sc.nextInt();
        Node<Integer> list = buildList(size);

        System.out.println("Enter integer to add to the end of the list");
        list = addToEndOfList(list, sc.nextInt());
        System.out.println(list);
        System.out.println("Enter integer to add to the start of the list");
        list = addToStartOfList(list, sc.nextInt());
        System.out.println(list);
        System.out.println("Enter integer to scan for in the list");
        System.out.println("Appears: " + isAppear(list, sc.nextInt()));
        System.out.println("Size: " + size(list));
    }
}
