public class Main {
    public static int toNumber(Queue<Integer> q) {
        int out = 0;
        for (int i = 1; !q.isEmpty(); i*=10) {
            out += q.remove() * i;
        }
        return out;
    }

    public static int bigNumber(Node<Queue<Integer>> lst) {
        if (lst == null) {
            return 0;
        }
        int biggest = toNumber(lst.getValue());
        lst = lst.getNext();
        while (lst != null) {
            if (toNumber(lst.getValue()) > biggest) {
                biggest = toNumber(lst.getValue());
            }
            lst = lst.getNext();
        }
        return biggest;
    }

    public static int minValue(Node<Integer> l) {
        int min = l.getValue();
        l = l.getNext();
        while (l != null) {
            if (l.getValue() < min) {
                min = l.getValue();
            }
            l = l.getNext();
        }
        return min;
    }

    public static int maxValue(Node<Integer> l) {
        int max = l.getValue();
        l = l.getNext();
        while (l != null) {
            if (l.getValue() > max) {
                max = l.getValue();
            }
            l = l.getNext();
        }
        return max;
    }

    public static boolean isArranged(Node<Integer> list) {
        Node<Integer> secondHalf = list.getNext();
        Node<Integer> curr = list.getNext();
        while (curr.hasNext()) {
            secondHalf = secondHalf.getNext();
            curr = curr.getNext().getNext();
        }
        Node<Integer> firstHalf = new Node<Integer>(list.getValue());
        curr = firstHalf;
        while (list != secondHalf) {
            curr.setNext(new Node<Integer>(list.getValue()));
            curr = curr.getNext();
            list = list.getNext();
        }
        return maxValue(firstHalf) < minValue(secondHalf);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
        q.insert(6);
        q.insert(9);
        q.insert(1);
        System.out.println(toNumber(q));
    }
}
