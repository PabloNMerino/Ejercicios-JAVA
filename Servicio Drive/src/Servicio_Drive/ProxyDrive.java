package Servicio_Drive;

import Documento.Documento;

public class ProxyDrive implements IServicioDrive{

    private ServicioDrive servicioDrive;
    private Documento documento;

    public ProxyDrive(ServicioDrive servicioDrive, Documento documento) {
        this.servicioDrive = servicioDrive;
        this.documento = documento;
    }


    @Override
    public void accederDocumento(String url, String email) throws InterruptedException {
        if(documento.getUrl().equalsIgnoreCase(url)) {
            if(documento.getUsuariosAutorizados().contains(email)) {
                System.out.println("--- Usuario autorizado ---");
                System.out.println("Accediendo al documento...");
                servicioDrive.setDocumento(documento);
                servicioDrive.accederDocumento(url,email);
            }
            else {
                System.out.println("XXX Usuario no autorizado XXX");
            }
        }
        else {
            System.out.println("XXX URL invalido XXX");
        }
    }
}
