//Práctica 8. Gestor Empresarial (Contrato)
package gestor.empresarial.contrato;
public final class Contrato {
    private int id;
    private int noContrato;
    private int annio;
    private String horario;
    private Cargos tipoCargo; //del tipo Cargos

    public Contrato (int id){//constructor
        this.id = id;
        this.tipoCargo = Cargos.Sindicalizado;
        //tipoCargo = Cargos.temporal;//instanciamos Cargos a traves de tipoCargo
        /*tipoCargo = Cargos.sindicalizado;//instanciamos Cargos a traves de tipoCargo
        tipoCargo = Cargos.temporal;//instanciamos Cargos a traves de tipoCargo*/
    }
    //aqui meti los metodos de los getter y setter para los campos de contrato
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
    public int getId(){
        return id;
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
