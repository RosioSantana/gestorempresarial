package gestor.archivos;
import gestor.empresarial.contrato.Cargos;
import gestor.empresarial.contrato.Contrato;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.empresarial.datos.DatosPersonales;
import java.util.*;

public class Principal {

 public static void main(String[] args) {
  ArchivoTexto file1 = new ArchivoTexto("C:\\Users\\Luis Agustin TH\\Videos\\java\\rubireprobada.txt");
  String linea;
  Scanner teclado = new Scanner(System.in);

  file1.AbrirModoEscritura();
  System.out.println("Escribe una materia: ");
  linea = teclado.nextLine();
  file1.Escribir(linea);

  System.out.println("Escribe una materia mas:");
  linea = teclado.nextLine();
  file1.Escribir(linea);

  file1.Cerrar();

  file1.AbrirModoLectura();
  while (linea != null) {
   System.out.println(linea);
   linea = file1.Leer();
  }
  file1.Cerrar();

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
  DatosEmpresariales datos = new DatosEmpresariales(12, adscripcion, telefonoExterior, puesto);




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
//contrato
  Scanner s = new Scanner(System.in);
  System.out.println("CONTRATO");
  System.out.println("DATOS PARA EL CONTRATO");
  System.out.println("*************");
  System.out.print("Ingrese el ID del contrato: ");
  int id = s.nextInt();
  Contrato contrato = new Contrato(id);

  System.out.print("Ingrese el número de contrato: ");
  int noContrato = s.nextInt();
  contrato.setNoContrato(noContrato);

  System.out.print("Ingrese el año del contrato: ");
  int annio = s.nextInt();
  contrato.setAnnio(annio);

  System.out.print("Ingrese el horario del contrato: ");
  s.nextLine();
  String horario = s.nextLine();
  contrato.setHorario(horario);

  System.out.println("Tipos de cargo disponibles:");
  for (Cargos cargo : Cargos.values()) {
   System.out.println(cargo.name());

  }

  System.out.print("Seleccione el tipo de cargo: ");
  String tipoCargoStr = s.nextLine();
  Cargos tipoCargo = Cargos.valueOf(tipoCargoStr);

  contrato.setTipoCargo(tipoCargo);

  System.out.println("\nDetalles del contrato:");
  System.out.println("ID del contrato: " + contrato.getId());
  System.out.println("Número de contrato: " + contrato.getNoContrato());
  System.out.println("Año del contrato: " + contrato.getAnnio());
  System.out.println("Horario: " + contrato.getHorario());
  System.out.println("Tipo de cargo: " + contrato.getTipoCargo());


 }
}