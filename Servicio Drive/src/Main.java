import Documento.Documento;
import Servicio_Drive.IServicioDrive;
import Servicio_Drive.ProxyDrive;
import Servicio_Drive.ServicioDrive;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<String> usuariosAutorizadosDoc1 = new ArrayList<>();
        usuariosAutorizadosDoc1.add("usuario.uno@email.com");
        usuariosAutorizadosDoc1.add("usuario.dos@email.com");
        usuariosAutorizadosDoc1.add("usuario.tres@email.com");
        usuariosAutorizadosDoc1.add("usuario.cuatro@email.com");
        usuariosAutorizadosDoc1.add("usuario.cinco@email.com");
        String contenidoDocumento = " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse maximus erat nulla, \n" +
                " vitae dapibus arcu egestas vitae. Aliquam fringilla tincidunt faucibus. Phasellus at erat turpis.\n" +
                " Praesent tincidunt felis nec arcu ultrices tempor. Etiam interdum nibh nec ligula rutrum interdum. Integer \n" +
                " eget nisl a orci dictum efficitur nec id eros. Curabitur semper libero in neque tincidunt tempus. Donec eget \n" +
                " laoreet nunc. Curabitur dictum odio sapien, eget feugiat nisi lobortis at. Aenean venenatis fringilla auctor. \n" +
                " Suspendisse vitae mauris lacus. In lectus ligula, egestas id molestie at, convallis sed elit. Praesent scelerisque \n" +
                " gravida gravida. Sed ut justo in diam viverra vestibulum sed vitae nisi. Cras commodo nisi vel nisi dictum, ut malesuada \n" +
                " diam ultricies. Pellentesque hendrerit pulvinar ornare.";


        Documento documento = new Documento("D01", "escritorio", contenidoDocumento, usuariosAutorizadosDoc1);

        IServicioDrive proxy = new ProxyDrive(new ServicioDrive(), documento);

        System.out.println("------------------- EJEMPLO 1 ------------------- \n ");
        proxy.accederDocumento("escritorio", "usuario.tres@email.com");
        System.out.println(" \n ");

        System.out.println("------------------- EJEMPLO 2 -------------------\n ");
        proxy.accederDocumento("carpeta1", "usuario.uno@email.com");
        System.out.println(" \n ");

        System.out.println("------------------- EJEMPLO 3 -------------------\n ");
        proxy.accederDocumento("escritorio", "usuario.seis@email.com");


    }

}
