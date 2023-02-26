package Vacunatorio;

import Persona.Persona;

import java.time.LocalDate;

public class Vacunario implements VacunatorioInterfaz{

    @Override
    public void vacunar(Persona persona, LocalDate date) {
        System.out.println("---------------------------");
        System.out.println(persona.getNombre() + " fue vacunada exitosamente con la vacuna " + persona.getNombreVacuna());
        System.out.println("Fecha de vacunacion: " + date.getDayOfMonth() + "/" + date.getMonth() + "/" + date.getYear());
    }
}
