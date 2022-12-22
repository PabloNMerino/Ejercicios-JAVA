public class CursoIndependiente extends Cursos{

    private Double cargaHoraria;
    private Double valorHora;
    private int cantMeses;

    public CursoIndependiente(String nombre, String descripcion, Double cargaHoraria, Double valorHora, int cantMeses) {
        super(nombre, descripcion);
        this.cargaHoraria = cargaHoraria;
        this.valorHora = valorHora;
        this.cantMeses = cantMeses;
    }


    @Override
    public Double calcularPrecio() {
        return (valorHora*cargaHoraria)*cantMeses;
    }

    @Override
    public String toString() {
        return "CursoIndependiente{" +
                "Nombre= " + this.getNombre() +
                "cargaHoraria=" + cargaHoraria +
                ", valorHora=" + valorHora +
                ", cantMeses=" + cantMeses +
                '}';
    }
}
