public class Main {

    public static void main(String[] args) {

        Municipalidad muniDeAlgunLado = new Municipalidad();

        muniDeAlgunLado.agregarPropiedad(PropiedadFactory.CODIGO_AV_SM);
        muniDeAlgunLado.agregarPropiedad(PropiedadFactory.CODIGO_MITRE);
        muniDeAlgunLado.agregarPropiedad(PropiedadFactory.CODIGO_GUTIERRES);
        muniDeAlgunLado.agregarPropiedad("Codigo trucho");

        muniDeAlgunLado.mostrarPropiedades();
    }
}
