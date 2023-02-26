package com.DH.control;

public class ControlPeso extends CompruebaCalidad {

    @Override
    void validarCalidadDelProducto(Articulo articulo) {
        if(articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300){
            System.out.println("CONTROL PESO: APROBADO");
            System.out.println("--> Enviando artículo a control de envase");
            System.out.println("---------------------------------------");
            getSiguienteControl().validarCalidadDelProducto(articulo);
        }else{
            System.out.println("CONTROL DE PESO: DESAPROBADO");
            System.out.println("### Producto NO aprobo control de calidad ###");
        }
    }
}
