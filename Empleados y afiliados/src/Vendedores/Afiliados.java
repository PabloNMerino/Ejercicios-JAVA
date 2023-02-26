package Vendedores;

public class Afiliados extends Vendedor{

    public Afiliados(String nombre) {
        super(nombre);
    }

    @Override
    public String mostrarCategoria() {
        puntajeTotal= cantVentas*15;
        return determinarCategoria();
    }


}
