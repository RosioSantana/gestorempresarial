package gestor.archivos;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.empresarial.datos.DatosPersonales;
import java.util.*;




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

        //DATOS EMPRESARIALES //personales
        Scanner te = new Scanner(System.in);
        String adscripcion;
        String telefonoExterior;
        String puesto;

        System.out.print("Proporciona la adscripcion: ");
        adscripcion = te.nextLine();

        System.out.print("Proporciona el telefono exterior: ");
        telefonoExterior = te.nextLine();

        System.out.print("Ingrese el puesto: ");
        puesto = te.nextLine();
        DatosEmpresariales datos = new DatosEmpresariales(12,adscripcion, telefonoExterior,puesto);

    }
}