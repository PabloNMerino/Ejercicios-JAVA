public class SistemaArmas {
    private Integer energia;

    public SistemaArmas(Integer energia) {
        this.energia = energia;
    }

    public void mostrar (){
        System.out.println("La energia es de " + this.getEnergia());
    }

    public Integer getEnergia() {
        return energia;
    }

}
