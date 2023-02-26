package Cliente;

import ServicioTurismo.ServicioTurismo;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Cliente {

    private String nombre;
    private String ciudadDeOrigen;

    private ServicioTurismo servicioTurismo;

    public Cliente(String nombre, String ciudadDeOrigen) {
        this.nombre = nombre;
        this.ciudadDeOrigen = ciudadDeOrigen;
        this.servicioTurismo = new ServicioTurismo();
    }

    public void elegirAgenciaDeTurismo(ServicioTurismo servicioTurismo) {
        this.servicioTurismo = servicioTurismo;
    }

    private LocalDate determinarFecha(String fechaString) {
        String[] fechaArray = fechaString.split("-");
        int dia = Integer.parseInt(fechaArray[0]);
        int mes = Integer.parseInt(fechaArray[1]);
        int anio = Integer.parseInt(fechaArray[2]);
        LocalDate fechaDeseada = LocalDate.of(anio, mes, dia);
        return fechaDeseada;
    }

    public void buscarProximoViaje(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Destino:");
        String destino = scanner.next();
        System.out.println("Fecha de ida en formato DD-MM-YYYY:");
        String fechaIdaString = scanner.next();
        System.out.println("Fecha de vuelta en mismo formato:");
        String fechaVueltaString = scanner.next();
        LocalDate fechaIda = determinarFecha(fechaIdaString);
        LocalDate fechaVuelta = determinarFecha(fechaVueltaString);

        servicioTurismo.busquedaViaje(ciudadDeOrigen, destino, fechaIda, fechaVuelta);
    }


}
