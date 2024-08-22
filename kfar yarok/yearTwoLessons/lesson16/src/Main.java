public class Main {
    public static<T> Node<T> reverse(Node<T> n) { //works in O(n) where n is the size of the list
        Node<T> r = null;
        while (n != null) {
            r = new Node<T>(n.getValue(), r);
            n = n.getNext();
        }
        return r;
    }

    public static<T> boolean isPalindrome(Node<T> n) { //works in O(n), since reverse is used once and then goes over every element in the list
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

    public static<T> Node<T> middle(Node<T> n) { //works in O(n) where n is the size of the list, becuase it goes over the whole list once
        Node<T> goTwice = n;
        while (goTwice.hasNext()) {
            goTwice = goTwice.getNext().getNext();
            n = n.getNext();
        }
        return n;
    }

    public static void main(String[] args) {
        Node<Integer> test = new Node<Integer>(15);
        Node<Integer> curr = test;
        curr.setNext(new Node<Integer>(186));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(116));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(3457));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(6456));
        curr = curr.getNext();

        System.out.println("list: " + test);
        System.out.println("middle: " + middle(test));
        System.out.println("palindrome: " + isPalindrome(test));

        curr.setNext(new Node<Integer>(-216));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(6456));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(3457));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(116));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(186));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(15));

        System.out.println("list: " + test);
        System.out.println("palindrome: " + isPalindrome(test));
    }
}
