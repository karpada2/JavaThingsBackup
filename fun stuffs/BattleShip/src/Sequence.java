public class Sequence {
    int d;
    int first;
    int last;

    public Sequence(int d, int first, int last) {
        this.d = d;
        this.first = first;
        this.last = last;
    }

    public int getD() {
        return d;
    }

    public int getFirst() {
        return first;
    }

    public int getLast() {
        return last;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public void setLast(int last) {
        this.last = last;
    }
}
