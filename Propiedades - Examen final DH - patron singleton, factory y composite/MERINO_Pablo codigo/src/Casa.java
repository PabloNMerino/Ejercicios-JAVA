public class Casa extends Propiedad{

    private Double impuestoBase;

    public Casa(String calle, Integer numero, Double impuestoBase) {
        super(calle, numero);
        this.impuestoBase = impuestoBase;
    }


    @Override
    public Double calcularImpuesto() {
        if(this.getCalle().equals("Av. San Martin"))
            return impuestoBase + (impuestoBase*0.1);
        return impuestoBase;
    }
}
