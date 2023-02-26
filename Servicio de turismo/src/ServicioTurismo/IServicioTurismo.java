package ServicioTurismo;

import java.time.LocalDate;

public interface IServicioTurismo {

    public void busquedaViaje(String ciudadOrigen, String ciudadDestino, LocalDate fechaIda, LocalDate fechaVuelta);
}
