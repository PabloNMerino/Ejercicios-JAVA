package Cajero;

import Cajero.model.Cuenta;
import Cajero.service.IExtraerDineroService;
import Cajero.service.impl.AutenticationService;
import Cajero.service.impl.CajaService;
import Cajero.service.impl.CuentaService;
import Cajero.service.impl.ExtraerDineroService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    Cuenta cuenta1 = new Cuenta(35115807, "C0001", "holi", 150000);
    Cuenta cuenta2 = new Cuenta(36115807, "C0002", "holu", 50000);
    Cuenta cuenta3 = new Cuenta(37115807, "C0003", "holix", 100000);
    Cuenta cuenta4 = new Cuenta(38115807, "C0004", "buendia", 10000);
    Cuenta cuenta5 = new Cuenta(39115807, "C0005", "quetul", 5000);
    Scanner input = new Scanner(System.in);

    List<Cuenta> cuentas = new ArrayList<>();
    cuentas.add(cuenta1);
    cuentas.add(cuenta2);
    cuentas.add(cuenta3);
    cuentas.add(cuenta4);
    cuentas.add(cuenta5);

    IExtraerDineroService extraerDineroService = new ExtraerDineroService(new AutenticationService(cuentas), new CuentaService(cuentas), new CajaService());

    System.out.println("DNI: ");
    long dni = input.nextLong();

    System.out.println("Constrasena: ");
    String contrasena = input.next();

    TimeUnit.SECONDS.sleep(1);

    extraerDineroService.procesarExtraccion(dni, contrasena);

    }
}
