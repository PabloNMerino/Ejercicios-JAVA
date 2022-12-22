package states;

public class Pagando implements Estado{

    @Override
    public Estado agregarProducto() {
        System.out.println("");
        return this;
    }

    @Override
    public Estado cancelarCarrito() {
        return new Vacio();
    }

    @Override
    public Estado volverAlPuntoAnterior() {
        return new Cargando();
    }

    @Override
    public Estado siguienteEstado() {
        return new Cerrado();
    }
}
