public abstract class Propiedad {

    private String calle;
    private Integer numero;

    public Propiedad(String calle, Integer numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public abstract Double calcularImpuesto();
}
