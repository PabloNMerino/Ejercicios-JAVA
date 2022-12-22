package com.Juego_DH.main;

import com.Juego_DH.main.habilidadFactory.HabilidadFactory;
import com.Juego_DH.main.models.Personaje;

public class Main {
    public static void main(String[] args) {

        Personaje P1 = new Personaje("Juanito Alcachofa");

        P1.agregarHabilidades(HabilidadFactory.SALTAR);
        P1.agregarHabilidades(HabilidadFactory.DISPARAR);
        P1.agregarHabilidades(HabilidadFactory.DISPARARALSALTAR);
        P1.agregarHabilidades("Volar");
        P1.mostrarHabilidades();

    }
}
