public class TwoPair implements Combinations{

    @Override
    public int calculateScore(Card[] arr) {
        int[] counterArray = new int[15]; //only indexes 2-14 are used cuz lazy
        for (int i = 0; i < counterArray.length; i++) {
            counterArray[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            counterArray[arr[i].getValue()]++;
        }

        boolean foundFirstPair = false;

        for (int i = counterArray.length -1 ; i >= 2; i++) {
            if (counterArray[i] == 2) {
                int firstPairIndex = 0;
                if (foundFirstPair) {
                    return 20000 + i + firstPairIndex;
                } else {
                    foundFirstPair = true;
                    firstPairIndex = i;
                }
            }
        }

        return 0;
    }
}
