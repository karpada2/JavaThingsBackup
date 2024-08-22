public class Couple {
    private int num;
    private int appears;

    public Couple(int appears, int num) {
        this.num = num;
        this.appears = appears;
    }

    public int getAppears() {
        return appears;
    }

    public int getNum() {
        return num;
    }

    public void setAppears(int appears) {
        this.appears = appears;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
