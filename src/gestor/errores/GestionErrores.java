package gestor.errores;
import gestor.archivos.ArchivoTexto;

import java.util.*;
//Práctica 11. Gestor Empresarial (Gestión de Errores)
public final class GestionErrores {
    private Map<Integer, String> error;
    private boolean existeError;
    private int noError;
    private String descripcionTecnica;
    private ArchivoTexto almacenador;

    public GestionErrores() {
        error = new HashMap<Integer, String>();
        almacenador = new ArchivoTexto("C:\\Users\\Luis Agustin TH\\Videos\\Almacenador\\Errores.txt");
        almacenador.AbrirModoEscritura();

    }

    public void CargarErrores() {
        error.put(1, "No encontrado");
        error.put(2, "No guardado");
        error.put(3, "Inexistente");
        error.put(4, "No encontrado");
        error.put(5, "Imposible almacenar, puestos llenos");

    }

    public void setNoError(int folio, String textoerror) {
        error.put(folio, textoerror);
    }

    public String getError(int folio) {

        almacenador.AbrirModoEscritura();
        CargarErrores();
        almacenador.Escribir(error.get(folio));


        almacenador.Cerrar();
        return error.get(folio);

    }

    public String getErrorTecnico() {
        return null;
    }

    public boolean ExisteError() {
        return false;
    }
}

