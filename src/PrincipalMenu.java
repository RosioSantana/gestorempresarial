import gestor.empresarial.empleados.Empleados;
import gestor.empresarial.empresa.Empresa;

import java.util.*;


public class PrincipalMenu {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Empleados datos = new Empleados();

        //String id;
        int op = 0;
        System.out.println("Seleccione una opcion: ");
        System.out.println("1) Agregar datos Personales");
        System.out.println("2) Agregar datos Empresariales");
        System.out.println("3) Mostrar Datos Empleado");
        System.out.println("4) Agregar Datos Contrato");
        System.out.println("5) Mostrar contrato");
        System.out.println("6) Salir");

        System.out.println("Seleccione una opcion: ");

        op=entrada.nextInt();
        switch (op){
            case 1:
                System.out.println("Ingrese id: ");
                int id = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese nombre: ");
                String nombre = entrada.nextLine();
                System.out.println("Ingrese apellidos: ");
                String ap = entrada.nextLine();
                System.out.println("Ingrese el correo: ");
                String co = entrada.nextLine();
                datos.addDatosPersonales(id,nombre,ap,co);
                break;
            case 2:
                System.out.println("Ingrese la Adscripcion: ");
                String ads = entrada.nextLine();
                System.out.println("Ingrese el Telefono Exterior: ");
                String Tle = entrada.nextLine();
                System.out.println("Ingrese el puesto: ");
                String Pu = entrada.nextLine();
                System.out.println("Id es");
                datos.addDatosEmpresariales(id,ads,Tle,Pu);
                break;

            case 3:
                System.out.println("Datos del empleado:");
                System.out.println("Ingrese el ID:");

                datos.showDatosEmpleado();
                break;
            case 4:
                System.out.println("");


        }
    }
}
