package com.DH.control;

public class ControlLote extends CompruebaCalidad{

    @Override
    void validarCalidadDelProducto(Articulo articulo) {
        if(articulo.getLote() >= 1000 && articulo.getLote() <= 2000){
            System.out.println("CONTROL LOTE: APROBADO");
            System.out.println("--> Enviando artículo a control de peso");
            System.out.println("---------------------------------------");
            getSiguienteControl().validarCalidadDelProducto(articulo);
        }else{
            System.out.println("CONTROL DE LOTE: DESAPROBADO");
            System.out.println("### Producto NO aprobo control de calidad ###");
        }
    }
}
