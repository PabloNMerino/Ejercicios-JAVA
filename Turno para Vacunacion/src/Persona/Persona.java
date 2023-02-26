package Persona;

import Vacunatorio.Vacunario;
import Vacunatorio.VacunatorioInterfaz;
import Vacunatorio.VacunatorioProxy;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Persona {

    private String apellido;
    private String nombre;
    private String cedula;
    private String nombreVacuna;
    private LocalDate date;
    Scanner scanner = new Scanner(System.in);

    public Persona(String apellido, String nombre, String cedula) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public LocalDate getDate() {
        return date;
    }

    public void sacarTurnoParaVacuna() {
        System.out.println("ingrese dia para vacunacion: ");
        int dia = scanner.nextInt();

        System.out.println("ingrese mes para vacunacion: ");
        int mes = scanner.nextInt();

        date = LocalDate.of(2023, mes, dia);

        System.out.println("Que vacuna desea? (Pfizer/Sputnik/Chadox/Sinopharm)");
        nombreVacuna = scanner.next();

        System.out.println("Turno generado Correctamente para el " + dia + "-" + mes + "-2023");
    }

    public void irAVacunarse() {
        System.out.println("Dia que se presenta a vacunarse: ");
        int diaPresentacion = scanner.nextInt();

        System.out.println("Mes que presenta a vacunarse: ");
        int mesPresentacion = scanner.nextInt();

        LocalDate fechaPresentacion = LocalDate.of(2023,mesPresentacion,diaPresentacion);

        VacunatorioInterfaz vacunadaProxy = new VacunatorioProxy(new Vacunario());
        vacunadaProxy.vacunar(this, fechaPresentacion);
    }

}
