package ServicioTurismo;

import java.time.LocalDate;

public class Hotel {

    private String nombre;
    private String ciudad;
    private LocalDate fechaCheckIn;
    private LocalDate fechaCheckOut;

    public Hotel(String nombre, String ciudad, LocalDate fechaCheckIn, LocalDate fechaCheckOut) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public LocalDate getFechaCheckIn() {
        return fechaCheckIn;
    }

    public LocalDate getFechaCheckOut() {
        return fechaCheckOut;
    }
}
