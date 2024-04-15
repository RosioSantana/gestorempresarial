//Práctica 7. Gestor Empresarial (Datos)

//Código de datos empresariales
package gestor.empresarial.datos;

public final class DatosEmpresariales extends DatosPersonales {
    private String adscripcion;
    private String telefonoExterior;
    private String puesto;

    public DatosEmpresariales(String nombre, String apellidos, String correo) {/*agregado por Rosio*/
        super.setNombre(nombre);
        super.setApellidos(apellidos);
        super.setCorreo(correo);
    }


    public DatosEmpresariales(int d1, String adscripcion, String telefonoExterior, String puesto){
        // Llamar al constructor de la clase base DatosPersonales
        this.adscripcion = adscripcion;
        this.telefonoExterior = telefonoExterior;
        this.puesto = puesto;
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