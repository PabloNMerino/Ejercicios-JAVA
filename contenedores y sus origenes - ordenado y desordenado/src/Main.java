import clases.Contenedor;
import clases.Puerto;

public class Main {

    public static void main(String[] args) {

        //declaramos los contenedores y el puerto

        Contenedor cont1 = new Contenedor(1, "Argentina", false);
        Contenedor cont2 = new Contenedor(2, "Desconocida", true);
        Contenedor cont3 = new Contenedor(3, "Brasil", true);
        Contenedor cont4 = new Contenedor(4, "Desconocida", true);
        Contenedor cont5 = new Contenedor(5, "Mexico", false);
        Contenedor cont6 = new Contenedor(6, "Noruega", false);
        Contenedor cont7 = new Contenedor(7, "Desconocida", true);
        Contenedor cont8 = new Contenedor(8, "Desconocida", false);

        Puerto puerto1 = new Puerto("Puerto re copado");

        //agregramos los contenedores a la lista contenedores de puerto1

        puerto1.agregarContenedor(cont7);
        puerto1.agregarContenedor(cont3);
        puerto1.agregarContenedor(cont1);
        puerto1.agregarContenedor(cont6);
        puerto1.agregarContenedor(cont2);
        puerto1.agregarContenedor(cont5);
        puerto1.agregarContenedor(cont4);
        puerto1.agregarContenedor(cont8);

        //mostrar lista desordenada de puerto1

        System.out.println("--------------------- Lista Desordenada ---------------------\n");
        puerto1.MostrarDesordenado();
        System.out.println("");

        //mostrarlos lista ordenada de puerto1

        System.out.println("---------------------- Lista Ordenada -----------------------\n");

        puerto1.mostrarOrdenadoPorNro();

        System.out.println("");

        //Mostrar contenedores con materiales peligrosos y de origen desconocido de puerto1

        System.out.println("--> La cantidad de contenedores peligrosos de origen desconocido son: " + puerto1.cantidadMaterialesPeligrosos());

    }



}
