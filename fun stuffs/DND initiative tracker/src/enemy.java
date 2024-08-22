public class enemy {
    private int maxHP;
    private int health; // if you not understand you have the damage of the brain
    private String name; // ask user to add numbers to help keep track OR in Main add it by checking if the name reciveed
                         // is the same as the others, then get the highest number in the end that has the same name, and add it yourself
                         // or you can just be a normal person OR alternatibely you can do it after all the names have been inputted
                         // with a simple for loop for each new enemy type. do whatever you have like a month or smth
    private boolean dead = false; //true means he ded
    private int initiative; // honestly just initiative
    private int DEX; // the monster's DEX stat

    public static int enemySerialNumber = 0;

    public int enemySpecificSerialNumber;

    private boolean hadATurn = false;

    public int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }

    public void rollInitiative() {
        this.initiative = random(1, 20) + (this.DEX-10)/2;
    }

    public void dealDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.dead = true;
        }
    }

    public void healDamage(int healing) {
        this.health += healing;
        if (this.health >= 1) {
            this.dead = false;
        }
        if (this.health > this.maxHP) {
            this.health = this.maxHP;
        }
    }

    public enemy(String name, int maxHP, int health, int DEX) {
        this.name = name;
        this.maxHP = maxHP;
        this.health = health;
        this.DEX = DEX;
        if (this.health <= 0) {
            this.dead = true;
        }
        enemySpecificSerialNumber = enemySerialNumber;
        enemySerialNumber++;

    }

    //copyCat
    public enemy(enemy anotherEnemy) {
        this.maxHP = anotherEnemy.maxHP;
        this.health = anotherEnemy.health;
        this.name = anotherEnemy.name;
        this.dead = anotherEnemy.dead;
        this.initiative = anotherEnemy.initiative;
        this.DEX = anotherEnemy.DEX;
        this.enemySpecificSerialNumber = anotherEnemy.enemySpecificSerialNumber;
        this.hadATurn = anotherEnemy.hadATurn;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getEnemySpecificSerialNumber() {
        return enemySpecificSerialNumber;
    }

    public String getName() {
        return name;
    }

    public int getDEX() {
        return DEX;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public boolean getHadATurn() {
        return this.hadATurn;
    }

    public void setHadATurn(boolean hadATurn) {
        this.hadATurn = hadATurn;
    }
}
