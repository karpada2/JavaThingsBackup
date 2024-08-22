public class FullHouse implements Combinations{
    private int[] returnAmounts(Card[] arr) {
        int[] counterArr = new int[15]; //only indexes 2-14 are used

        for (int i = 0; i < arr.length; i++) {
            counterArr[arr[i].getValue()]++;
        }

        return counterArr;
    }

    @Override
    public int calculateScore(Card[] arr) {
        int[] counterArr = returnAmounts(arr);

        boolean foundTriple = false;
        int tripleIndex = 0;

        for (int i = counterArr.length - 1; i >= 2; i--) {
            if (counterArr[i] >= 3 && !foundTriple) {
                foundTriple = true;
                tripleIndex = i;
                counterArr[i] = 0;
            }
        }

        if (foundTriple) {
            for (int i = counterArr.length - 1; i >= 2; i--) {
                if (counterArr[i] >= 2) {
                    return 60000 + tripleIndex * 100 + i;
                }
            }
        }

        return 0;
    }
}
