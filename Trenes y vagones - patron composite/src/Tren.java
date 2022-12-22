import java.util.ArrayList;
import java.util.List;

public class Tren {

    private List <VagonCompuesto> superTren;

    public Tren() {
        superTren = new ArrayList<VagonCompuesto>();
    }

    public void agregarParte (VagonCompuesto vc){
        superTren.add(vc);
    }

    public Double calcularArea (){
        double resultado = 0.0;
        for (VagonCompuesto v: superTren) {
            resultado += v.calcularArea();
        }
        return resultado;
    }
}
