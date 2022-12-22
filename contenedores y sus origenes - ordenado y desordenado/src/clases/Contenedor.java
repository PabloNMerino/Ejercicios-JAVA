package clases;

public class Contenedor implements Comparable <Contenedor> {

    private Integer nroIdentificacion;
    private String paisProcedencia;
    private Boolean esMaterialPeligroso;

    public Contenedor(int nroIdentificacion, String paisProcedencia, Boolean esMaterialPeligroso) {
        this.nroIdentificacion = nroIdentificacion;
        this.paisProcedencia = paisProcedencia;
        this.esMaterialPeligroso = esMaterialPeligroso;
    }

    public Integer getNroIdentificacion() {
        return nroIdentificacion;
    }

    public Boolean getEsMaterialPeligroso() {
        return esMaterialPeligroso;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    @Override
    public int compareTo(Contenedor otroContenedor) {
        return nroIdentificacion.compareTo(otroContenedor.getNroIdentificacion());
    }

    @Override
    public String toString() {
        return "Contenedor nro: " + nroIdentificacion + " | Pais de procedencia: " + paisProcedencia;
    }
}