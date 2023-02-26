public class Tigre extends Animal{

    public Tigre(String nombre, int edad) throws Exception {
        super(nombre, edad);
    }

    public void esMayorA10() throws Exception{
        if(edad > 10) {
            logger.info(nombre + " es mayor a 10");
        } else if (edad < 0) {
            logger.error("Edad negativa: ");
            throw new Exception();
        } else {
            logger.info(nombre + " no es mayor a 10");
        }
    }
}
