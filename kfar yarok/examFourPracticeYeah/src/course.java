public class course {
    private int code;
    private String name;
    private String[] ingredients;
    private int counter;
    public int getCode() {
        return this.code;
    }
    public int getCounter() {
        return this.counter;
    }
    public String getName() {
        return this.name;
    }
    public String[] getIngredients() {
        return this.ingredients;
    }
    public boolean doesNotHasIngredient(String ingredient) {
        for (int i = 0; i < ingredients.length; i++) {
            if (ingredients[i] == ingredient) {
                return false;
            }
        }
        return true;
    }
}
