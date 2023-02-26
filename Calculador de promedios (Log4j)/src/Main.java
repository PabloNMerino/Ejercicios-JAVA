public class Main {

    public static void main(String[] args) throws ListaVaciaException {
        Lista lista = new Lista();
        int numero;


        for (int i=0; i<15; i++){
            numero = (int) (Math.random()*10) +1;
            System.out.println("Valor agregado: " + numero);
            lista.addNumero(numero);
        }

        lista.calcularPromedio();



    }

}
