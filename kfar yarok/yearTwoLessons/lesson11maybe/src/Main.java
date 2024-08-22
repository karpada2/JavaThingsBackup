import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static int average(Node<Integer> list) {
        int sum = 0;
        int size = 0;
        if (list == null) {
            return 0;
        }
        Node<Integer> curr = list;
        while (curr.hasNext()) {
            size++;
            sum += curr.getValue();
            curr = curr.getNext();
        }
        return sum/size;
    }

    public static void printBetween(Node<Integer> list, int num1, int num2){
        if (list != null) {
            if (num1 < num2){
                int currIndex = 0;
                Node<Integer> curry = list;
                while (currIndex != num1) {
                    currIndex++;
                    curry = curry.getNext();
                }
                do {
                    System.out.println(curry.getValue());
                    currIndex++;
                    if (curry.getNext() != null) {
                        curry = curry.getNext();
                    }
                } while (currIndex != num2 + 1);
            }
            else {
                int currIndex = 0;
                Node<Integer> curry = list;
                while (currIndex != num2) {
                    currIndex++;
                    curry = curry.getNext();
                }
                do {
                    System.out.println(curry.getValue());
                    currIndex++;
                    if (curry.getNext() != null) {
                        curry = curry.getNext();
                    }
                } while (currIndex != num1+1);
            }
        }
    }

    public static Node<Integer> listWholeFollowingNumbers(int beginner, int num) {
        Node<Integer> list = new Node<Integer>(beginner);
        Node<Integer> curr = list;
        for (int i = 1; i < num; i++) {
            curr.setNext(new Node<Integer>(beginner + i));
            curr = curr.getNext();
        }
        return list;
    }

    public static boolean isBalance(Node<Integer> list) {
        int average = average(list);
        int biggerThanAverage = 0;
        int smallerThanAverage = 0;
        if (list == null) {
            return false;
        }
        Node<Integer> curr = list;
        while (curr.hasNext()) {
            if (curr.getValue() >= average) {
                biggerThanAverage++;
            }
            else {
                smallerThanAverage++;
            }
            curr = curr.getNext();
        }
        return biggerThanAverage == smallerThanAverage;
    }

    public static Node<Integer> printReversedInput() {
        int input = sc.nextInt();
        if (input == -999) {
            return null;
        }
        Node<Integer> unreversedList = new Node<Integer>(input);
        Node<Integer> curr = unreversedList;
        input = sc.nextInt();
        while (input != -999) {
            curr.setNext(new Node<Integer>(input));
            curr = curr.getNext();
            input = sc.nextInt();
        }
        if (!unreversedList.hasNext()) {
            return unreversedList;
        }
        curr = unreversedList;
        while (curr.getNext().hasNext()) {
            curr = curr.getNext();
        }
        Node<Integer> returnList = new Node<Integer>(curr.getNext().getValue());
        curr.setNext(null);
        while (unreversedList.hasNext()) {
            curr = unreversedList;
            while (curr.getNext().hasNext()) {
                curr = curr.getNext();
            }
            Node<Integer> returnListCurr = returnList;
            while (returnListCurr.hasNext()) {
                returnListCurr = returnListCurr.getNext();
            }
            returnListCurr.setNext(new Node<Integer>(curr.getNext().getValue()));
            curr.setNext(null);
        }
        curr = returnList;
        while (curr.hasNext()) {
            curr = curr.getNext();
        }
        curr.setNext(new Node<Integer>(unreversedList.getValue()));
        return returnList;
    }

    public static Node<Integer> removeInstancesOf(Node<Integer> list, int num) {
        Node<Integer> curr = list;
        while (curr.getValue() == num && curr.hasNext()) {
            curr = curr.getNext();
        }
        Node<Integer> returnList = new Node<Integer>(curr.getValue());
        Node<Integer> returnListCurr = returnList;
        while (curr.hasNext()) {
            curr = curr.getNext();
            if (curr.getValue() != num) {
                returnListCurr.setNext(new Node<Integer>(curr.getValue()));
                returnListCurr = returnListCurr.getNext();
            }
        }
        return returnList;
    }

    public static int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public static boolean inList(Node<Integer> list, int num) {
        Node<Integer> scanningCurr = list;
        if (scanningCurr.getValue() == num) {
            return true;
        }
        while (scanningCurr.hasNext()) {
            scanningCurr = scanningCurr.getNext();
            if (scanningCurr.getValue() == num) {
                return true;
            }
        }
        return false;
    }

    public static Node<Integer> randomUniqueFiftyList() {
        int randomNum = random(10, 99);
        Node<Integer> list = new Node<Integer>(randomNum);
        int size = 1;
        Node<Integer> curr = list;
        while (size < 50) {
            randomNum = random(10, 99);
            while (inList(list, randomNum)) {
                randomNum = random(10, 99);
            }
            curr.setNext(new Node<Integer>(randomNum));
            curr = curr.getNext();
            size++;
        }
        return list;
    }

    public static Node<Integer> fillRandomList(Node<Integer> list) {
        Node<Integer> returnList = new Node<Integer>(-1);
        for (int i = 99; i >= 10; i--) {
            if (i != list.getValue()) {
                returnList = new Node<Integer>(i);
            }
        }
        Node<Integer> curr = returnList;
        for (int i = 10; i < 100; i++) {
            if (i != returnList.getValue() && !inList(list, i)) {
                curr.setNext(new Node<Integer>(i));
                curr = curr.getNext();
            }
        }
        return returnList;
    }

    public static void main(String[] args) {
        Node<Integer> list = new Node<Integer>(5); //0
        Node<Integer> curr = list;
        curr.setNext(new Node<Integer>(6)); //1
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(17)); //2
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(28)); //3
        curr = curr.getNext();
        curr.setNext(new Node<Integer>(-39)); //4
        curr = curr.getNext();
        System.out.println("is balanced: " + isBalance(list));
        System.out.print("print between: ");
        printBetween(list, 2, 2);
        System.out.println("print reversed input: " + printReversedInput());
        System.out.println(listWholeFollowingNumbers(5, 4));
        curr.setNext(new Node<Integer>(6));
        System.out.println(removeInstancesOf(list, 6));
        System.out.println(removeInstancesOf(list, -39));
        Node<Integer> original = randomUniqueFiftyList();
        System.out.println(original);
        System.out.println(fillRandomList(original));
    }
}