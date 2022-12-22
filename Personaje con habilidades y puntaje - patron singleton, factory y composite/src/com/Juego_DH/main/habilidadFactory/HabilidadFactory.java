package com.Juego_DH.main.habilidadFactory;

import com.Juego_DH.main.Exception.HabilidadFactoryException;
import com.Juego_DH.main.models.Habilidad;
import com.Juego_DH.main.models.HabilidadCombinada;
import com.Juego_DH.main.models.HabilidadSimple;

public class HabilidadFactory {

    private HabilidadFactory() {
    }

    public static final String DISPARAR = "Disparar";
    public static final String SALTAR = "Saltar";
    public static final String DISPARARALSALTAR = "Disparar al Saltar";


    private static HabilidadFactory instance;


    public static HabilidadFactory getInstance(){
        if (instance == null){
          instance = new HabilidadFactory();
        }
        return instance;
    }

    public Habilidad crearHabilidades(String codigo)throws HabilidadFactoryException {
        switch (codigo){
            case DISPARAR:
                return new HabilidadSimple("Disparar", "Estoy disparando", 10.0);
            case SALTAR:
                return new HabilidadSimple("Saltar", "mira como salto", 7.5);
            case DISPARARALSALTAR:
                HabilidadCombinada habsCombinada = new HabilidadCombinada("Disparar al saltar", "Salto mientras disparo", 3.0);
              habsCombinada.agregarHabilidades(crearHabilidades(DISPARAR));
              habsCombinada.agregarHabilidades(crearHabilidades(SALTAR));
              return  habsCombinada;

            default: throw new HabilidadFactoryException("Esta habilidad no existe");
        }
    }

}
