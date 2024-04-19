import gestor.empresarial.contrato.Cargos;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.empresarial.empleados.Empleados;
import gestor.empresarial.empresa.Empresa;
import gestor.empresarial.contrato.Contrato;


import java.util.*;


public class PrincipalMenu {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Empleados datos = new Empleados();
        Contrato con = new Contrato(1);


        String id;
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
        System.out.println("7) Salir");
        System.out.println("Seleccione una opcion: ");

        op=entrada.nextInt();
        switch (op) {
            case 1://1) Agregar datos Personales
                entrada.nextLine();

                System.out.println("Ingrese el nombre: ");
                String nombre = entrada.nextLine();

                System.out.println("Ingrese apellidos: ");
                String ap = entrada.nextLine();

                System.out.println("Ingrese el correo: ");
                String co = entrada.nextLine();

                datos.addDatosPersonales(nombre, ap, co);

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
                    String ads = entrada.nextLine();
                    System.out.println("Ingrese el Telefono Exterior: ");
                    String Tle = entrada.nextLine();
                    System.out.println("Ingrese el puesto: ");
                    String Pu = entrada.nextLine();
                    datos.addDatosEmpresariales(Integer.parseInt(id) - 1, ads, Tle, Pu);
                } else {
                    System.out.println("No valido");
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
                    if (datos.getId() == null){//DatosPersonas[i].getWhatsapp()
                        System.out.println("no entramos");

                    }
                    else {
                        System.out.println("entramos");
                        System.out.print("Ingrese el ID del contrato: ");
                        int idContrato = entrada.nextInt();
                        int idEmpleado = datos.findEmpleado(idContrato);
                        //int  id;
                        //empleados.findEmpleado(id =0);
                        if (idEmpleado != -1) {
                            System.out.println("id empleado");
                            System.out.println(datos.getInfoEmpleado(idEmpleado));
                        } else {
                            System.out.println("Empleado no encontrado");
                        }

                        entrada.nextLine();
                        System.out.println("Ingrese numero de contrato:");
                        cont = entrada.nextLine();
                        System.out.println("Ingrese ingrese annio:");
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
                        switch (tipoCargoStr) {
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

                        // int temporal = Integer.parseInt(id);
                        //4
                        datos.addContrato(Integer.parseInt(id), Integer.parseInt(cont), Integer.parseInt(ann), hor, tipoCargo);
                        datos.showContratosEmpleado(4);

                    }


                }
                else {
                    System.out.println("No valido");
                }
                break;

            case 6:
                System.out.println("***Datos Contrato***");

                datos.showContratosEmpleado(2);

                break;

            case 7:
                System.out.println("Hasta luego");
                break;
        }
        }while(op<7);
    }
}
