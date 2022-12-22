public class CajaAhorro extends Cuenta{

    private double tasaInteres;

    public CajaAhorro(String apellido, int dni, String cuit, int nroCliente, double saldo, double tasaInteres) {
        super(apellido, dni, cuit, nroCliente, saldo);
        this.tasaInteres = tasaInteres;
    }


    @Override
    public void depositarEfectivo(double monto) {
        super.setSaldo(super.getSaldo() + monto);
        System.out.println("Usted deposito exitosamente $" + monto + ", ahora su saldo en su caja de ahorro es de $" + super.getSaldo());
    }

    @Override
    public void extraerEfectivo(double monto) {
    if(monto>super.getSaldo())
        System.out.println("No cuenta con suficientes fondos");
    else{
        super.setSaldo(super.getSaldo()-monto);
        System.out.println("Extrajo exitosamente $" + monto + " de su caja de ahorro, ahora su saldo es de $ " + super.getSaldo());
    }
    }

    public void cobrarInteres(){
        super.setSaldo(((tasaInteres*super.getSaldo())/100) + super.getSaldo());
        System.out.println("Usted cobro los intereses, ahora el saldo de su caja de ahorro es de $" + super.getSaldo());
    }
}
