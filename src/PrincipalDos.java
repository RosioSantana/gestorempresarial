import gestor.empresarial.contrato.Cargos;
import gestor.empresarial.contrato.Contrato;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.empresarial.empleados.Empleados;

import java.util.Scanner;

public class PrincipalDos {
    public static <findEmpleado> void main(String[] args) {
        //contrato
        Scanner s = new Scanner(System.in);
        Empleados empleados = new Empleados();

        System.out.println("CONTRATO");
        System.out.println("DATOS PARA EL CONTRATO");
        System.out.println("*************");
        System.out.print("Ingrese el ID del contrato: ");
        int idContrato= s.nextInt();
        int idEmpleado= empleados.findEmpleado(idContrato);
        //int  id;
        //empleados.findEmpleado(id =0);
        if (idEmpleado != -1) {
            System.out.println("id empleado");
            System.out.println(empleados.getInfoEmpleado(idEmpleado));
        } else {
            System.out.println("Empleado no encontrado");
        }
        s.nextLine();//limpia el buffer


        System.out.print("Ingrese el número de contrato: ");
        int noContrato = s.nextInt();
        s.nextLine();

        System.out.print("Ingrese el año del contrato: ");
        int annio = s.nextInt();
        s.nextLine();

        System.out.print("Ingrese el horario del contrato: ");
        String horario = s.nextLine();


        System.out.println("Tipos de cargo disponibles:");
        for (Cargos cargo : Cargos.values()) {
            System.out.println(cargo.name());
        }

        System.out.print("Seleccione el tipo de cargo: ");
        String tipoCargoStr = s.nextLine();
        Cargos tipoCargo = Cargos.valueOf(tipoCargoStr);

        empleados.addContrato(idEmpleado,noContrato,annio,horario,tipoCargo);

        /*System.out.println("\nDetalles del contrato:");
        System.out.println("ID del contrato: " + contrato.getId());
        System.out.println("Número de contrato: " + contrato.getNoContrato());
        System.out.println("Año del contrato: " + contrato.getAnnio());
        System.out.println("Horario: " + contrato.getHorario());
        System.out.println("Tipo de cargo: " + contrato.getTipoCargo());*/
    }
}
