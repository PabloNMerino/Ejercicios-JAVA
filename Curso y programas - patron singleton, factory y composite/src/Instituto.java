import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private String nombre;
    private List <Cursos> cursos;

    public Instituto(String nombre) {
        this.nombre = nombre;
        cursos = new ArrayList<Cursos>();
    }

    public void generarInforme(){
        for (Cursos c:cursos) {
            System.out.println("Curso: " + c.getNombre() + "\nPrecio: " + c.calcularPrecio());
            System.out.println("--------");
        }
    }

    public void agregarCurso (String codigo){
        try {
            cursos.add(CursoFactory.getInstance().crearCurso(codigo));
        } catch (CursoException ce) {
            System.err.println(ce.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }
}
