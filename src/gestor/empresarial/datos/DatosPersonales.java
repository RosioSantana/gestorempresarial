//clase DatosPersonales

package gestor.empresarial.datos;
public class DatosPersonales {//Datos personales con sus getters and setters nos permite obtener la informacion de id,
    // nombre, apellidos, etc y mostralos ya que estos getters and setters se invoca en los add y show ubicados en Empleados
    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String whatsapp;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() { /*cambiado de protected a public*/
        return this.id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() { /*cambiado de protected a public*/
        return this.nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCorreo() {
        return this.correo;
    }
    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    public String getWhatsapp() {
        return this.whatsapp;
    }
}
