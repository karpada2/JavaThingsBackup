import java.util.*;

public class p134ex19 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HiTec company = new HiTec();

        System.out.println("CREATE: input worker code and then ID, with 0 for the code to end");
        int code = sc.nextInt();
        int ID = sc.nextInt();
        while (code != 0) {
            System.out.println("-------");
            company.addWorker(new Worker(ID), code);

            code = sc.nextInt();
            ID = sc.nextInt();
        }

        System.out.println("DELETE: input worker code and then amount, with 0 for the code to end");
        code = sc.nextInt();
        int amount = sc.nextInt();
        while (code != 0) {
            System.out.println("-----");
            company.deleteMultiple(code, amount);

            code = sc.nextInt();
            amount = sc.nextInt();
        }
    }
}
