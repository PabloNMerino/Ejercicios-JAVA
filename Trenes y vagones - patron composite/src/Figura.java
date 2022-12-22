public abstract class Figura implements VagonCompuesto{

    String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public abstract Double calcularArea();
}
