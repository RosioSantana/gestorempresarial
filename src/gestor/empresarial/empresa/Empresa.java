package gestor.empresarial.empresa;
/*import gestor.empresarial.empleados.Empleados;*/
import gestor.empresarial.empleados.Empleados;
import gestor.errores.GestionErrores;
//Practica 10 Gestor Empresarial

public final class Empresa {
    private String nombreEmpresa;
    private String representanteLegal;
    private String telefono;
    private String rfc;
    public Empleados datosRH;//diagrama datosRH: Empleados
    public GestionErrores error;
    public Empresa(String e1, String e2){

    }
    public void setRepresentanteLegal(String rl){

    }
    public String getRepresentanteLegal(){
        System.out.println("El representante legal es:");
        return "b";
    }
    public void setTelefono(String t){

    }
    public String getInfo(){
        return "B";
    }
}
