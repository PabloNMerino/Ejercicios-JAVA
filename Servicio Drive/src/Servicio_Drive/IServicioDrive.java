package Servicio_Drive;

import Documento.Documento;

public interface IServicioDrive {

    public void accederDocumento(String url, String email) throws InterruptedException;

}
