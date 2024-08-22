public class Player {
    private Card[] hand;

    private int money;

    private char status; //D - dealer, B - big blind, S - small blind, X - nothing

    private String name;

    private int seat;

    private boolean isIn;

    private int lastBet;

    public Player(int startingMoney, String name, int seat) {
        hand = new Card[2];
        this.money = startingMoney;
        this.name = name;
        this.seat = seat;
        this.status = 'X';
        this.isIn = true;
    }

    public Player(int startingMoney, String name, int seat, char status) {
        hand = new Card[2];
        this.money = startingMoney;
        this.name = name;
        this.status = status;
        this.seat = seat;
        this.isIn = true;
    }

    public void setHand(Card cardOne, Card cardTwo) {
        this.hand[0] = cardOne;
        this.hand[1] = cardTwo;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public char getStatus() {
        return status;
    }

    public void printInfo() {
        switch (status) {
            case 'D':
                System.out.print("Dealer ");
                break;
            case 'B':
                System.out.print("Big blind ");
                break;
            case 'S':
                System.out.print("Small blind ");
                break;
            case 'X':
                System.out.print("Player ");
                break;
            default:
                System.out.print("Error ");
                break;
        }
        System.out.println(name + " has: " + money + " Dollars.");
        System.out.println("Cards: [" + hand[0].returnCardSymbolism() + "],[" + hand[1].returnCardSymbolism() + "]");
    }

    public int getMoney() {
        return money;
    }

    public void betCall(int money) {
        this.money -= money;
        this.lastBet = money;
    }

    public void fold() {
        isIn = false;
    }

}
