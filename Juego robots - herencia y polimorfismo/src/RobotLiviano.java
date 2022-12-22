import utils.Luchador;
import utils.Volador;

public class RobotLiviano extends SistemaArmas implements Volador, Luchador {

    public RobotLiviano(Integer energia) {
        super(energia);
    }


    @Override
    public void atacar() {
        System.out.println("Soy un robot liviano y ataco");
    }

    @Override
    public void defender() {
        System.out.println("Soy un robot liviano y defiendo");
    }

    @Override
    public void volar() {
        System.out.println("Soy un robot liviano y vuelo");
    }
}
