import utils.Luchador;
import utils.Volador;

public class RobotPesado extends SistemaArmas implements Volador, Luchador {

    public RobotPesado(Integer energia) {
        super(energia);
    }

    @Override
    public void atacar() {
        System.out.println("Soy un robot pesado y ataco");
    }

    @Override
    public void defender() {
        System.out.println("Soy un robot pesado y defiendo");
    }

    @Override
    public void volar() {
        System.out.println("Soy un robot pesado y vuelo");
    }
}
