public class Main {
    public static void main(String[] args) {
        Tanque tanque1 = new Tanque(100);
        tanque1.atacar();
        System.out.println("Soy un tanque y mi energia es de " + tanque1.getEnergia());

        System.out.println("----------------------------------------");

        RobotLiviano robot1 = new RobotLiviano(200);
        robot1.volar();
        System.out.println("Soy un robot liviano y mi energia es de " + robot1.getEnergia());

        System.out.println("----------------------------------------");

        Bombardero bomb1 = new Bombardero(300);
        bomb1.defender();
        System.out.println("Soy un bombardero y mi energia es de " + bomb1.getEnergia());

    }
}
