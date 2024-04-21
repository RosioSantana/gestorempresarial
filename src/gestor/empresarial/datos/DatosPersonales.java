package gestor.empresarial.datos;
public class DatosPersonales {
    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String whatsapp;

    public void setId(int id) {
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


}
