//interfaz
package gestor.archivos;
public interface iFileText {//esta es una interfaz a implementar en Archivo texto,
    // los metodos que estan aqui forsozamente deben colocarse en Archivo texto
    public void AbrirModoLectura();
    public String Leer();
    public void AbrirModoEscritura();
    public void Escribir(String l);
    public void Cerrar();
}
