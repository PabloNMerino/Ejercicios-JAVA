public class Human extends Entity{

    private int armor;

    public Human(String name, int damagePower) {
        super(name, damagePower);
      this.armor = 100;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    /* ---- DEAL DAMAGE ---- */
    public void dealDamage(Alien enemy) {
        if(enemy.getAlienType().equals("ROGUE")) {
            System.out.println("---> Attacking alien type " + enemy.getAlienType() + ", you have 1 chance of 3 to have a successful attack");
            //Thread.sleep(1500);
            int hitChance = (int) Math.floor(Math.random()*(3) + 1);
            if(hitChance == 3) {
                enemy.setHealth(enemy.getHealth()-this.getDamagePower());
                System.out.println(" +++ Attack successful! +++ ");
                System.out.println("-!!!- " + enemy.getName() + " now has " + enemy.getHealth() + " HP");
            }
            else {
                System.out.println("--- Attack missed ---");
            }
        }
        if(enemy.getAlienType().equals("TANK")) {
            System.out.println("---> Attacking alien type " + enemy.getAlienType() + ", the alien is getting bigger and now has a thicker skin!");
            enemy.setHealth(enemy.getHealth() - (this.getDamagePower()/2));
            System.out.println(" +++ Acertaste el ataque! +++ ");
            System.out.println("-!!!- " + enemy.getName() + " now has " + enemy.getHealth() + " HP");
        }
    }
}
