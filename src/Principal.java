package gestor.archivos;
import gestor.empresarial.contrato.Cargos;
import gestor.empresarial.contrato.Contrato;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.empresarial.datos.DatosPersonales;
import java.util.*;

public class Principal {

 public static void main(String[] args) {


  //DATOS EMPRESARIALES //personales
  Scanner te = new Scanner(System.in);
  String adscripcion;
  String telefonoExterior;
  String puesto;
  System.out.println("Datos empresariales");
  System.out.println("*******************");

  System.out.print("Proporciona la adscripcion: ");
  adscripcion = te.nextLine();

  System.out.print("Proporciona el telefono exterior: ");
  telefonoExterior = te.nextLine();

  System.out.print("Ingrese el puesto: ");
  puesto = te.nextLine();
  //DatosEmpresariales datos = new DatosEmpresariales(12, adscripcion, telefonoExterior, puesto);




  //DATOS PERSONALES
  String nombre;
  String apellido;
  String correo;
  String whatsapp;

  Scanner scanner = new Scanner(System.in);
  System.out.println("Ingrese el nombre: ");
  nombre = scanner.nextLine();

  System.out.println("Ingrese los apellidos: ");
  apellido = scanner.nextLine();

  System.out.println("Ingrese el correo: ");
  correo = scanner.nextLine();

  System.out.println("Ingrese el WhatsApp: ");
  whatsapp = scanner.nextLine();
  DatosPersonales dat;
 }
}