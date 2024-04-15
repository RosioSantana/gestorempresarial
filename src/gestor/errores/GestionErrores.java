package gestor.errores;
import java.util.*;
//Práctica 11. Gestor Empresarial (Gestión de Errores)
public final class GestionErrores {
    private Map<Integer,String> error;
    private boolean existeError;
    private int noError;
    private String descripcionTecnica;
    public GestionErrores(){
        error = new HashMap<Integer,String>();

    }
    private void CargarErrores(){
        error.put(1, "No encontrado");
        error.put(2, "No guardado");
        error.put(3, "Inexistente");
        error.put(4, "No encontrado");
    }
    public void setNoError(int a, String b){
    }
    public String getError(){
        return ":D";
    }
    public String getErrorTecnico(){
        return null;
    }
    public boolean ExisteError(){
        return false;
    }
}
