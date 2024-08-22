public class p115ex48 {

    public static int amountMatching(DominoStone stone, Node<DominoStone> list) {
        int amount = 0;
        while (list != null) {
            if (list.getValue().appears(stone.getNum1()) || list.getValue().appears(stone.getNum2())) {
                amount++;
            }
            list = list.getNext();
        }
        return amount;
    }
}
