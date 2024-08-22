public class Straight implements Combinations{

    @Override
    public int calculateScore(Card[] arr) {
        int[] counterArr = new int[15]; //only indexes 1-14 are used cuz me lazy, index 1 is counted as Ace
        for (int i = 0; i < arr.length; i++) {
            counterArr[arr[i].getValue()]++;
            if (arr[i].getValue() == 14) {
                counterArr[1]++;
            }
        }

        for (int i = counterArr.length - 1; i >= 1; i--) {
            if (counterArr[i] >= 1) {
                boolean isExist = true;
                for (int k = i; k > i-5; k--) {
                    if (counterArr[k] < 1) {
                        isExist = false;
                    }
                }
                if (isExist) {
                    return 40000 + i * 5 - 1 - 2 - 3 - 4;
                }
            }
        }

        return 0;
    }
}
