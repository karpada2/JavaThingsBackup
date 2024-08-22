import java.util.Objects;

public class Card {
    private int value; //2-14 (14 is ace), if -1 mean unusable

    private char suit; //S - spades, H - hearts, C - clubs (tiltan), D - diamonds

    public Card(int value, char suit) {
        this.value = value;
        this.suit = suit;
    }

    public Card(Card anotherCard) {
        this.value = anotherCard.value;
        this.suit = anotherCard.suit;
    }

    public char getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public static String charSuitToString(char suit) { // must be capitalized
        switch(suit) {
            case 'S':
                return "Spades";

            case 'H':
                return "Hearts";

            case 'C':
                return "Clubs";

            case 'D':
                return "Diamonds";
            default:
                return "ERROR";
        }
    }

    public static String charSuitToSymbol(char suit) { // must be capitalized
        switch(suit) {
            case 'S':
                return "♤";

            case 'H':
                return "♡";

            case 'C':
                return "♧";

            case 'D':
                return "♢";
            default:
                return "ERROR";
        }
    }

    public static String intValueToString(int value) {
        if (value < 2 || value > 14) {
            return "ERROR";
        }

        String[] conversion = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        return conversion[value-2];
    }

    public static char intSuitToChar(int suit) {
        char[] intSuitToChar = {'S', 'H', 'C', 'D'};
        return intSuitToChar[suit];
    }

    public static int charSuitToInt(char suit) {
        if (suit == 'S') {
            return 0;
        }
        if (suit == 'H') {
            return 1;
        }
        if (suit == 'C') {
            return 2;
        }
        if (suit == 'D') {
            return 3;
        }
        return -1;
    }

    public String returnCardName() {
        return intValueToString(this.value) + " of " + charSuitToString(this.suit);
    }

    public boolean equalsNonCard(int value, int suit) {
        return (this.value == value && this.suit == intSuitToChar(suit));
    }

    public String returnCardSymbolism() {
        if (this.value >= 11) {
            return intValueToString(this.value).charAt(0) + charSuitToSymbol(this.suit);
        } else {
            return this.value + charSuitToSymbol(this.suit);
        }
    }
}
