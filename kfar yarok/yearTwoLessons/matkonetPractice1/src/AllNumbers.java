public class AllNumbers {
    private int[] arrayNum;

    public AllNumbers(int[] arrayNum) {
        this.arrayNum = arrayNum;
    }

    public int[] getArrayNum() {
        return arrayNum;
    }

    public void setArrayNum(int[] arrayNum) {
        this.arrayNum = arrayNum;
    }

    public int flValue() {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < this.arrayNum.length && even == 0; i++) {
            if (this.arrayNum[i]%2 == 0) {
                even = this.arrayNum[i];
            }
        }
        for (int i = this.arrayNum.length-1; i >= 0 && odd == 0; i--) {
            if (this.arrayNum[i]%2 != 0) {
                odd = this.arrayNum[i];
            }
        }
        if (odd*even != 0) {
            return Math.abs(odd)*even;
        }
        return 0;
    }
}
