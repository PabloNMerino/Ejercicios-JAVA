import utils.Luchador;
import utils.Volador;

public class Bombardero extends SistemaArmas implements Luchador, Volador {

    public Bombardero(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Soy un bombardero y ataco");
    }

    @Override
    public void defender() {
        System.out.println("Soy un bombardero y defiendo");
    }

    @Override
    public void volar() {
        System.out.println("Soy un bombardero y vuelo");
    }
}
