public class Cliente extends Banco{

    private String apellido;
    private int dni;
    private String cuit;
    private int nroCliente;

    public Cliente(String apellido, int dni, String cuit, int nroCliente) {
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
        this.nroCliente = nroCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDni() {
        return dni;
    }

    public String getCuit() {
        return cuit;
    }

    public int getNroCliente() {
        return nroCliente;
    }
}
