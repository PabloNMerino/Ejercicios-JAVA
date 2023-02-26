import Vendedores.Afiliados;
import Vendedores.Empleados;
import Vendedores.Vendedor;


public class Main {
    public static void main(String[] args) {
        Empleados empleado1 = new Empleados("fulanito", 3);
        Empleados empleado2 = new Empleados("Menganito", 0);
        Afiliados afiliado1 = new Afiliados("cosme");

        empleado1.vender(6);
        empleado2.vender();
        empleado2.conseguirAfiliados(3);


        afiliado1.vender(2);

        System.out.println("Mi nombres es " + empleado1.getNombre() + " y mi categoria es: " + empleado1.mostrarCategoria());
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Mi nombres es " + empleado2.getNombre() + " y mi categoria es: " + empleado2.mostrarCategoria());
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Mi nombres es " + afiliado1.getNombre() + " y mi categoria es: " + afiliado1.mostrarCategoria());

    }
}
