public class p115ex49 {
    public static Node<Character> expandList(Node<amountChar> list) {
        Node<Character> reversedList = null;
        while (list != null) {
            for (int i = 0; i < list.getValue().getNum(); i++) {
                reversedList = new Node<Character>(list.getValue().getTav(), reversedList);
            }
            list = list.getNext();
        }
        Node<Character> returnList = null;
        while (reversedList != null) {
            returnList = new Node<Character>(reversedList.getValue(), returnList);
            reversedList = reversedList.getNext();
        }
        return returnList;
    }

    public static void main(String[] args) {

    }
}
