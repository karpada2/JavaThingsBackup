public class car {
    private String color;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // פעולת בנאי לדוגמה:
    // פעולת בנאי זאת מגדירה את צבע ברירת
    // המחדל של המכונית להיות לבן.

    public car() {
        this.color = "white";
    }
    // פעולת בנאי זאת מקבלת צבע ומגדירה אותו:
    public car(String color) {
        this.color = color;
    }
}