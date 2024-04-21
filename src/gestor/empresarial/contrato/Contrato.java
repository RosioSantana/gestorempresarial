package gestor.empresarial.contrato;
public final class Contrato {//estos gettters and setters nos define que datos podemos pedir para contarto, esta clase nos permite pedir y mostrar dichos datos
    private int id;
    private int noContrato;
    private int annio;
    private String horario;
    private Cargos tipoCargo;

    public Contrato (int id){//constructor
        this.id = id;
        this.tipoCargo = Cargos.Sindicalizado;

    }

    public void setId(int id){this.id= id;}
    public int getId(String id){ return this.id;}
    public void setNoContrato(int noContrato) {
        this.noContrato = noContrato;
    }
    public int getNoContrato() {
        return this.noContrato;
    }
    public void setHorario(String horario){
        this.horario = horario;
    }
    public String getHorario(){
        return this.horario;
    }
    public void setAnnio(int annio) {
        this.annio = annio;
    }
    public int getAnnio() {
        return this.annio;
    }
    public void setTipoCargo(Cargos tipoCargo){this.tipoCargo = tipoCargo;}
    public Cargos getTipoCargo(){return this.tipoCargo;}
}
