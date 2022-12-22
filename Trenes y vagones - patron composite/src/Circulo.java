public class Circulo extends Figura {

    private Double radio;

    public Circulo(String nombre, Double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return Math.pow(radio,2) * Math.PI;
    }
}
