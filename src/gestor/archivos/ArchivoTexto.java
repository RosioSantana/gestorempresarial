package gestor.archivos;
import java.io.*;
public final class ArchivoTexto extends ControlArchivos implements iFileText {
    private File file;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private boolean archivoExiste;
    private boolean modoLectura;
    private boolean modoEscritura;
    public ArchivoTexto(String texto){
        super(texto);
    }
    public ArchivoTexto (String dato, Boolean datos){
        super(dato);
    }
    public void AbrirModoLectura(){
    }
    public String Leer(){
        return ("leyendo");
    }
    public void AbrirModoEscritura(){
    }
    public void Escribir(String letra){
    }
    public void Cerrar(){
    }
}
