package Gobierno;
import Documento.Documento;


public class Ministros extends Gobierno{

    private int tipoAcceso;
    private String jerarquia;

    public Ministros() {
        super(2, "Soy un ministro");
    }


    @Override
    public void leerDocumento(Documento documento) {
        if(documento.getTipo() >= super.tipoAcceso) {
            System.out.println(super.jerarquia + " y el documento dice: " + documento.getContenido());
        }
        else if (getSigJerarquia() != null) {
            getSigJerarquia().leerDocumento(documento);
        }
    }
}
