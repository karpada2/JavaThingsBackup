public class Resume {
    private String name;
    private int age;
    private int maxPlaces;
    private JobHistory[] jobs;
    private int counter;
    public Resume(String name, int age, int maxPlaces) {
        jobs = new JobHistory[maxPlaces];
        this.maxPlaces = maxPlaces;
        this.name = name;
        this.age = age;
    }
    public int jobTypeSeniority(String jobType) {
        int sum = 0;
        for (int i = 0; i < jobs.length; i++) {
            if (jobs[i].getJobType().equals(jobType)) {
                sum += jobs[i].seniority();
            }
        }
        return sum;
    }
}
