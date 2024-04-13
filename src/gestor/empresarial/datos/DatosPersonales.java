//Práctica 7. Gestor Empresarial(Datos)

//Codigo de datos personales
package gestor.empresarial.datos;
public abstract class DatosPersonales {
    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String whatsapp;

    protected void setId() {
        this.id = id;
    }
    protected int getId() {
        return id;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    protected String getNombre() {
        return nombre;
    }
    protected void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    protected String getApellidos() {
        return apellidos;
    }
    protected void setCorreo(String correo) {
        this.correo = correo;
    }
    protected String getCorreo() {
        return correo;
    }
    protected void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    protected String getWhatsapp() {
        return whatsapp;
    }

// Método para obtener los datos completos
public String obtenerDatosCompletos() {
    return "Nombre: " + nombre + "\n" +
            "Apellidos: " + apellidos + "\n" +
            "Correo: " + correo + "\n" +
            "WhatsApp: " + whatsapp;
}
}