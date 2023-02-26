package Gobierno;

import Documento.Documento;

public abstract class Gobierno {

    protected int tipoAcceso;
    protected String jerarquia;
    private Gobierno sigJerarquia;

    public Gobierno(int tipoAcceso, String jerarquia) {
        this.tipoAcceso = tipoAcceso;
        this.jerarquia = jerarquia;
    }

    public abstract void leerDocumento(Documento documento);

    public void setSigJerarquia(Gobierno jerarquia){
        sigJerarquia = jerarquia;
    }

    public Gobierno getSigJerarquia() {
        return sigJerarquia;
    }
}
