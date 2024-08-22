public class menu {
    private String name;
    private course[] menuItems;
    private int counter;
    public void moshe(String f) {
        for (int i = 0; i < this.counter; i++) {
            for (int j = 0; j < menuItems[i].getCounter(); j++) {
                if (menuItems[i].doesNotHasIngredient(f)) {
                    System.out.println(menuItems[i].getCode());
                }
            }
        }
    }
}
