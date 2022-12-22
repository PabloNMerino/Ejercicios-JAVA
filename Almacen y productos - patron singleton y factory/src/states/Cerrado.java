package states;

public class Cerrado implements Estado{

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
        return new Pagando();
    }

    @Override
    public Estado siguienteEstado() {
        return new Vacio();
    }
}
