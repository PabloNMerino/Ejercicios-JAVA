public class Leon extends Animal{

    private boolean esAlfa;

    public Leon(String nombre, int edad, boolean esAlfa) throws Exception {
        super(nombre, edad);
        this.esAlfa = esAlfa;
    }

    public void determinarAlfa() {
        if(edad>10 && esAlfa) {
            logger.info(nombre + " es mayor a 10 años y es alfa");
        }
        else {
            logger.info("No es mayor a 10 años o no es alfa");
        }
    }
}