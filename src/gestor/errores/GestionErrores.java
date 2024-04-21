package gestor.errores;
import gestor.archivos.ArchivoTexto;

import java.util.*;

public final class GestionErrores {
    private Map<Integer, String> error;
    private ArchivoTexto almacenador;

    public GestionErrores() {
        error = new HashMap<Integer, String>();
        almacenador = new ArchivoTexto("C:\\Users\\RossS\\Documents\\Almacenador\\Fallas.txt");
        almacenador.AbrirModoEscritura();

    }

    public void CargarErrores() {
        error.put(1, "No hay mas vacantes");
        error.put(2, "Id no encontrado");
        error.put(3, "Opcion no valida");
    }

    public String getError(int folio) {
        almacenador.AbrirModoEscritura();
        CargarErrores();
        almacenador.Escribir(error.get(folio));
        almacenador.Cerrar();
        return error.get(folio);
    }

}