public class LastPass {
    private UserAccount[] arrAcc;
    private int pinCode;
    private int current;

    private static int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public LastPass() {
        this.arrAcc = new UserAccount[100];
        this.pinCode = random(1111, 9999);
        this.current = 0;
    }

    public boolean addUser(String site, String user, int password) {

    }
}
