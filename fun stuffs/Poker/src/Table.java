import java.util.*;

public class Table {
    private Card[] deck;

    private Player[] players;

    public static Scanner sc = new Scanner(System.in);

    private int mainPot;

    private int miniPot;

    private int rounds; //how many rounds until end of play

    private Card[] flop; // first 3 community cards
    private Card turn; // 4th community card
    private Card river; // 5th community card

    public Table(int playerNum, int startingMoney, int rounds, int smallBlindAmount) { //playerNum must be at least 3, rounds at least 2, smallBlindAmount is default to 0.005 of startingMoney
        if (smallBlindAmount >= startingMoney/5) {
            smallBlindAmount = startingMoney/200;
        }
        deck = new Card[52];
        int insertIndex = 0;
        char[] intSuitToChar = {'S', 'H', 'C', 'D'};

        for (int suit = 0; suit <= 3; suit++) { //create all cards in order
            for (int value = 2; value <= 14; value++) {
                deck[insertIndex] = new Card(value, intSuitToChar[suit]);
                insertIndex++;
            }
        }

        shuffleCardArr(deck);

        this.players = new Player[playerNum];
        sc.nextLine();
        for (int i = 0; i < this.players.length; i++) { //create all the players with the appropriate amount of money and the name
            System.out.println("Please enter player " + i + "'s name");
            if (i == 0) {
                this.players[i] = new Player(startingMoney, sc.nextLine(), i, 'D');
            } else if (i == 1) {
                this.players[i] = new Player(startingMoney, sc.nextLine(), i, 'S');
                this.players[i].betCall(smallBlindAmount);
                miniPot += smallBlindAmount;
            } else if (i == 2) {
                this.players[i] = new Player(startingMoney, sc.nextLine(), i, 'B');
                this.players[i].betCall(smallBlindAmount*2);
                miniPot += smallBlindAmount*2;
            } else {
                this.players[i] = new Player(startingMoney, sc.nextLine(), i);
            }
            this.players[i].setHand(deck[deck.length - 1 - i], deck[(deck.length - 1 - i) - playerNum]); // gives the player the appropriate cards
        }

        flop = new Card[3];
        for (int i = 1; i <= 3; i++) {
            flop[i-1] = (deck[deck.length - 1 - playerNum - playerNum - i]);
        }

        this.miniPot = 0;
        this.mainPot = 0;

        this.rounds = rounds;

        if (playerNum == 3) {
            playerAction(0, 10, 10);
            
        }
    }

    public static void shuffleCardArr(Card[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexToSwap = Utils.random(0, arr.length-1);
            Card temp = arr[i];
            arr[i] = arr[indexToSwap];
            arr[indexToSwap] = temp;
        }
    }

    public void transferMiniPotToMainPot() {
        mainPot += miniPot;
        miniPot = 0;
    }

    public void playerAction(int playerSeat, int lastBet, int lastIncrease) { //seat ranges from 0 to numPlayer-1
        this.players[playerSeat].printInfo();
        System.out.println("What would you like to do? (call, fold, raise[bet], or check)");
        String action = sc.nextLine();
        if (action.equalsIgnoreCase("call")) {
            this.players[playerSeat].betCall(lastBet);
        } else if (action.equalsIgnoreCase("fold")) {
            this.players[playerSeat].fold();
        } else if (action.equalsIgnoreCase("raise")) {
            System.out.println("Enter amount to raise by: (previous bet: " + lastBet + ", must bet at least: " + lastIncrease +")");
            int raiseAmount = sc.nextInt();
            while (raiseAmount >= lastIncrease) {
                System.out.println("TOO LOW OF A RAISE! TRY AGAIN");
                raiseAmount = sc.nextInt();
            }
            this.players[playerSeat].betCall(lastBet + raiseAmount);
        } else {

        }
    }

    public static Card[] sortByValueAndDivideToSuits(Card[] arr) {
        Card[] returnArr = new Card[arr.length];
        int currentIndex = 0;

        for (int suit = 0; suit < 4; suit++) {
            for (int value = 2; value <= 14; value++) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].equalsNonCard(value, suit)) {
                        returnArr[currentIndex] = new Card(arr[i]);
                        currentIndex++;
                    }
                }
            }
        }

        return returnArr;
    }

    // each combo has a strength value, 1.0 for high card, 2.0 for pair, 3.0 for 3 pair, etc.
    // Highest card (for example 14 in royal flush) is added as 0.num, so a royal flush is 9.14
    // since it has no real difference from straight flush, other than ending in 14.
    // e.g: Jack high card: 1.11, Flush is all cards combined, so [5C, 7C, 8C, 10C, 13C] will be 6.0 + 0.05 + 0.07 + 0.08 + 0.10 + 0.13 = 6.43
    // if there is still a tie, highest cards will win, such that previous example will win over [6C, 7C, 8C, 10C, 12C], since highest card king is stronger than queen.
    // two pair with J and 5 will be 3.0 + 0.05 + 0.11 = 3.16, in case of tie it will be decided by highest pair,
    // such that a player with two pair 6 and 10, will lose cause his highest pair is lower.

    // nevermind the idea with float was stupid cuz computer say "0.1+0.2=0.300...04" so combo strength will be the hunderds
    // and the tens and ones will be determined by the cards, so a full house of 3 Aces and 2 kings, will be 700 + 3*14 + 2*13 = 768
    // actually full house specifically will be evaluated somehow else (still not sure how), but for everything else that is the idea
    // so two pair of A and 7 will be 300 + 14*2 + 7*2 = 342, meaning it will lose to a two pair of 10 and Q, cuz 300 + 10*2 + 12*2 = 344

    // these comments are getting ridiculous, but overall strength will be tens of thousands
    // (Pair is 10,000, TwoPair 20,000, ThreeOfKind 30,000, Straight 40,000, Flush 50,000, FullHouse 60,000, FourOfKind 70,000 StraightFlush 80,000)
    // then specifically in full house, the three of a kind is giving us the value * 100, so it's always more significant then the pair
    // and uh ye. summarised, {6(FullHouse),12(QueenThree),14(AcePair)} = 61,214

    // also create method without turn, river, and flop (for first round)

    public static int playerHighCard(Card[] hand) {
        if (hand[0].getValue() > hand[1].getValue()) {
            return hand[0].getValue();
        } else {
            return hand[1].getValue();
        }
    }

    public static int evaluateStrength(Card[] playerHand, Card[] flop, Card turn, Card river) {
        Combinations[] combos = {new Pair(), new TwoPair(), new ThreeOfKind(), new Straight(), new Flush(), new FullHouse(), new FourOfKind(), new StraightFlush()};
        int strongest = playerHighCard(playerHand);

        Card[] arr = {new Card(playerHand[0]), new Card(playerHand[1]), new Card(flop[0]), new Card(flop[1]), new Card(flop[2]), new Card(turn), new Card(river)};

        arr = sortByValueAndDivideToSuits(arr);

        for (int i = 0; i < combos.length; i++) {
            if (combos[i].calculateScore(arr) > strongest) {
                strongest = combos[i].calculateScore(arr);
            }
        }

        return strongest;
    }

    public static int evaluateStrength(Card[] playerHand, Card[] flop, Card turn) {
        Combinations[] combos = {new Pair(), new TwoPair(), new ThreeOfKind(), new Straight(), new Flush(), new FullHouse(), new FourOfKind(), new StraightFlush()};
        int strongest = playerHighCard(playerHand);

        Card[] arr = {new Card(playerHand[0]), new Card(playerHand[1]), new Card(flop[0]), new Card(flop[1]), new Card(flop[2]), new Card(turn)};

        arr = sortByValueAndDivideToSuits(arr);

        for (int i = 0; i < combos.length; i++) {
            if (combos[i].calculateScore(arr) > strongest) {
                strongest = combos[i].calculateScore(arr);
            }
        }

        return strongest;
    }

    public static int evaluateStrength(Card[] playerHand, Card[] flop) {
        Combinations[] combos = {new Pair(), new TwoPair(), new ThreeOfKind(), new Straight(), new Flush(), new FullHouse(), new FourOfKind(), new StraightFlush()};
        int strongest = playerHighCard(playerHand);

        Card[] arr = {new Card(playerHand[0]), new Card(playerHand[1]), new Card(flop[0]), new Card(flop[1]), new Card(flop[2])};

        arr = sortByValueAndDivideToSuits(arr);

        for (int i = 0; i < combos.length; i++) {
            if (combos[i].calculateScore(arr) > strongest) {
                strongest = combos[i].calculateScore(arr);
            }
        }

        return strongest;
    }

    public static int evaluateStrength(Card[] playerHand) {
        Combinations[] combos = {new Pair()};
        int strongest = playerHighCard(playerHand);

        Card[] arr = {new Card(playerHand[0]), new Card(playerHand[1])};

        arr = sortByValueAndDivideToSuits(arr);

        for (int i = 0; i < combos.length; i++) {
            if (combos[i].calculateScore(arr) > strongest) {
                strongest = combos[i].calculateScore(arr);
            }
        }

        return strongest;
    }

}
