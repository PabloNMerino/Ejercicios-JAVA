public class Main {
    public static void main(String[] args) {
/*
        CajaAhorro cuenta1 = new CajaAhorro("Merino", 35115807, "20-35115807-8", 01, 10000.0, 10.0);

        cuenta1.depositarEfectivo(10000.0); //depositar dinero en la cuenta caja de ahorro
        cuenta1.extraerEfectivo(5000.0); //extraer dinero de la cuenta caja de ahorros
        cuenta1.cobrarInteres(); //cobrar intereses de la cuenta caja de ahorros
  */
        CuentaCorriente cuenta2 = new CuentaCorriente("Obregon", 12306047, "20-12306047-8", 02, 100000.0, 50000.0);
        //cuenta2.extraerEfectivo(25000.0); //extraer dinero de la cuenta corriente
        //cuenta2.depositarEfectivo(10000.0); //depositar dinero en la cuenta corriente
        cuenta2.extraerEfectivo(120000.0);
        cuenta2.depositarEfectivo(200000.0);
        cuenta2.pagarDescubiertoBancario();

        System.out.println("Las ganancias actuales del banco son de " + cuenta2.getGanancias());

        cuenta2.extraerEfectivo(200000.0);
        cuenta2.depositarEfectivo(30000.0);
        cuenta2.pagarDescubiertoBancario();
        System.out.println("Las ganancias actuales del banco son de " + cuenta2.getGanancias());
    }
}
