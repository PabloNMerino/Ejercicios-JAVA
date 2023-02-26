import Cancion.Cancion;
import Factory.CancionFlyweightFactory;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        CancionFlyweightFactory listaDeReproduccion = new CancionFlyweightFactory();

        Cancion cancion1 = listaDeReproduccion.obtenerCancion("Feel Good Inc.");
        cancion1.setArtista("Gorillaz");
        cancion1.setGenero("Rock Alternativo / Electropop");
        System.out.println("\n");

        Cancion cancion2 = listaDeReproduccion.obtenerCancion("New Gold (feat. Tame Impala and Bootie Brown)");
        cancion2.setArtista("Gorillaz");
        cancion2.setGenero("Rock Alternativo / Electropop");
        System.out.println("\n");


        Cancion cancion3 = listaDeReproduccion.obtenerCancion("Silent Running (feat. Adeleye Omotayo)");
        cancion3.setArtista("Gorillaz");
        cancion3.setGenero("Rock Alternativo / Electropop");
        System.out.println("\n");


        Cancion cancion4 = listaDeReproduccion.obtenerCancion("DARE");
        cancion4.setArtista("Gorillaz");
        cancion4.setGenero("Rock Alternativo / Electropop");
        System.out.println("\n");


        Cancion cancion5 = listaDeReproduccion.obtenerCancion("Empire Ants (feat. Little Dragon)");
        cancion5.setArtista("Gorillaz");
        cancion5.setGenero("Rock Alternativo / Electropop");
        System.out.println("\n");


        Cancion cancion6 = listaDeReproduccion.obtenerCancion("DARE");
        Cancion cancion7 = listaDeReproduccion.obtenerCancion("Silent Running (feat. Adeleye Omotayo)");
        System.out.println("\n");


        listaDeReproduccion.verListaDeReproduccion();

        listaDeReproduccion.eliminarCancion("DARE");
        listaDeReproduccion.eliminarCancion("Asd");
        System.out.println("\n");

        listaDeReproduccion.verListaDeReproduccion();





    }

}
