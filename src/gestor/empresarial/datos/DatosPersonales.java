//Práctica 7. Gestor Empresarial(Datos)

//Codigo de datos personales
package gestor.empresarial.datos;
public class DatosPersonales { /*le quite el abstract porque no me permitia instanciar*/
    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String whatsapp;

    public void setId() {
        this.id = id;
    }
    public int getId() { /*cambiado de protected a public*/
        return id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() { /*cambiado de protected a public*/
        return nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCorreo() {
        return correo;
    }
    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    public String getWhatsapp() {
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