//Práctica 8. Gestor Empresarial (Contrato)
package gestor.empresarial.contrato;
public final class Contrato {
    private int id;
    private int noContrato;
    private int annio;
    private String horario;
    private Cargos tipoCargo; //del tipo Cargos

    public Contrato (){//constructor
        tipoCargo = Cargos.temporal;//instanciamos Cargos a traves de tipoCargo
        tipoCargo = Cargos.sindicalizado;//instanciamos Cargos a traves de tipoCargo
        tipoCargo = Cargos.temporal;//instanciamos Cargos a traves de tipoCargo

    }
    public void setNoContrato(int noContrato) {
        this.noContrato = noContrato;
    }
    public int getNoContrato() {
        return noContrato;
    }
    public void setAnnio(int annio) {
        this.annio = annio;
    }
    public int getAnnio() {
        return annio;
    }

    //creados para que empleado pueda usarlos DUDA
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Cargos getTipoCargo() {
        return tipoCargo;
    }

    public void setTipoCargo(Cargos tipoCargo) {
        this.tipoCargo = tipoCargo;
    }
}
