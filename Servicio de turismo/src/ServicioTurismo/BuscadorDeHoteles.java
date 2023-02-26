package ServicioTurismo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BuscadorDeHoteles {

    private List<Hotel> hoteles;

    public BuscadorDeHoteles() {
        this.hoteles = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        hoteles.add(hotel);
    }

    public List<Hotel> buscarHoteles(String ciudadDestino, LocalDate fechaIda, LocalDate fechaVuelta) {
        List<Hotel> hotelesEncontrados = new ArrayList<>();
        for (Hotel h: hoteles) {
            if(h.getCiudad().equalsIgnoreCase(ciudadDestino) && h.getFechaCheckIn().equals(fechaIda) && h.getFechaCheckOut().equals(fechaVuelta)) {
                hotelesEncontrados.add(h);
            }
        }
        return hotelesEncontrados;
    }
}
