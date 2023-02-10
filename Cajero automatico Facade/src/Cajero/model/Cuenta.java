package Cajero.model;

public class Cuenta {
    private long dni;

    private String id;

    private String contrasena;
    private double saldo;

    public Cuenta(long dni, String id, String contrasena, double saldo) {
        this.dni = dni;
        this.id = id;
        this.contrasena = contrasena;
        this.saldo = saldo;
    }

    public long getDni() {
        return dni;
    }

    public String getId() {
        return id;
    }
    public String getContrasena() {
        return contrasena;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
