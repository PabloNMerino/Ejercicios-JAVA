package Servicio_Drive;

import Documento.Documento;

public class ServicioDrive implements IServicioDrive {

    private Documento documento;

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    @Override
    public void accederDocumento(String url, String email) {
        System.out.println("--- Documento ID: " + documento.getId() + " ---");
        System.out.println(documento.getContenido());
    }
}
