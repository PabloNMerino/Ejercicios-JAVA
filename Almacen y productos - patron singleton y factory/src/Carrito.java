import states.Estado;
import states.Vacio;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private Estado estadoActual;
    private List<Producto> productos;

    public Carrito (){
        estadoActual = new Vacio();
        productos = new ArrayList<Producto>();
    }

    public void mostrarEstadoActual(){
        switch (estadoActual.getClass().getSimpleName()){
            case "Vacio":{
                System.out.println("Usted se encuentra con el CARRITO VACIO en espera para agregar productos");
                break;
            }
            case "Cargando":{
                System.out.println("Usted se encuentra CARGANDO el carrito al momento");
                break;
            }
            case "Pagando":{
                System.out.println("Usted se encuentra en la caja para PAGAR los productos");
                break;
            }
            default:{
                System.out.println("Usted ya CERRO su pedido");
            }
        }
    }

    public void agregarProductoAlCarrito (Producto p){
        estadoActual = estadoActual.agregarProducto();
        productos.add(p);
        System.out.println("--- Se agrego el producto: " + p.getDescripcion() + " de $" + p.getPrecio() + " ---");
    }

    public void vaciarCarrito(){
        estadoActual = estadoActual.cancelarCarrito();
        productos.removeAll(productos);
        System.out.println("--- Se vacio el carrito de compras ---");
    }

    public void volverAtras(){
        estadoActual = estadoActual.volverAlPuntoAnterior();
        System.out.println("--- Se regreso a " + estadoActual.getClass().getSimpleName() + " ---");
    }

    public void avanzar(){
        estadoActual = estadoActual.siguienteEstado();
        if(estadoActual.getClass().getSimpleName().equals("Pagando")){
            System.out.println("Hora de pagar, usted debe $" + this.verTotal());
        }
    }

    public void verProductos (){
        for (Producto p : productos){
            System.out.println(p.getDescripcion() + " $" + p.getPrecio());
        }
    }

    public double verTotal (){
        double total = 0.0;
        for (Producto p: productos) {
            total += p.getPrecio();
        }
        return total;
    }


}
