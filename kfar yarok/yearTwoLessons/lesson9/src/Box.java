public class Box {
    private double amount;
    private int kind;

    public Box(double amount, int kind) {
        this.kind = kind;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public int getKind() {
        return kind;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Box{" +
                "amount=" + amount +
                ", kind=" + kind +
                '}';
    }
}
