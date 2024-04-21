package gestor.empresarial.contrato;
public final class Contrato {
    private int id;
    private int noContrato;
    private int annio;
    private String horario;
    private Cargos tipoCargo;

    public Contrato (int id){//constructor
        this.id = id;
        this.tipoCargo = Cargos.Sindicalizado;

    }

    public void setId(int id){
        this.id= id;
    }
    public void setNoContrato(int noContrato) {
        this.noContrato = noContrato;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }
    public void setTipoCargo(Cargos tipoCargo){
        this.tipoCargo = tipoCargo;
    }
    public void setAnnio(int annio) {
        this.annio = annio;
    }
    public int getId(String id){
        return this.id;
    }
    public int getNoContrato() {
        return noContrato;
    }
    public int getAnnio() {
        return annio;
    }
    public String getHorario(){
        return horario;
    }
    public Cargos getTipoCargo(){
        return tipoCargo;
    }
}
