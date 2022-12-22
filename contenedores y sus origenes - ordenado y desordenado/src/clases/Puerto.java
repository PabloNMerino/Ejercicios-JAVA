package clases;

import java.util.ArrayList;
import java.util.List;

public class Puerto {

    private String nombre;
    private List<Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.contenedores = new ArrayList<Contenedor>();
    }

    //Agregar contenedores a la lista

    public void agregarContenedor (Contenedor c){
        contenedores.add(c);
    }

    //Mostrar lista desordenada

    public void MostrarDesordenado (){
        for(Contenedor c : contenedores){
            System.out.println(c.toString());
        }
    }

    //Mostrar  lista ordenada por nro de identificacion

    public void mostrarOrdenadoPorNro (){
        contenedores.sort(Contenedor::compareTo);

        for (Contenedor c : contenedores){
            System.out.println(c.toString());
        }
    }

    //calcular cantidad de contenedores con materiales peligrosos y de origen desconocido

    public int cantidadMaterialesPeligrosos (){
        int cantidadMaterialesPeligrosos = 0;

        for(Contenedor c : contenedores){
            if(c.getEsMaterialPeligroso() && c.getPaisProcedencia().equals("Desconocida"))
                cantidadMaterialesPeligrosos++;
        }
        return cantidadMaterialesPeligrosos;
    }


}
