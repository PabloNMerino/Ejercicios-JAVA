package Cajero.service.impl;

import Cajero.model.Cuenta;

import java.util.List;

public class CuentaService {

    private List<Cuenta> cuentas;

    public CuentaService(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public Cuenta getCuenta(long dni) {
        Cuenta cuenta = null;
        for (Cuenta c: cuentas) {
            if(c.getDni() == dni) {
                cuenta = c;
            }
        }
        return cuenta;
    }
}
