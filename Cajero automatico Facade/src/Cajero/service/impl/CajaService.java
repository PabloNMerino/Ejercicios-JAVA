package Cajero.service.impl;

import Cajero.model.Cuenta;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CajaService {


    public void entregarDinero(Cuenta c) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Monto a retirar: $");
        int monto = input.nextInt();
        TimeUnit.SECONDS.sleep(1);
        while(monto > c.getSaldo()) {
            System.out.println("No cuenta con suficientes fondos, ingrese nuevo valor: $");
            monto = input.nextInt();
        }
        c.setSaldo(c.getSaldo()-monto);
        System.out.println("Operacion realizada con exito, su nuevo saldo es de: $" + c.getSaldo());
    }
}
