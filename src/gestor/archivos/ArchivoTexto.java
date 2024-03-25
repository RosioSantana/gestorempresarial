package gestor.archivos;
import java.io.*;
import java.util.*;
public class ArchivoTexto implements iFileText {
    private File file;//atributo con un nuevo tipo aqui se veran los demas atributos
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;
    private boolean archivoExistente;
    private boolean modoLectura;
    private boolean modoEscritura;
    public ArchivoTexto(String tituloArchivo){//constructor
        try {
            file = new File(tituloArchivo);

            if (!file.exists())
                file.createNewFile();

            this.archivoExistente = true;
            this.modoLectura = false;
            this.modoEscritura = false;
        }
        catch (Exception e){
            System.out.println("Error al intentar buscar el archivo");
            this.archivoExistente=false;
        }
    }
    public void AbrirModoLectura(){//Aqui se implementan los metodos de la interfaz previamente vista}
        if(archivoExistente){
            try{
                fr = new FileReader(this.file.getAbsoluteFile());
                br = new BufferedReader(this.fr);
                this.modoLectura = true;
                System.out.println("Archivo abierto en modo de lectura");

            }catch
            (Exception e){
                System.out.println("Error: archivo no se puede abrir en modo lectura");
            }
        }
    }
    public String Leer(){
        if(archivoExistente == true){
            try{
                return this.br.readLine();
            }catch (Exception e){
            }
        }
        return null;
    }
    public void AbrirModoEscritura(){
        if(archivoExistente){
            try{     /*todo lo que dentro de las llaves esta en supervision*/
                fw = new FileWriter(this.file.getAbsoluteFile(),true);//entre la ruta y el archivo getAbsoluteFile completito
                bw = new BufferedWriter(this.fw);//BufferedWriter cargar en memoria todo el archivo
                modoEscritura=true;
                System.out.println("Archivo abierto en modo lectura");
            }catch(Exception e){
                System.out.println("Error: El archivo no se puede abrir en modo escritura" + e.getMessage());
            }
        }
    }
    public void Escribir(String texto){
        if(archivoExistente==true){
            try{
                this.bw.write(texto+"\n");
            }catch (Exception e){
                System.out.println("Error: No se puede escribir informacion en el archivo");
            }
        }
    }
    public void Cerrar(){
        if(modoEscritura==true){
            try{
                this.bw.close();
                this.fw.close();
            }catch (Exception e){

            }
        }
        else if(modoLectura){
            try{
                this.br.close();
                this.fr.close();
            }catch (Exception e){

            }
        }
    }
}