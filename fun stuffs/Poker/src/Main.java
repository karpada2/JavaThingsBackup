import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input amount of players that play(min 3): ");
        int playerNum = sc.nextInt();
        System.out.println("Input how much money each player should start with: ");
        int startMoney = sc.nextInt();
        System.out.println("Input how many rounds the game should play for (will end early if one player has all the money)");
        int roundNum = sc.nextInt();
        System.out.println("Input how much money the small blind should bet (Big blind bets double), reccomended: " + playerNum / 200);
        int smallBlindAmount = sc.nextInt();
        Table main = new Table(playerNum, startMoney, roundNum, smallBlindAmount);


    }
}