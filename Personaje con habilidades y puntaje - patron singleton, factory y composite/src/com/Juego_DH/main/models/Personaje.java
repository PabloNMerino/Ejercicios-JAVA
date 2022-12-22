package com.Juego_DH.main.models;

import com.Juego_DH.main.Exception.HabilidadFactoryException;
import com.Juego_DH.main.habilidadFactory.HabilidadFactory;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private List<Habilidad> habilidades;

    private String nombre;

    public Personaje(String nombre) {
        this.habilidades = new ArrayList<>();
        this.nombre = nombre;
    }

    public void agregarHabilidades(String codigo) {
        try {
            habilidades.add(HabilidadFactory.getInstance().crearHabilidades(codigo));
        } catch (HabilidadFactoryException e) {
           e.printStackTrace();
        }
    }

    public  void  mostrarHabilidades(){
        for (Habilidad habs: habilidades) {
            System.out.println("Estoy por " + habs.getNombre() + " tu puntaje es " + habs.calcularPuntaje() );

        }
    }


}
