public class Main {
    public static void main(String[] args) {
        Instituto instituto1 = new Instituto("Digital House");
        instituto1.agregarCurso(CursoFactory.cursoInd);
        instituto1.generarInforme();

        ProgramaIntensivo p1 = new ProgramaIntensivo("el loco", "re loco");
        p1.agregarCurso(CursoFactory.programaInt);
        p1.calcularPrecio();
    }


}
