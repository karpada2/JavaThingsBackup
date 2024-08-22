public class p116ex50 {

    public static double newPercent(Competitor c) {
        return (double)(c.getAfterWeightGrams()) / c.getBeforeWeightGrams();
    }

    public static void printWinner(Node<Competitor> list) {
        Competitor best = list.getValue();
        list = list.getNext();
        while (list != null) {
            if (newPercent(list.getValue()) < newPercent(best)) {
                best = list.getValue();
            }
            list = list.getNext();
        }
        System.out.println(best.getName());
    }

    public static void main(String[] args) {

    }
}
