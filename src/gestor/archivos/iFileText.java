package gestor.archivos;

public interface iFileText {
    public void AbrirModoLectura();
    public String Leer();
    public void AbrirModoEscritura();
    public void Escribir(String l);
    public void Cerrar();
}
