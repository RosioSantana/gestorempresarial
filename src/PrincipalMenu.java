import gestor.empresarial.contrato.*;
import gestor.empresarial.empleados.*;
import gestor.errores.GestionErrores;
import java.util.*;

public class PrincipalMenu {//menu principal
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);//lectura desde teclado e instancias
        Empleados datos = new Empleados();
        GestionErrores error = new GestionErrores();

        String nombre;//variables para pasar la información
        String ap;
        String co;
        String whats;

        String ads;
        String tle;
        String pu;

        String id ;
        String cont;
        String ann;
        int op = 0;
        do{//por medio de este do-while con switch logramos mostrar el menú
        System.out.println("\n \nBienvenido al gestor empresarial de la empresa ITERA ");
        System.out.println(" ----- Menú ----- ");
        System.out.println("1) Agregar datos personales");
        System.out.println("2) Mostrar datos personales");
        System.out.println("3) Agregar datos empresariales");
        System.out.println("4) Mostrar datos empleado");
        System.out.println("5) Agregar datos del contrato");
        System.out.println("6) Mostrar contratos");
        System.out.println("7) Acerca de la empresa");
        System.out.println("8) Salir");
        System.out.println("Seleccione una opción: ");

        op=entrada.nextInt();
        switch (op) {//dependiendo del numero seleccionado usted podra elegir que desea hacer
            case 1://por ejemplo, aqui leemos lo introducido en el teclado, las variables almacenaran y lo enviaran al arreglo que se encuentra en empleados
                System.out.println(" ----- Agregar datos personales ----- ");
                entrada.nextLine();

                System.out.println("Ingrese el nombre: ");
                nombre = entrada.nextLine();

                System.out.println("Ingrese los apellidos: ");
                ap = entrada.nextLine();

                System.out.println("Ingrese el correo: ");
                co = entrada.nextLine();

                System.out.println("Ingrese el WhatsApp: ");
                whats = entrada.nextLine();

                datos.addDatosPersonales(nombre, ap, co,whats);

                System.out.println("*****IMPORTANTE: Su id asignado es " + datos.getId());
                break;
            case 2:
                System.out.println(" ----- Mostrando datos personales ----- ");
                System.out.println("Datos del empleado:");

                datos.showDatosPersonales();
                break;

            case 3:
                System.out.println(" ----- Agregar datos empresariales ----- ");
                entrada.nextLine();
                System.out.println("Proporciona el id del aspirante");
                id = entrada.nextLine();

                if (Integer.parseInt(id) > 0 && Integer.parseInt(id) <= datos.getId()) {
                    System.out.println("Ingrese la adscripcion: ");
                    ads = entrada.nextLine();
                    System.out.println("Ingrese el telefono exterior: ");
                    tle = entrada.nextLine();
                    System.out.println("Ingrese el puesto: ");
                    pu = entrada.nextLine();
                    datos.addDatosEmpresariales(Integer.parseInt(id) - 1, ads, tle, pu);
                } else {
                    System.out.println(error.getError(2));//muestra error 2 en pantalla
                }
                break;
            case 4:
                System.out.println(" ----- Mostrar datos empresariales ----- ");
                System.out.println("Los datos empresariales son los siguientes");
                System.out.println();
                datos.showDatosEmpleado();
                break;

            case 5:
                System.out.println(" ----- Agregar datos del contrato ----- ");
                entrada.nextLine();
                System.out.println("Proporciona el id del trabajador");
                id = entrada.nextLine();

                if (Integer.parseInt(id) > 0 && Integer.parseInt(id) <= datos.getId()) {

                        System.out.print("Ingrese el id del contrato: ");
                        int idContrato = entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Ingrese número de contrato:");
                        cont = entrada.nextLine();
                        System.out.println("Ingrese año:");
                        ann = entrada.nextLine();
                        System.out.println("Ingrese el horario:");
                        String hor = entrada.nextLine();
                        System.out.println("Tipos de cargo disponibles:");
                        for (Cargos cargo : Cargos.values()) {
                            System.out.println(cargo.name());
                        }
                        System.out.println(" A)Sindicalizado\n B)Confianza\n C)Temporal\n Seleccione el tipo de cargo:");
                        String tipoCargoStr = entrada.nextLine();
                        Cargos tipoCargo = Cargos.Sindicalizado;
                        switch(tipoCargoStr) {


                            case "A":
                                tipoCargo = Cargos.Sindicalizado;
                                break;
                            case "B":
                                tipoCargo = Cargos.Confianza;
                                break;
                            case "C":
                                tipoCargo = Cargos.Temporal;
                                break;
                        }

                        datos.addContrato(Integer.parseInt(id), Integer.parseInt(cont), Integer.parseInt(ann), hor, tipoCargo);
                    }

                else {
                    System.out.println(error.getError(2));//muestra eeror 2 en pantalla y almacena
                }
                break;

            case 6:
                System.out.println(" ----- Mostrando datos de los contratos ----- ");
                datos.showContratosEmpleado(2);
                break;

            case 7:
                System.out.println(" ----- Sobre ITERA ----- ");
               datos.showEmpresa();
                break;

            case 8:
                System.out.println("Cerrando gestor empresarial de ITERA");
                break;

            default:
                System.out.println(error.getError(3));//muestra error 3 en pantalla y almacena
        }
        }while(op!=8);//si seleccionamos 8, el ciclo no se ejecutara mas
    }
}
