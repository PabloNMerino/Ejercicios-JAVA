import java.util.concurrent.TransferQueue;

public class Main {

    public static void main(String[] args) {

        TrianguloR triangulo1 = new TrianguloR("triangulo 1", 20.0, 20.0);
        Circulo circulo1 = new Circulo("circulo 1", 10.0);
        Rectangulo rect1 = new Rectangulo("rectangulo 1", 50.0, 40.0);
        Rectangulo rect2 = new Rectangulo("rectangulo 2", 60.0, 40.0);
        Rectangulo rect3 = new Rectangulo("rectangulo 3", 30.0, 20.0);


        Vagon vagon1 = new Vagon();

        vagon1.agregarFigura(rect1);
        vagon1.agregarFigura(circulo1);
        vagon1.agregarFigura(circulo1);
        vagon1.agregarFigura(circulo1);

        System.out.println(vagon1.calcularArea());

        Vagon locomotora = new Vagon();

        locomotora.agregarFigura(rect2);
        locomotora.agregarFigura(rect3);
        locomotora.agregarFigura(circulo1);
        locomotora.agregarFigura(circulo1);
        locomotora.agregarFigura(triangulo1);

        System.out.println(locomotora.calcularArea());

        Tren tren = new Tren();

        tren.agregarParte(locomotora);
        tren.agregarParte(vagon1);
        tren.agregarParte(vagon1);

        System.out.println(tren.calcularArea());

    }
}
