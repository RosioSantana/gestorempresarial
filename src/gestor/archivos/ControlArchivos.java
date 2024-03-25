package gestor.archivos;

public abstract class ControlArchivos {
    private String archivo;
    public ControlArchivos(String archi){

    }
    public boolean Crear(){
        return false;
    }
    public boolean Eliminar(){
        return false;
    }
    public boolean Cambiar(String cambi){
        return false;
    }
    public boolean Mover(String move){
        return false;
    }
}
