public class Rectangulo extends Figura {

    private Double alto;
    private Double largo;

    public Rectangulo(String nombre, Double alto, Double largo) {
        super(nombre);
        this.alto = alto;
        this.largo = largo;
    }


    @Override
    public Double calcularArea() {
        return alto*largo;
    }
}
