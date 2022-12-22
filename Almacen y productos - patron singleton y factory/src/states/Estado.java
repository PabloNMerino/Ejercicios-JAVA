package states;

public interface Estado {

    Estado agregarProducto();

    Estado cancelarCarrito();

    Estado volverAlPuntoAnterior();

    Estado siguienteEstado();

}
