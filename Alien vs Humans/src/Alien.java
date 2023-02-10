public class Alien extends Entity {

    private AlienType alienType;

    public Alien(String name, int damagePower, AlienType alienType) {
        super(name, damagePower);
        this.alienType = alienType;
    }

    public String getAlienType() {
        return alienType.name();
    }

    /* ---- DEAL DAMAGE ---- */
    public void dealDamage(Human human) {
        if (human.getHealth()>0){
            System.out.println("---> Atacking human named " + human.getName());
            if (this.alienType.name().equals("ARMORMASTER")) {
                int originalHumanArmor = human.getArmor();
                human.setArmor(0);
                human.setHealth(human.getHealth() - super.getDamagePower());
                human.setArmor(originalHumanArmor);
                System.out.println("-!!!- Alien type " + alienType.name() + " disabled humans armor! ");

            } else {
                int resistedPorcentaje = human.getArmor() / 2;
                int finalDamage = (resistedPorcentaje * super.getDamagePower()) / 100;
                human.setHealth(human.getHealth() - finalDamage);
                System.out.println("-!!!- " + human.getName() + " now has " + human.getHealth() + " HP");
                human.setArmor(human.getArmor()-10);
            }
            if (human.getHealth() <= 0) {
                System.out.println("-!!!- " + human.getName() + " has been killed!");
                human.setAlive(false);
            }
        }
        else {
            System.out.println("-!!!- " + human.getName() + " is already dead, you can't kill what already died +++");
        }
    }

    public void stillAlive(Human human) {
        if(human.getHealth() > 0) {
            System.out.println("-!!!- " + human.getName() + " now has " + human.getHealth() + " HP");
        }
        else {
            human.setAlive(false);
            System.out.println("-!!!- " + human.getName() + " has been killed!");
        }
    }
}
