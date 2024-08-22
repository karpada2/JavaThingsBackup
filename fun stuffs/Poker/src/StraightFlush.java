public class StraightFlush implements Combinations{

    @Override
    public int calculateScore(Card[] arr) {
        int[][] suitsCounters = new int[4][15]; //indexes 1-14 are used only

        for (int i = 0; i < arr.length; i++) {
            suitsCounters[Card.charSuitToInt(arr[i].getSuit())][arr[i].getValue()]++;
            if (arr[i].getValue() == 14) {
                suitsCounters[Card.charSuitToInt(arr[i].getSuit())][1]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int k = suitsCounters[i].length - 1; k >= 1; k--) {
                if (suitsCounters[i][k] == 1) {
                    boolean isStraight = true;
                    for (int d = k; d > k-5; d--) {
                        if (suitsCounters[i][d] < 1) {
                            isStraight = false;
                        }
                    }
                    if (isStraight) {
                        return 80000 + (k * 5 - 1 - 2 - 3 - 4);
                    }
                }
            }
        }

        return 0;
    }
}
