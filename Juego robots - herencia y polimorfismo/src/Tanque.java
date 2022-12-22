import utils.Luchador;

public class Tanque extends SistemaArmas implements Luchador {

    public Tanque(Integer energia) {
        super(energia);
    }


    @Override
    public void atacar() {
        System.out.println("Soy un tanque y ataco");
    }

    @Override
    public void defender() {
        System.out.println("Soy un tanque y defiendo");
    }
}
