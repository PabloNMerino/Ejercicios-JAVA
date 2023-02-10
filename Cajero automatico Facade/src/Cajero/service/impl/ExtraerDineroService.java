package Cajero.service.impl;

import Cajero.model.Cuenta;
import Cajero.service.IExtraerDineroService;

import java.util.concurrent.TimeUnit;

public class ExtraerDineroService implements IExtraerDineroService {

    private AutenticationService autenticationService;
    private CuentaService cuentaService;
    private CajaService cajaService;

    public ExtraerDineroService(AutenticationService autenticationService, CuentaService cuentaService, CajaService cajaService) {
        this.autenticationService = autenticationService;
        this.cuentaService = cuentaService;
        this.cajaService = cajaService;
    }

    @Override
    public void procesarExtraccion(long dni, String contrasena) throws InterruptedException {
        boolean existe = autenticationService.validarUsuarioYContrasena(dni, contrasena);
        if(existe) {
            System.out.println("--- Cuenta autenticada ---");
            TimeUnit.SECONDS.sleep(1);
            Cuenta c = cuentaService.getCuenta(dni);
            System.out.println("ID usuario : " + c.getId());
            System.out.println("Saldo: $" + c.getSaldo());
            cajaService.entregarDinero(c);
        }
        else {
            System.out.println("xxx Los datos ingresados son invalidos xxx");
        }

    }
}
