public class Main {
    public static void printWorthyNames(Resume[] resumes, int seniorityNeeded, String jobType) {
        for (int i = 0; i < resumes.length; i++) {
            if (resumes[i].jobTypeSeniority(jobType) >= seniorityNeeded) {
                System.out.println(resumes[i].getName());
            }
        }
    }
}