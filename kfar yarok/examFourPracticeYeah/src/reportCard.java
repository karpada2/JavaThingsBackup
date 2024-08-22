public class reportCard {
    private String stuName;
    private subject[] subArray;
    public reportCard(String name, int num) {
        this.stuName = name;
        subArray = new subject[num];
    }
    public double average() {
        int sum = 0;
        for (int i = 0; i < subArray.length; i++) {
            sum += subArray[i].getGrade();
        }
        return sum/(double)(subArray.length);
    }
    public boolean isAsian() {
        for (int i = 0; i < this.subArray.length; i++) {
            if (this.subArray[i].getGrade() <= 54) {
                return false;
            }
        }
        if (this.average() < 85) {
            return false;
        }
        for (int i = 0; i < this.subArray.length; i++) {
            if (this.subArray[i].getGrade() == 100) {
                return true;
            }
        }
        return false;
    }
}
