import org.apache.log4j.Logger;

public class Animal {

    protected Logger logger = Logger.getLogger(Animal.class);
    protected String nombre;
    protected int edad;


    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        }

    public void correr() {
        logger.info(nombre + " esta corriendo velozmente");
    }

}
