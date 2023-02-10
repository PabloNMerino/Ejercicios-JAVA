public class Entity {

    private String name;
    private int health;
    private int damagePower;
    private boolean isAlive;


    /* ---- CONSTRUCTOR ---- */

    public Entity(String name, int damagePower) {
        this.name = name;
        this.damagePower = damagePower;
        this.health = 100;
        this.isAlive = true;
    }

    /* ---- SETTERS ---- */

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamagePower(int damagePower) {
        this.damagePower = damagePower;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    /* ---- GETTERS ---- */

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamagePower() {
        return damagePower;
    }

    /* ---- DEAL DAMAGE ---- */
    public void dealDamage(){};

}