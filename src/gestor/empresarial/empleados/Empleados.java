package gestor.empresarial.empleados;
import gestor.empresarial.contrato.Cargos;
import gestor.errores.GestionErrores;
//modificar diagrama
//Práctica 9. Gestor Empresarial (Empleado)
public final class Empleados implements iEmpleados{
    private int i;
    public GestionErrores error;
    public Empleados(){//constructor
    }
    public void addDatosPersonales(String d1, String d2, String d3){
    }
    public void addContrato(int con1, int con2, String con3, Cargos con4){
    }

    private int findEmpleado(int find1){
        return find1;
    }
    private int findEmpleado(String find2){
        return 0;//duda
    }
    public void setWhatsApp(int n, String wsp){

    }
    private String datosPersonales(int dp){//duda si es clase para el add
        return "Hola";
    }

    public String getInfoEmpleado(int empleado2) {
        return null;
    }


    public String getInforEmpleado(String empleado) {
        return null;
    }
    public void setAdscripcion(int a, String ads){
    }
    public void setTelefonoExtension(int t, String num){
    }
    public void setPuesto(int p, String puest){

    }

    public void showDatosEmpleado() {

    }
    public void showContratosEmpleado(int ce){//cambiar en el diagrama a contratos

    }

    public int getAntiguedad(int id) {//dada en el int entre ()
        return 0;
    }
    public void setCargo(Cargos car){//cargo o cargos-atencioooooooooooooooooooooooooooooooooooon
    }

}