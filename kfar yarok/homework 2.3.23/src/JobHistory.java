public class JobHistory {
    private int startYear;
    private int finalYear;
    private String company;
    private String jobType;
    public int seniority() {
        return finalYear-startYear;
    }
}
