import Documento.Documento;
import Gobierno.*;

public class Main {
    public static void main(String[] args) {

        Documento documento1 = new Documento("Bajar los impuestos", 3);
        Documento documento2 = new Documento("nombrar nuevos diputados", 2);
        Documento documento3 = new Documento("Dirigir el pais", 1);

        Gobierno diputado = new Diputados();
        Gobierno ministro = new Ministros();
        Gobierno presidente = new Presidente();

        diputado.setSigJerarquia(ministro);
        ministro.setSigJerarquia(presidente);

        diputado.leerDocumento(documento1);

        System.out.println("-------------------------------");

        diputado.leerDocumento(documento2);

        System.out.println("-------------------------------");

        diputado.leerDocumento(documento3);


    }
}
