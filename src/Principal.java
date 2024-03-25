package gestor.archivos;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        ArchivoTexto file1 = new ArchivoTexto("C:\\Users\\Luis Agustin TH\\Videos\\java\\rubireprobada.txt");
        String linea;
        Scanner teclado = new Scanner(System.in);

        file1.AbrirModoEscritura();
        System.out.println("Escribe una materia: ");
        linea=teclado.nextLine();
        file1.Escribir(linea);

        System.out.println("Escribe una materia mas:");
        linea=teclado.nextLine();
        file1.Escribir(linea);

        file1.Cerrar();

        file1.AbrirModoLectura();
        while(linea != null){
            System.out.println(linea);
            linea=file1.Leer();
        }
        file1.Cerrar();
    }
}