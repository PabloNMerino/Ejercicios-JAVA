package Factory;

import Cancion.Cancion;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CancionFlyweightFactory {

    private static final HashMap<String, Cancion> cancionMap = new HashMap<>();

    public Cancion obtenerCancion(String nombre) {
        Cancion cancionBuscada = cancionMap.get(nombre);
        if(Objects.isNull(cancionBuscada)) {
            cancionBuscada = new Cancion(nombre);
            cancionMap.put(nombre, cancionBuscada);
            System.out.println("--- Cancion creada ---");
            System.out.println(" Nombre: " + nombre);
            return cancionBuscada;
        }
        System.out.println("--- Recuperando cancion ---");
        System.out.println(" Nombre: " + nombre);
        return cancionBuscada;
    }

    public void eliminarCancion(String nombre) {
        Cancion cancionBuscada = cancionMap.get(nombre);
        if(Objects.isNull(cancionBuscada)){
            System.out.println('"' + nombre + '"' + " NO EXISTE");
        }
        else {
            cancionMap.remove(nombre);
            System.out.println('"' + nombre + '"' + " eliminado existosamente");
        }
    }

    public void verListaDeReproduccion() {
    for(Map.Entry<String, Cancion> c : cancionMap.entrySet()){
        System.out.println("---------------");
        System.out.println("Artista: " + c.getValue().getArtista());
        System.out.println("---------------");
        System.out.println("Cancion: " + c.getValue().getNombre());
        System.out.println("---------------");
        System.out.println("Genero: " + c.getValue().getGenero());
        System.out.println("\n");
    }
    }
}
