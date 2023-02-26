package Vendedores;

public abstract class Vendedor {

    protected String nombre;
    protected int cantVentas;
    protected int puntajeTotal;
    public Vendedor(String nombre) {
        this.nombre = nombre;
        this.cantVentas = 0;
        this.puntajeTotal = 0;
    }

    public abstract String mostrarCategoria();

    public void vender() {
        cantVentas++;
    }

    public void vender(int numVentas) {
        cantVentas+=numVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String determinarCategoria() {
        String categoria = "";
        if(puntajeTotal<20) {
            categoria = "Novato";
        }
        if(puntajeTotal>=20 && puntajeTotal<=30) {
            categoria = "Aprendiz";
        }
        if(puntajeTotal>=31 && puntajeTotal<=40) {
            categoria= "Bueno";
        }
        if (puntajeTotal>40) {
            categoria = "Maestro";
        }
        return categoria;
    }
}
