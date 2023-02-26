package Gobierno;

import Documento.Documento;

public class Diputados extends Gobierno {


    public Diputados() {
        super(3, "Soy un diputado");
    }


    @Override
    public void leerDocumento(Documento documento) {
        if (documento.getTipo() == super.tipoAcceso) {
            System.out.println(super.jerarquia + " y el documento dice: " + documento.getContenido());
        } else if (getSigJerarquia() != null) {
            getSigJerarquia().leerDocumento(documento);
        }
    }
}

