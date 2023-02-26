package Gobierno;
import Documento.Documento;


public class Presidente extends Gobierno{

    private int tipoAcceso;
    private String jerarquia;

    public Presidente() {
        super(1, "Soy un presidente");
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
