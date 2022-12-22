package com.Juego_DH.main.models;

import java.util.ArrayList;
import java.util.List;

public class HabilidadCombinada extends Habilidad{

    private Double factorMultiplicar;

    private List<Habilidad> habilidades;

    public HabilidadCombinada(String nombre, String descripcion, Double factorMultiplicar) {
        super(nombre, descripcion);
        this.factorMultiplicar = factorMultiplicar;
        this.habilidades = new ArrayList<Habilidad>();
    }

    public void  agregarHabilidades(Habilidad habilidad){
        habilidades.add(habilidad);
    }

    @Override
    public Double calcularPuntaje() {
        Double sumarPuntaje = 0.0;

        for (Habilidad hbs: habilidades) {

            sumarPuntaje += hbs.calcularPuntaje();
        }
       return sumarPuntaje * factorMultiplicar;
    }


}
