import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Integer> listaNumeros;
    Logger logger = Logger.getLogger(List.class);

    public Lista() {
        this.listaNumeros = new ArrayList<>();
    }

    public void addNumero(Integer numero) {
        listaNumeros.add(numero);
        if(listaNumeros.size() > 5 && listaNumeros.size() <11) {
        logger.info("La lista tiene mas de 5 elementos (" + listaNumeros.size() + " elementos)");
        } else if (listaNumeros.size() >= 11) {
            logger.info("La lista tiene mas de 10 elementos (" + listaNumeros.size() + " elementos)");
        }
    }

    private void chequearLista() throws ListaVaciaException {
        if (listaNumeros.size() == 0) {
            logger.error("La lista esta vacia");
            throw new ListaVaciaException("No tiene elementos para calcular promedio la lista");
        }
    }

    public void calcularPromedio() throws ListaVaciaException {
        int sumaTotal = 0;
        this.chequearLista();
        for (Integer n : listaNumeros) {
            sumaTotal += n;
        }
        logger.info("El promedio es: " + sumaTotal/listaNumeros.size());
    }

    public List<Integer> getListaNumeros() {
        return listaNumeros;
    }
}
