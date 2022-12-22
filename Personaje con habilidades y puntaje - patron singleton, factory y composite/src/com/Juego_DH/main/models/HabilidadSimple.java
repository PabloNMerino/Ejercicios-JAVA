package com.Juego_DH.main.models;

public class HabilidadSimple extends Habilidad{

    private Double puntaje;

    public HabilidadSimple(String nombre, String descripcion, Double puntaje) {
        super(nombre, descripcion);
        this.puntaje = puntaje;
    }

    @Override
    public Double calcularPuntaje() {
        if (this.getNombre().equals("Disparar")){
            return puntaje * 1.1;

        } return puntaje;

    }
}
