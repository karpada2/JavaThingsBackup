public class Main {

    public static boolean isPalindrome(Node<Integer> list) {
        Node<Integer> curr = list;
        int last = 0;
        while (curr != null) {
            last = curr.getValue();
            curr = curr.getNext();
        }
        Node<Integer> reverseList = new Node<Integer>(last);
        curr = list.getNext();
        while (curr != null) {
            reverseList = new Node<Integer>(curr.getValue(), reverseList);
            curr = curr.getNext();

        }
        curr = list;
        while (curr != null) {
            if (curr.getValue() != reverseList.getValue()) {
                return false;
            }
            reverseList = reverseList.getNext();
            curr = curr.getNext();
        }
        return true;
    }

    public static void main(String[] args) {
        Node<Integer> list = new Node<Integer>(-9);
        Node<Integer> curr = list;
        curr.setNext(new Node<Integer>(-4));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(0));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(1));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(-4));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(-9));
        curr = curr.getNext();
        System.out.println(isPalindrome(list));
    }
}
