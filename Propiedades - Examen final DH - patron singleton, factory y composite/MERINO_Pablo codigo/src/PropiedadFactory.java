public class PropiedadFactory {

    private static PropiedadFactory instance;

    public static final String CODIGO_AV_SM = "Av. San Martin";
    public static final String CODIGO_MITRE = "Mitre";
    public static final String CODIGO_GUTIERRES = "Gutierres";

    private PropiedadFactory(){}

    public static PropiedadFactory getInstance(){
        if(instance == null)
            instance = new PropiedadFactory();
        return instance;
    }

    public Propiedad agregarPropiedad (String codigo) throws PropiedadFactoryException {
        switch(codigo){
            case CODIGO_AV_SM:
                return new Casa("Av. San Martin", 130, 500.0);
            case CODIGO_MITRE:
                return new Casa("Mitre", 233, 700.0);
            case CODIGO_GUTIERRES:
                BarrioCerrado barrioCerrado = new BarrioCerrado("Gutierres", 330, 2);
                barrioCerrado.agregarCasa(agregarPropiedad(CODIGO_AV_SM));
                barrioCerrado.agregarCasa(agregarPropiedad(CODIGO_MITRE));
                return barrioCerrado;
            default:
                throw new PropiedadFactoryException("La casa de codigo " + codigo + " no existe!");
        }
    }
}
