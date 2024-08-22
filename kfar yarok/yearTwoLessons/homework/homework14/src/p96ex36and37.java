import java.util.*;

public class p96ex36and37 {

    static Scanner sc = new Scanner(System.in);

    public static Node<Integer> removeFirstAppearance(int num, Node<Integer> list) {
        Node<Integer> returnList;
        if (list.getValue() == num) {
            return list.getNext();
        } else {
            returnList = new Node<Integer>(list.getValue());
        }
        Node<Integer> curr = returnList;

        while (true) {
            list = list.getNext();
            if (list.getValue() == num) {
                curr.setNext(list.getNext());
                return returnList;
            }
            curr.setNext(new Node<Integer>(list.getValue()));
            curr = curr.getNext();
        }
    }

    public static int biggestNum(Node<Integer> list) {
        int biggest = list.getValue();
        while (list != null) {
            if (list.getValue() > biggest) {
                biggest = list.getValue();
            }
            list = list.getNext();
        }
        return biggest;
    }

    public static Node<Integer> clone(Node<Integer> list) {
        Node<Integer> clone = new Node<Integer>(list.getValue());
        Node<Integer> curr = clone;
        list = list.getNext();
        while (list != null) {
            curr.setNext(new Node<Integer>(list.getValue()));
            curr = curr.getNext();
            list = list.getNext();
        }
        return clone;
    }

    public static void sort(Node<Integer> givenList) {
        Node<Integer> clonedGivenList = clone(givenList);
        int biggest = biggestNum(clonedGivenList);
        Node<Integer> sorted = new Node<Integer>(biggest);
        clonedGivenList = removeFirstAppearance(biggest, clonedGivenList);

        while (clonedGivenList != null) {
            biggest = biggestNum(clonedGivenList);
            sorted = new Node<Integer>(biggest, sorted);
            clonedGivenList = removeFirstAppearance(biggest, clonedGivenList);
        }

        givenList.setValue(sorted.getValue());
        givenList.setNext(sorted.getNext());
    }

    public static Node<Integer> returnSortedInputList() {
        System.out.println("Enter number");
        int input = sc.nextInt();
        if (input == -999) {
            return null;
        }
        Node<Integer> list = new Node<Integer>(input);
        Node<Integer> curr = list;
        System.out.println("Enter number");
        input = sc.nextInt();
        while (input != -999) {
            curr.setNext(new Node<Integer>(input));
            curr = curr.getNext();
            System.out.println("Enter number");
            input = sc.nextInt();
        }
        sort(list);
        return list;
    }

    public static void main(String[] args) {
        Node<Integer> test = new Node<Integer>(745);
        Node<Integer> curr = test;
        curr.setNext(new Node<Integer>(66));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(-24));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(165));
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(66));


        sort(test);
        System.out.println(test);
        System.out.println(returnSortedInputList());
    }
}
