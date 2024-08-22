public class Flush implements Combinations{

    @Override
    public int calculateScore(Card[] arr) {
        int[] counterArray = new int[4];

        for (int i = 0; i < arr.length; i++) {
            counterArray[Card.charSuitToInt(arr[i].getSuit())]++;
        }

        for (int i = 0; i < counterArray.length; i++) {
            if (counterArray[i] >= 5) {
                int sum = 0;
                int limit = 0;
                for (int k = arr.length - 1; k >= 2; k--) {
                    if (arr[k].getSuit() == Card.intSuitToChar(i) && limit < 5) { //i is basically the Suit we have (if we do)
                        sum += arr[k].getValue();
                        limit++;
                    }
                }
                return 50000 + sum;
            }
        }

        return 0;
    }
}
