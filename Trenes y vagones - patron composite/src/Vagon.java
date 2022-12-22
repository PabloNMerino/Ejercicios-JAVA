import java.util.ArrayList;
import java.util.List;

public class Vagon implements VagonCompuesto{

    private List<VagonCompuesto> figuras;

    public Vagon() {
        figuras = new ArrayList<VagonCompuesto>();
    }

    @Override
    public Double calcularArea() {
        Double resultado = 0.0;
        for (VagonCompuesto f : figuras) {
            resultado += f.calcularArea();
        }
        return resultado;
    }

    public void agregarFigura (VagonCompuesto vc){
        figuras.add(vc);
    }
}
