import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Municipalidad {

    private List <Propiedad> propiedades;

    public Municipalidad() {
        propiedades = new ArrayList<Propiedad>();
    }

    public void agregarPropiedad (String codigo){

        try {
            propiedades.add(PropiedadFactory.getInstance().agregarPropiedad(codigo));
        } catch (PropiedadFactoryException pf) {
            System.err.println(pf.getMessage());;
        }
    }

    public void mostrarPropiedades (){
        for (Propiedad p: propiedades) {
            System.out.println("Calle : " + p.getCalle() + " Numero: " + p.getNumero() + " debe pagar: $" + p.calcularImpuesto());
        }
    }
}
