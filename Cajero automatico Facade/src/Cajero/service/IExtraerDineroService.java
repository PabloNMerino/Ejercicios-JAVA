package Cajero.service;

public interface IExtraerDineroService {

    public void procesarExtraccion(long dni, String contrasena) throws InterruptedException;

}
