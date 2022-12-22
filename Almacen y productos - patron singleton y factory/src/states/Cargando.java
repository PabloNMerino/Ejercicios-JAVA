package states;

public class Cargando implements Estado{

    @Override
    public Estado agregarProducto() {
        return this;
    }

    @Override
    public Estado cancelarCarrito() {
        return new Vacio();
    }

    @Override
    public Estado volverAlPuntoAnterior() {
        return new Vacio();
    }

    @Override
    public Estado siguienteEstado() {
        return new Pagando();
    }
}
