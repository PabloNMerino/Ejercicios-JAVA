package com.DH.control;

public class AnalistaDeCalidad {
    public static void main(String[] args) {
        CompruebaCalidad controlLote = new ControlLote();
        CompruebaCalidad controlPeso = new ControlPeso();
        CompruebaCalidad controlEnvase = new ControlEnvase();

        Articulo articulo1 = new Articulo("coca",1002,1200, "sano");

        controlLote.setSiguienteControl(controlPeso);
        controlPeso.setSiguienteControl(controlEnvase);


        controlLote.validarCalidadDelProducto(articulo1);


    }
}
