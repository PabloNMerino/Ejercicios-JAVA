public abstract class Cuenta extends Cliente {

    private double saldo;

    public Cuenta(String apellido, int dni, String cuit, int nroCliente, double saldo) {
        super(apellido, dni, cuit, nroCliente);
        this.saldo = saldo;
    }

    public abstract void depositarEfectivo (double monto);
    public abstract void extraerEfectivo (double monto);

    public void informarSaldo(){
        System.out.println("Su saldo es de: $" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
