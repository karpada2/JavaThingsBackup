public class Taxi {
    private String taxiId;
    private String driverName;
    private int numPass;
    private boolean available;
    //constructor
    public Taxi() {
        this.available = true;
    }
    //constructor
    public Taxi(String driverName, String taxiId) {
        this.available = true;
        this.numPass = 4;
        this.driverName = driverName;
        this.taxiId = taxiId;
    }
    //constructor
    public Taxi(String driverName, String taxiId, int numPass) {
        this.available = true;
        this.numPass = numPass;
        this.driverName = driverName;
        this.taxiId = taxiId;
    }
    //makes attribute 'available' false
    public void taxiBusy() {
        this.available = false;
    }
    //below are get functions
    public boolean IsAvailable() {
        return this.available;
    }
    public int GetNumPass() {
        return this.numPass;
    }
    public String GetName() {
        return this.driverName;
    }
    public String GetId() {
        return this.taxiId;
    }
}
