//Clase DatosEmpresariales
package gestor.empresarial.datos;

public class DatosEmpresariales extends DatosPersonales {/*Datos empresariales con sus getters and setters nos permite obtener la informacion de
    adscripcion, telefonoExterior, puesto y mostralos ya que estos getters and setters se invoca en los add y show ubicados en Empleados
    Tambien podemos ver que DatosEmpresariales obtiene herencia de DatosPersonales por lo que podemos usar DatosEmpresariales para pedir todos los datos*/
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