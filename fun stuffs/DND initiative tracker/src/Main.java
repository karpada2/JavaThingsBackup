import java.util.*;

public class Main {

    public static int[] slowSort(int[] arr) {
        int[] returnArr = new int[arr.length];
        int returnArrIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            returnArr[returnArrIndex] = arr[minIndex(arr)];
            returnArrIndex++;
            arr[minIndex(arr)] = -1;
        }
        return returnArr;
    }

    public static int minIndex(int[] arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void rollEnemyInitiatives(enemy[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].rollInitiative();
        }
    }

    //recieves the enemy array, the indexes of enemies to hurt, and the same with players.
    public static void dealMultipleDamage(enemy[] enemyArr, int[] enemyIndexes, player[] playerArr, int[] playerIndexes, int damage) {
        enemyIndexes = slowSort(enemyIndexes);
        playerIndexes = slowSort(playerIndexes);
        int enemyIndex = 0;
        for (int i = 0; i < enemyArr.length; i++) {
            if (i == enemyIndexes[enemyIndex]) {
                enemyArr[i].dealDamage(damage);
                enemyIndex++;
            }
        }
        int playerIndex = 0;
        for (int i = 0; i < playerArr.length; i++) {
            if (i == playerIndexes[playerIndex]) {
                playerArr[i].dealDamage(damage);
                playerIndex++;
            }
        }
    }

    public static void healMultipleDamage(enemy[] enemyArr, int[] enemyIndexes, player[] playerArr, int[] playerIndexes, int healing) {
        enemyIndexes = slowSort(enemyIndexes);
        playerIndexes = slowSort(playerIndexes);
        int enemyIndex = 0;
        for (int i = 0; i < enemyArr.length; i++) {
            if (i == enemyIndexes[enemyIndex]) {
                enemyArr[i].healDamage(healing);
                enemyIndex++;
            }
        }
        int playerIndex = 0;
        for (int i = 0; i < playerArr.length; i++) {
            if (i == playerIndexes[playerIndex]) {
                playerArr[i].healDamage(healing);
                playerIndex++;
            }
        }
    }

    public static int biggestInitiativeIndex(enemy[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[maxIndex].getHadATurn() && arr[i].getHadATurn() == false) {
                maxIndex = i;
                continue;
            }
            if (arr[i].getInitiative() > arr[maxIndex].getInitiative() && arr[i].getHadATurn() == false) {
                maxIndex = i;
            } else if (arr[i].getInitiative() == arr[maxIndex].getInitiative()) {
                if (arr[maxIndex].getDEX() < arr[i].getDEX()) {
                    maxIndex = i;
                }
            }
        }
        if (arr[maxIndex].getHadATurn() == false) {
            return maxIndex;
        }
        return -1; // all thingies here already did smth this turn

    }

    public static int biggestInitiativeIndex(player[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[maxIndex].getHadATurn() && arr[i].getHadATurn() == false) {
                maxIndex = i;
                continue;
            }
            if (arr[i].getInitiative() > arr[maxIndex].getInitiative() && arr[i].getHadATurn() == false) {
                maxIndex = i;
            } else if (arr[i].getInitiative() == arr[maxIndex].getInitiative()) {
                if (arr[maxIndex].getDEX() < arr[i].getDEX()) {
                    maxIndex = i;
                }
            }
        }
        if (arr[maxIndex].getHadATurn() == false) {
            return maxIndex;
        }
        return -1; // all thingies here already did smth this turn

    }

    //String name, int maxHP, int health, int DEX, int initiative
    public static void inputPlayerStats(player[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            System.out.println("Input player number " + i + "'s name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Input player number " + i + "'s max health: ");
            int maxHP = sc.nextInt();
            System.out.println("Input player number " + i + "'s current health: ");
            int health = sc.nextInt();
            System.out.println("Input player number " + i + "'s DEX stat(not modifier): ");
            int DEX = sc.nextInt();
            System.out.println("Input player number " + i + "'s rolled initiative total: ");
            int initiative = sc.nextInt();
            arr[i-1] = new player(name, maxHP, health, DEX, initiative);
        }
    }

    public static void inputEnemyStats(enemy[] arr, int types) {
        int idNUM = 0; //aka place in arr
        for (int i = 1; i <= types; i++) {
            System.out.println("Enter enemy type " + i + "'s name (e.g. 'owl Bear', 'goblin'): ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter " + name + "'s max health: ");
            int maxHP = sc.nextInt();
            System.out.println("Are all " + name + "s on max health? ");
            sc.nextLine();
            boolean allMaxHealth = (sc.nextLine().equalsIgnoreCase("yes"));
            System.out.println("Enter " + name + "'s DEX stat(NOT MODIFIER): ");
            int DEX = sc.nextInt();
            System.out.println("How many " + name + "s are there?");
            int typeAmount = sc.nextInt();
            if (allMaxHealth) {
                for (int j = 1; j <= typeAmount; j++) {
                    arr[idNUM] = new enemy(name+j, maxHP, maxHP, DEX);
                    idNUM++;
                }
            } else {
                for (int j = 1; j <= typeAmount; j++) {
                    System.out.println("Enter " + name + " number " + j + "'s current health:");
                    arr[idNUM] = new enemy(name+j, maxHP, sc.nextInt(), DEX);
                    idNUM++;
                }
            }
        }
    }




    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("how to use: ");
        System.out.println("1). In yes/no question, enter 'YES' or 'NO'. capitalization does not matter.");
        System.out.println("2). In questions that ask for numbers, write the number in decimal.");
        System.out.println("3). In questions that ask for strings (aka words and sentences), input however you want. capitalization does not matter.");
        System.out.println("4). When entering the names for enemies, this program will number them.");
        System.out.println("5). In this program, all characters inputted as players will go first in case of a tie in initiative.");
        System.out.println("6). When the program asks for multiple indexes, such as which enemies to hurt, input your wanted serial numbers, and end the inputting with -1.");
        System.out.println("7). If asked for one of multiple answers, dont be dumb, follow directions. capitalization does not matter.");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Enter amount of player characters/BBEGs and the likes: ");
        int playerAmount = sc.nextInt();
        player[] playerArr = new player[playerAmount];
        player currentPlayer;

        System.out.println("Enter amount of types of enemies(e.g. if there's skeletons and zombies, input '2'): ");
        int enemyTypeAmount = sc.nextInt();

        System.out.println("Enter amount of total enemies: ");
        int enemyTotalAmount = sc.nextInt();
        enemy[] enemyArr = new enemy[enemyTotalAmount];

        System.out.println("You will now start inputting enemies and players.");
        inputEnemyStats(enemyArr, enemyTypeAmount);
        inputPlayerStats(playerArr);

        String answer;
        boolean ready = false;
        while (!ready) {
            System.out.println("When you're ready to start the combat, write 'ready', and press enter");
            sc.nextLine();
            ready = sc.nextLine().equalsIgnoreCase("ready");
        }
        System.out.println("Rolling enemies' initiatives...");
        rollEnemyInitiatives(enemyArr);
        for (int i = 0; i < enemyArr.length; i++) {
            System.out.println(enemyArr[i].getInitiative());
        }
        boolean anythingElse = true;
        if (playerArr[biggestInitiativeIndex(playerArr)].getInitiative() >= enemyArr[biggestInitiativeIndex(enemyArr)].getInitiative()) {
            currentPlayer = playerArr[biggestInitiativeIndex(playerArr)];
            System.out.println("It's " + currentPlayer.getName() + "'s turn!");
            System.out.println("Health: " + currentPlayer.getHealth());
            System.out.println("Unconscious: " + currentPlayer.isUnconscious());
            System.out.println("Should I print all the players' stats?");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                for (int i = 0; i < playerArr.length; i++) {
                    System.out.println("[ SERIAL NUMBER: " + playerArr[i].playerSpecificSerialNumber + ", NAME: " + playerArr[i].getName() + ", HEALTH: " + playerArr[i].getHealth() + "/" + playerArr[i].getMaxHP() + "]");
                }
            }
            System.out.println("Does " + currentPlayer.getName() + " want to do anything else in their turn(attack, heal, no)?");
            answer = sc.nextLine();
            if (answer.equalsIgnoreCase("attack")) {
                System.out.println("Printing all enemies' stats...");
                for (int i = 0; i < enemyArr.length; i++) {
                    System.out.println("[ SERIAL NUMBER: " + enemyArr[i].enemySpecificSerialNumber + ",NAME: " + enemyArr[i].getName() + ", HEALTH: " + enemyArr[i].getHealth() + "/" + enemyArr[i].getMaxHP() + "]");
                }
                System.out.println("How many enemies would you like to attack?");
                int[] enemyAttackIndexes = new int[sc.nextInt()];
                System.out.println("Now enter the serial numbers of the enemies you want to attack, separated by spaces and finish by pressing enter. (e.g. [1 2 5 9 12{PRESSING ENTER}] )");
                for (int i = 0; i < enemyAttackIndexes.length; i++) {
                    
                }
            }
        }
    }
}
