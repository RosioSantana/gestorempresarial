//Práctica 7. Gestor Empresarial (Datos)

//Código de datos empresariales
package gestor.empresarial.datos;

public final class DatosEmpresariales extends DatosPersonales {
    private String adscripcion;
    private String telefonoExterior;
    private String puesto;


    public DatosEmpresariales(int d1, String adscripcion, String telefonoExterior, String puesto){
        // Llamar al constructor de la clase base DatosPersonales
        this.adscripcion = adscripcion;
        this.telefonoExterior = telefonoExterior;
        this.puesto = puesto;

        System.out.println("Datos empresariales");
        System.out.println("*******************");
        System.out.println("ingrese el telefono exterior: " + getTelefonoExterior());
        System.out.println("ingrese el puesto: " + getPuesto());
        System.out.println("ingrese la adscripcion: " + getAdscripcion());
        System.out.println("Ayuda");
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