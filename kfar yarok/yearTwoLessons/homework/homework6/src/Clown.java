public class Clown {
    private String id;
    private double weight;

    public Clown(double weight, String id) {
        this.weight = weight;
        this.id = id;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Clown{" +
                "id='" + id + '\'' +
                ", weight=" + weight +
                '}';
    }
}
