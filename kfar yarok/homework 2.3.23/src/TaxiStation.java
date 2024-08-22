public class TaxiStation {
    private String stationName;
    private Taxi[] stationTaxis = new Taxi[80];
    private int lastAddedTaxiIndex = -1;
    //constructor
    public TaxiStation() {}
    public void addTaxi(String driverName, String taxiId, int numPass) {
        lastAddedTaxiIndex++;
        stationTaxis[lastAddedTaxiIndex] = new Taxi(driverName, taxiId, numPass);
    }
    public int numTaxis() {
        return lastAddedTaxiIndex+1;
    }
}
