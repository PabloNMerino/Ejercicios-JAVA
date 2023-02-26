package Vendedores;

public class Empleados extends Vendedor{

    private int cantAfiliados;
    private int antiguedad;

    public Empleados(String nombre, int antiguedad) {
        super(nombre);
        this.antiguedad = antiguedad;
        this.cantAfiliados = 0;
    }

    public void conseguirAfiliados() {
        cantAfiliados++;
    }

    public void conseguirAfiliados(int masAfiliados) {
        cantAfiliados+=masAfiliados;
    }

    @Override
    public String mostrarCategoria() {
       int puntosVenta = cantVentas*5;
       int puntosAfiliado = cantAfiliados*10;
       int puntosAntiguedad = antiguedad*5;
       puntajeTotal = puntosVenta + puntosAfiliado + puntosAntiguedad;
       return determinarCategoria();

    }
}

