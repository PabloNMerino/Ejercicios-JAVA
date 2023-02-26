package ServicioTurismo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BuscadorDeVuelos {
    private List<Vuelo> vuelos;

    public BuscadorDeVuelos() {
        this.vuelos = new ArrayList<>();
    }

    public void addVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public List<Vuelo> buscarVueloIda(String ciudadOrigen, String ciudadDestino, LocalDate fechaIda) {
        List<Vuelo> vuelosEncontrados = new ArrayList<>();
        for (Vuelo v: vuelos) {
            if(v.getOrigen().equalsIgnoreCase(ciudadOrigen) &&  v.getDestino().equals(ciudadDestino) && v.getFechaIda().equals(fechaIda)){
                vuelosEncontrados.add(v);
            }
        }
        return vuelosEncontrados;
    }

    public List<Vuelo> buscarVueloVuelta(String ciudadDestino, String ciudadOrigen, LocalDate fechaVuelta){
        List<Vuelo> vuelosEncontrados = new ArrayList<>();
        for (Vuelo v: vuelos) {
            if(v.getDestino().equalsIgnoreCase(ciudadOrigen) && v.getOrigen().equalsIgnoreCase(ciudadDestino) && v.getFechaIda().equals(fechaVuelta)){
                vuelosEncontrados.add(v);
            }
        }
        return vuelosEncontrados;
    }
}
