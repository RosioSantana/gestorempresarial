import gestor.empresarial.contrato.Cargos;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.empresarial.empleados.Empleados;
import gestor.empresarial.empresa.Empresa;
import gestor.empresarial.contrato.Contrato;
import gestor.errores.GestionErrores;
import java.util.*;

public class PrincipalMenu {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Empleados datos = new Empleados();
        Contrato con = new Contrato(1);
        GestionErrores error = new GestionErrores();
        Empresa pe = new Empresa("1","2");

        String nombre;
        String ap;
        String co;
        String whats;

        String ads;
        String Tle;
        String Pu;

        String id ;
        String cont;
        String ann;
        int op = 0;
        do{
        System.out.println("Seleccione una opcion: ");
        System.out.println("1) Agregar datos Personales");
        System.out.println("2) Mostrar datos Personales");
        System.out.println("3) Agregar datos Empresariales");
        System.out.println("4) Mostrar Datos Empleado");
        System.out.println("5) Agregar Datos Contrato");
        System.out.println("6) Mostrar contrato");
        System.out.println("7) Empresa");
        System.out.println("8) Salir");
        System.out.println("Seleccione una opcion: ");

        op=entrada.nextInt();
        switch (op) {
            case 1://1) Agregar datos Personales
                entrada.nextLine();

                System.out.println("Ingrese el nombre: ");
                nombre = entrada.nextLine();

                System.out.println("Ingrese apellidos: ");
                ap = entrada.nextLine();

                System.out.println("Ingrese el correo: ");
                co = entrada.nextLine();

                System.out.println("Ingrese el WhatsApp: ");
                whats = entrada.nextLine();

                datos.addDatosPersonales(nombre, ap, co,whats);

                System.out.println("Su id asignado es: " + datos.getId());
                break;
            case 2://2) Mostrar datos Personales
                System.out.println("Datos del empleado:");

                datos.showDatosPersonales();
                break;

            case 3://3) Agregar datos Empresariales
                entrada.nextLine();
                System.out.println("Proporciona el Id del aspirante");
                id = entrada.nextLine();

                if (Integer.parseInt(id) > 0 && Integer.parseInt(id) <= datos.getId()) {//duda fffffffffffffffffffffffffffffffffffff
                    System.out.println("Ingrese la Adscripcion: ");
                    ads = entrada.nextLine();
                    System.out.println("Ingrese el Telefono Exterior: ");
                    Tle = entrada.nextLine();
                    System.out.println("Ingrese el puesto: ");
                    Pu = entrada.nextLine();
                    datos.addDatosEmpresariales(Integer.parseInt(id) - 1, ads, Tle, Pu);
                } else {
                    //error.setNoError(1, "No encontrado");
                    error.getError(2);
                    System.out.println(error.getError(2));
                }
                break;
            case 4://4) Mostrar Datos Empleado
                System.out.println("Los datos empresariales son los siguientes");
                System.out.println();
                datos.showDatosEmpleado();
                break;

            case 5: //5) Agregar Datos Contrato

                entrada.nextLine();
                System.out.println("Proporciona el ID del trabajdor");
                id = entrada.nextLine();

                if (Integer.parseInt(id) > 0 && Integer.parseInt(id) <= datos.getId()) {

                        System.out.print("Ingrese el ID del contrato: ");
                        int idContrato = entrada.nextInt();

                        entrada.nextLine();
                        System.out.println("Ingrese numero de contrato:");
                        cont = entrada.nextLine();
                        System.out.println("Ingrese año:");
                        ann = entrada.nextLine();
                        System.out.println("Ingrese el horario:");
                        String hor = entrada.nextLine();
                        System.out.println("Tipos de cargo disonibles:");
                        for (Cargos cargo : Cargos.values()) {
                            System.out.println(cargo.name());
                        }
                        System.out.println(" A)Sindicalizado\n B)confianza\n C)temporal\n Seleccione el tipo de cargo:");
                        String tipoCargoStr = entrada.nextLine();
                        Cargos tipoCargo = Cargos.Sindicalizado;
                        switch(tipoCargoStr) {
                            case "A":
                                tipoCargo = Cargos.Sindicalizado;
                                break;
                            case "B":
                                tipoCargo = Cargos.confianza;
                                break;
                            case "C":
                                tipoCargo = Cargos.temporal;
                                break;
                        }

                        datos.addContrato(Integer.parseInt(id), Integer.parseInt(cont), Integer.parseInt(ann), hor, tipoCargo);
                    }

                else {
                    System.out.println(error.getError(2));
                }
                break;

            case 6:
                System.out.println("***Datos Contrato***");
                datos.showContratosEmpleado(2);
                break;

            case 7:
               datos.showEmpresa();
                break;

            case 8:
                System.out.println("Hasta luego");
                break;

            default:
                System.out.println(error.getError(3));
        }
        }while(op!=8);
    }
}
