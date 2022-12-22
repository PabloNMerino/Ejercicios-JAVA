package states;

public class Vacio implements Estado{

    @Override
    public Estado agregarProducto() {
        return new Cargando();
    }

    @Override
    public Estado cancelarCarrito() {
        return this;
    }

    @Override
    public Estado volverAlPuntoAnterior() {
        return this;
    }

    @Override
    public Estado siguienteEstado() {
        return new Cargando();
    }

}
