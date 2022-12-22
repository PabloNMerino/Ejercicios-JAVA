import java.util.Scanner;

public class CuentaCorriente extends Cuenta{

    private double giroEnDescubierto;
    private double deudaActual;
    Scanner input = new Scanner(System.in);
    private String respuesta;

    public CuentaCorriente(String apellido, int dni, String cuit, int nroCliente, double saldo, double giroEnDescubierto) {
        super(apellido, dni, cuit, nroCliente, saldo);
        this.giroEnDescubierto = giroEnDescubierto;
        deudaActual = 0.0;
    }


    @Override
    public void depositarEfectivo(double monto) {
        super.setSaldo(super.getSaldo() + monto);
        System.out.println("Usted deposito exitosamente $" + monto + ", ahora su saldo en su cuenta corriente es de $" + super.getSaldo());
    }

    @Override
    public void extraerEfectivo(double monto) {
         if(monto>super.getSaldo()){
            System.out.println("No cuenta con suficientes fondos, desea utilizar su giro en descubierto (s/n)? ");
            respuesta = input.nextLine();
            if(respuesta.equals("s")){
                super.setSaldo(super.getSaldo()+giroEnDescubierto);
                deudaActual = giroEnDescubierto;
                giroEnDescubierto = 0.0;
                if(monto>super.getSaldo())
                    System.out.println("No tiene suficientes fondos para realizar la extraccion");
                else{
                    super.setSaldo(super.getSaldo()-monto);
                    System.out.println("Se realizo la extraccion correctamente, ahora su saldo en su cuenta corriente es de $" + super.getSaldo());
                }
            }
            else if(respuesta.equals("n")){
                System.out.println("Gracias, vuelva pronto (con plata capo)");
            }

            else{
                System.out.println("Opcion no valida");
            }
        }

        else{
            super.setSaldo(super.getSaldo()-monto);
            System.out.println("Extrajo exitosamente $" + monto + " de su cuenta corriente, ahora su saldo es de $" + super.getSaldo());
        }
    }

    public void pagarDescubiertoBancario (){
        System.out.println("Su deuda es de $" + (((deudaActual*10)/100) + deudaActual) + ", desea abonar el total? (s/n) ");
        respuesta = input.nextLine();
        double pagoDescubiertoBancario = ((deudaActual*10)/100) + deudaActual;
        if(respuesta.equals("s")){
            if(pagoDescubiertoBancario > super.getSaldo())
                System.out.println("No tiene suficientes fondos para abonar su deuda");
            else{
                super.setSaldo(super.getSaldo()-pagoDescubiertoBancario);
                super.setGanancias(super.getGanancias() + ((deudaActual*10)/100));
                giroEnDescubierto = deudaActual;
                deudaActual = 0.0;
                System.out.println("Se abono la deuda exitosamente, su saldo es de $" + super.getSaldo() + ", y tiene disponible $" + giroEnDescubierto + " para solicitar en prestamo");
            }
        }
        else if (respuesta.equals("n")) {
            System.out.println("Gracias vuelva pronto");
        }

        else {
            System.out.println("Opcion no valida");
        }
    }
}
