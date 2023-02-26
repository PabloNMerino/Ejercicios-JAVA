package ServicioTurismo;

import java.time.LocalDate;

public class Vuelo {

    private String empresa;

    private int nroVuelo;
    private String origen;

    private String destino;
    private LocalDate fechaIda;


    public Vuelo(String empresa, int nroVuelo, String origen, String destino, LocalDate fechaIda) {
        this.empresa = empresa;
        this.nroVuelo = nroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaIda = fechaIda;
    }

    public String getOrigen() {
        return origen;
    }

    public LocalDate getFechaIda() {
        return fechaIda;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getNroVuelo() {
        return nroVuelo;
    }

    public String getDestino() {
        return destino;
    }
}
