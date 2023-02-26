package ServicioTurismo;

import java.time.LocalDate;
import java.util.List;

public class ServicioTurismo implements IServicioTurismo{

    BuscadorDeVuelos buscadorDeVuelos;
    BuscadorDeHoteles buscadorDeHoteles;

    public ServicioTurismo(){};

    public ServicioTurismo(BuscadorDeVuelos buscadorDeVuelos, BuscadorDeHoteles buscadorDeHoteles) {
        this.buscadorDeVuelos = buscadorDeVuelos;
        this.buscadorDeHoteles = buscadorDeHoteles;
    }

    @Override
    public void busquedaViaje(String ciudadOrigen, String ciudadDestino, LocalDate fechaIda, LocalDate fechaVuelta) {

        List<Vuelo> vuelosEncontrados = buscadorDeVuelos.buscarVueloIda(ciudadOrigen, ciudadDestino, fechaIda);
        System.out.println("------ VUELOS PARA " + ciudadDestino + " ------");
        for (Vuelo v: vuelosEncontrados) {
            System.out.println("- Empresa: " + v.getEmpresa());
            System.out.println("- Nro de vuelo: " + v.getNroVuelo());
            System.out.println("- Origen: " + v.getOrigen());
            System.out.println("- Destino: " + v.getDestino());
            System.out.println("- Fecha de salida: " + v.getFechaIda() + "\n");
        }

        List<Hotel> hotelesEncontrados = buscadorDeHoteles.buscarHoteles(ciudadDestino, fechaIda, fechaVuelta);
        System.out.println("------ HOTELES EN " +  ciudadDestino + " ------");
        for (Hotel h: hotelesEncontrados) {
            System.out.println("- Hotel: " + h.getNombre());
            System.out.println("- Ciudad: " + h.getCiudad());
            System.out.println("- Check in: " + h.getFechaCheckIn());
            System.out.println("- Check out: " + h.getFechaCheckOut() + "\n");
        }

        List<Vuelo> vueloRegreso = buscadorDeVuelos.buscarVueloVuelta(ciudadDestino, ciudadOrigen, fechaVuelta);
        System.out.println("------ VUELOS DE REGRESO PARA " + ciudadOrigen + " ------");
        for (Vuelo vr: vueloRegreso) {
            System.out.println("- Empresa: " + vr.getEmpresa());
            System.out.println("- Nro de vuelo: " + vr.getNroVuelo());
            System.out.println("- Origen: " + vr.getOrigen());
            System.out.println("- Destino: " + vr.getDestino());
            System.out.println("- Fecha de salida: " + vr.getFechaIda() + "\n");
        }


    }
}
