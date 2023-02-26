import Cliente.Cliente;
import ServicioTurismo.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        BuscadorDeVuelos buscadorDeVuelos = new BuscadorDeVuelos();
        BuscadorDeHoteles buscadorDeHoteles = new BuscadorDeHoteles();

        Vuelo vuelo1 = new Vuelo("Aerolineas Argentinas", 01143, "Corrientes", "Chubut", LocalDate.of(2023, 8, 16));
        Vuelo vuelo2 = new Vuelo("Avianca", 01144, "Resistencia", "Salta", LocalDate.of(2023, 5, 23));
        Vuelo vuelo3 = new Vuelo("Air France", 01145, "Posadas", "Cordoba", LocalDate.of(2023, 6, 4));
        Vuelo vuelo4 = new Vuelo("Austral", 87343, "Parana", "Posadas", LocalDate.of(2023, 2, 7));
        Vuelo vuelo5 = new Vuelo("Flybondi", 65665, "Corrientes", "Chubut", LocalDate.of(2023, 8, 16));
        Vuelo vuelo6 = new Vuelo("JetSmart", 12341, "Rosario", "Iguazu", LocalDate.of(2023, 1, 20));
        Vuelo vuelo7 = new Vuelo("American Airlines", 013, "Chubut", "Corrientes", LocalDate.of(2023, 8, 26));
        Vuelo vuelo8 = new Vuelo("Air France", 01743, "Chubut", "Jujuy", LocalDate.of(2023, 10, 15));
        Vuelo vuelo9 = new Vuelo("Delta Airlines", 54654, "Salta", "Rosario", LocalDate.of(2023, 11, 5));
        Vuelo vuelo10 = new Vuelo("Gol", 23342, "Chubut", "Corrientes", LocalDate.of(2023, 8, 26));
        Vuelo vuelo11 = new Vuelo("Azul", 12345, "Parana", "Rosario", LocalDate.of(2023, 12, 31));
        Vuelo vuelo12 = new Vuelo("Aerolineas Argentinas", 011, "Iguazu", "Resistencia", LocalDate.of(2023, 6, 28));
        Vuelo vuelo13 = new Vuelo("JetSmart", 01553, "Cordoba", "Salta", LocalDate.of(2023, 8, 14));


        Hotel hotel1 = new Hotel("San Martin", "Chubut", LocalDate.of(2023,8,16), LocalDate.of(2023,8,26));
        Hotel hotel2 = new Hotel("Libertad", "Salta", LocalDate.of(2023,9,6), LocalDate.of(2023,4,4));
        Hotel hotel3 = new Hotel("Moreno", "Cordoba", LocalDate.of(2023,10,17), LocalDate.of(2023,6,26));
        Hotel hotel4 = new Hotel("Roca", "Corrientes", LocalDate.of(2023,11,26), LocalDate.of(2023,9,30));
        Hotel hotel5 = new Hotel("Hirigoyen", "Chubut", LocalDate.of(2023,8,16), LocalDate.of(2023,8,26));
        Hotel hotel6 = new Hotel("Junin", "Jujuy", LocalDate.of(2023,5,16), LocalDate.of(2023,12,22));
        Hotel hotel7 = new Hotel("Obelisco", "Parana", LocalDate.of(2023,6,14), LocalDate.of(2023,5,7));
        Hotel hotel8 = new Hotel("Aguila", "Iguazu", LocalDate.of(2023,1,1), LocalDate.of(2023,10,15));



        buscadorDeVuelos.addVuelo(vuelo1);
        buscadorDeVuelos.addVuelo(vuelo2);
        buscadorDeVuelos.addVuelo(vuelo3);
        buscadorDeVuelos.addVuelo(vuelo4);
        buscadorDeVuelos.addVuelo(vuelo5);
        buscadorDeVuelos.addVuelo(vuelo6);
        buscadorDeVuelos.addVuelo(vuelo7);
        buscadorDeVuelos.addVuelo(vuelo8);
        buscadorDeVuelos.addVuelo(vuelo9);
        buscadorDeVuelos.addVuelo(vuelo10);
        buscadorDeVuelos.addVuelo(vuelo11);
        buscadorDeVuelos.addVuelo(vuelo12);
        buscadorDeVuelos.addVuelo(vuelo13);

        buscadorDeHoteles.addHotel(hotel1);
        buscadorDeHoteles.addHotel(hotel2);
        buscadorDeHoteles.addHotel(hotel3);
        buscadorDeHoteles.addHotel(hotel4);
        buscadorDeHoteles.addHotel(hotel5);
        buscadorDeHoteles.addHotel(hotel6);
        buscadorDeHoteles.addHotel(hotel7);
        buscadorDeHoteles.addHotel(hotel8);

        ServicioTurismo servicioTurismo = new ServicioTurismo(buscadorDeVuelos, buscadorDeHoteles);

        Cliente cliente1 = new Cliente("Pablo", "Corrientes");

        cliente1.elegirAgenciaDeTurismo(servicioTurismo);

        cliente1.buscarProximoViaje();

    }
}
