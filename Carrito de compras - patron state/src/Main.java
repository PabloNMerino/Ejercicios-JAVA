import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declarar productos
        Producto producto1 = new Producto("Arroz re picante", 650.50);
        Producto producto2 = new Producto("Yerba re cara", 1250.10);
        Producto producto3 = new Producto("Manteca vencida", 320.70);
        Producto producto4 = new Producto("Birra fruta noble", 1400.0);
        Producto producto5 = new Producto("Mandarinas para comer bajo el sol", 450.30);

        //Declarar carrito
        Carrito carrito1 = new Carrito();

        //Cargar productos al carrito

        carrito1.agregarProductoAlCarrito(producto1);
        carrito1.agregarProductoAlCarrito(producto2);
        carrito1.agregarProductoAlCarrito(producto3);

        carrito1.mostrarEstadoActual();

        carrito1.vaciarCarrito();

        carrito1.mostrarEstadoActual();

        carrito1.agregarProductoAlCarrito(producto4);
        carrito1.agregarProductoAlCarrito(producto5);

        carrito1.mostrarEstadoActual();

        System.out.println("El total es: $" + carrito1.verTotal());

        carrito1.avanzar();

        carrito1.mostrarEstadoActual();

        carrito1.avanzar();

        carrito1.mostrarEstadoActual();
        System.out.println("gracias chau");

    }
}
