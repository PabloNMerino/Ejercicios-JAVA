public class Main {


    public static void main(String[] args) throws Exception {
        Leon leon = new Leon("leonsito", 12, true);
        Leon leon2 = new Leon("leonsita", 9, true);

        Tigre tigre = new Tigre("CrazyTiger", -1);

        leon.correr();
        leon.determinarAlfa();

        leon2.correr();
        leon2.determinarAlfa();

        tigre.correr();
        tigre.esMayorA10();
    }
}
