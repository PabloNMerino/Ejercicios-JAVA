package com.DH.control;

public class ControlEnvase extends CompruebaCalidad{
    @Override
    void validarCalidadDelProducto(Articulo articulo) {
        if(articulo.getEnvasado().equalsIgnoreCase("Sano") || articulo.getEnvasado().equalsIgnoreCase("Casi sano")){
            System.out.println("CONTROL DE ENVASE: APROBADO");
            System.out.println("### Producto aprobo control de calidad ###");
        }else{
            System.out.println("CONTROL DE ENVASE: DESAPROBADO");
            System.out.println("### Producto NO aprobo control de calidad ###");

        }
    }
}
