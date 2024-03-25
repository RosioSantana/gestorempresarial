//Práctica 7. Gestor Empresarial (Datos)

//Código de datos empresariales
package gestor.empresarial.datos;

public final class DatosEmpresariales extends DatosPersonales {
    private String adscripcion;
    private String telefonoExterior;
    private String puesto;

    public DatosEmpresariales(int d1, String d2, String d3, String d4){
    }
    void setAdscripcion(String adscripcion){
        this.adscripcion=adscripcion;
    }
    String getAdscripcion(){
        return adscripcion;
    }
    void setTelefonoExterior(String telefonoExterior) {
        this.telefonoExterior = telefonoExterior;
    }
    String getTelefonoExterior() {
        return telefonoExterior;
    }
    void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    String getPuesto() {
        return puesto;
    }
}
