import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends Propiedad{

    private Integer factorMultiplicador;
    private List<Propiedad> casas;

    public BarrioCerrado(String calle, Integer numero, Integer factorMultiplicador) {
        super(calle, numero);
        this.factorMultiplicador = factorMultiplicador;
        casas = new ArrayList<Propiedad>();
    }

    public void agregarCasa (Propiedad p){
        casas.add(p);
    }


    @Override
    public Double calcularImpuesto() {
        Double sumatoriaImpuestos = 0.0;
        for (Propiedad p: casas) {
            sumatoriaImpuestos += p.calcularImpuesto();
        }
        return sumatoriaImpuestos * factorMultiplicador;
    }
}
