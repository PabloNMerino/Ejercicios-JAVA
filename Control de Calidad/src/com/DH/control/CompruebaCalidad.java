package com.DH.control;

public abstract class CompruebaCalidad {
    private CompruebaCalidad siguienteControl;

    abstract void validarCalidadDelProducto(Articulo articulo);

    public CompruebaCalidad getSiguienteControl() {
        return siguienteControl;
    }

    public void setSiguienteControl(CompruebaCalidad siguienteControl) {
        this.siguienteControl = siguienteControl;
    }
}
