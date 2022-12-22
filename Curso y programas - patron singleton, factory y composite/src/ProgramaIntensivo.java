import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends Cursos{

    private List <Cursos> cursos;
    private Double bonificacion;

    public ProgramaIntensivo(String nombre, String descripcion) {
        super(nombre, descripcion);
        this.bonificacion = 15.0;
        cursos = new ArrayList<Cursos>();
    }

    public void agregarCurso (String codigo){
        try {
            cursos.add(CursoFactory.getInstance().crearCurso(codigo));
        } catch (CursoException ce) {
            System.err.println(ce.getMessage());
        }
    }


    @Override
    public Double calcularPrecio() {
        Double precioFinal = 0.0;
        for (Cursos c: cursos) {
            precioFinal += c.calcularPrecio();
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "ProgramaIntensivo{" +
                "nombre= " + this.getNombre() +
                "cursos=" + cursos +
                ", bonificacion=" + bonificacion +
                '}';
    }
}
