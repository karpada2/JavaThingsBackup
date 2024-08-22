public class Competitor {
    private String name;
    private int beforeWeightGrams;
    private int afterWeightGrams;

    public Competitor(String name, int beforeWeightGrams, int afterWeightGrams) {
        this.name = name;
        this.beforeWeightGrams = beforeWeightGrams;
        this.afterWeightGrams = afterWeightGrams;
    }

    public String getName() {
        return name;
    }

    public int getAfterWeightGrams() {
        return afterWeightGrams;
    }

    public int getBeforeWeightGrams() {
        return beforeWeightGrams;
    }
}
