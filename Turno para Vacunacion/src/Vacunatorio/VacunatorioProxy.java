package Vacunatorio;

import Persona.Persona;

import java.time.LocalDate;

public class VacunatorioProxy implements VacunatorioInterfaz{

    private Vacunario vacunario;

    public VacunatorioProxy(Vacunario vacunario) {
        this.vacunario = vacunario;
    }

    @Override
    public void vacunar(Persona persona, LocalDate date) {
        LocalDate fechaDiaDespues = persona.getDate().plusDays(1);
        if(persona.getDate().equals(date) || fechaDiaDespues.equals(date)) {
            System.out.println("Te podes vacunar");
            vacunario.vacunar(persona, date);
        }
        else {
            System.out.println("Viniste en la fecha equivocada");
        }
    }
}
