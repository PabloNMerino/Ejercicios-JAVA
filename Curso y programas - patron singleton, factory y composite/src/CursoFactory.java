public class CursoFactory {

    private static CursoFactory instance;
    public static final String cursoInd = "curso individual";
    public static final String programaInt= "programa intensivo";

    private CursoFactory (){};

    public static CursoFactory getInstance(){
        if(instance == null)
            instance = new CursoFactory();
        return instance;
    }

    public Cursos crearCurso (String codigo) throws CursoException{
        switch (codigo){
            case cursoInd: {
                return new CursoIndependiente("Curso de programacion", "Aprender Java", 20.0, 150.0, 3);
            }
            case programaInt:{
                return new ProgramaIntensivo("Curso intensivo de programacion", "java, javascript y algo mas");
            }
            default:
                throw new CursoException("El codigo de curso solicitado no existe");
        }
    }
}
