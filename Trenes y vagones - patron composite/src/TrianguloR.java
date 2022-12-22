public class TrianguloR extends Figura{

    private Double base;
    private Double altura;

    public TrianguloR(String nombre, Double base, Double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return (base*altura)/2;
    }
}
