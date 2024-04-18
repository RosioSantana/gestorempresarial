//Práctica 7. Gestor Empresarial (Datos)

//Código de datos empresariales
package gestor.empresarial.datos;

public class DatosEmpresariales extends DatosPersonales {
    public String adscripcion;
    public String telefonoExterior;
    public String puesto;

    public DatosEmpresariales() {/*agregado por Rosio*/

    }


    /*public DatosEmpresariales(int d1, String adscripcion, String telefonoExterior, String puesto){
        // Llamar al constructor de la clase base DatosPersonales
        this.adscripcion = adscripcion;
        this.telefonoExterior = telefonoExterior;
        this.puesto = puesto;
    }*/

    public void setAdscripcion(String adscripcion){
        this.adscripcion=adscripcion;
    }
    public String getAdscripcion(){
        return adscripcion;
    }
    public void setTelefonoExterior(String telefonoExterior) {
        this.telefonoExterior = telefonoExterior;
    }
    public String getTelefonoExterior() {
        return telefonoExterior;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public String getPuesto() {
        return puesto;
    }
}