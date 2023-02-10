package Cajero.service.impl;

import Cajero.model.Cuenta;

import java.util.List;

public class AutenticationService {

    private List<Cuenta> cuentas;

    public AutenticationService(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public boolean validarUsuarioYContrasena(long dni, String contrasena) {
        boolean existe = false;
        for (Cuenta c: cuentas) {
            if(c.getDni() == dni && c.getContrasena().equals(contrasena)) {
                existe = true;
                break;
            }
        }
        return existe;
    }
}
