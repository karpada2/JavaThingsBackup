public class player {
    private int maxHP;
    private int health;
    private String name;
    private boolean unconscious = false;
    private int initiative;
    private int DEX;
    public static int playerSerialNumber = 0;
    public int playerSpecificSerialNumber;
    private boolean hadATurn = false;

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public void dealDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            this.unconscious = true;
        }
    }

    public void healDamage(int healing ) {
        this.health += healing;
        if (this.health >= 1) {
            this.unconscious = false;
        }
        if (this.health > this.maxHP) {
            this.health = this.maxHP;
        }
    }

    public player(String name, int maxHP, int health, int DEX, int initiative) {
        this.name = name;
        this.maxHP = maxHP;
        this.health = health;
        this.DEX = DEX;
        if (this.health <= 0) {
            this.unconscious = true;
        }
        this.initiative = initiative;
        playerSpecificSerialNumber = playerSerialNumber;
        playerSerialNumber++;
    }

    public String getName() {
        return name;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getDEX() {
        return DEX;
    }

    public boolean getHadATurn() {
        return this.hadATurn;
    }

    public boolean isUnconscious() {
        return unconscious;
    }

    public void setUnconscious(boolean unconscious) {
        this.unconscious = unconscious;
    }

    public void setHadATurn(boolean hadATurn) {
        this.hadATurn = hadATurn;
    }
}


