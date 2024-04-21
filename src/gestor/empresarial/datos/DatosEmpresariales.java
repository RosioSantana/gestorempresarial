package gestor.empresarial.datos;

public class DatosEmpresariales extends DatosPersonales {
    public String adscripcion;
    public String telefonoExterior;
    public String puesto;
    public void setAdscripcion(String adscripcion){
        this.adscripcion=adscripcion;
    }
    public String getAdscripcion(){
        return this.adscripcion;
    }
    public void setTelefonoExterior(String telefonoExterior) {
        this.telefonoExterior = telefonoExterior;
    }
    public String getTelefonoExterior() {
        return this.telefonoExterior;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public String getPuesto() {
        return this.puesto;
    }
}