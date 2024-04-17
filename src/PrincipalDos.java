import gestor.empresarial.contrato.Cargos;
import gestor.empresarial.contrato.Contrato;
import gestor.empresarial.empleados.Empleados;

import java.util.Scanner;

public class PrincipalDos {
    public static void main(String[] args) {
        //contrato
        Scanner s = new Scanner(System.in);
        Empleados empleados = new Empleados();

        System.out.println("CONTRATO");
        System.out.println("DATOS PARA EL CONTRATO");
        System.out.println("*************");
        System.out.print("Ingrese el ID del contrato: ");
        int id = s.nextInt();
        s.nextLine();//limpia el buffer
        Contrato contrato = new Contrato(id);

        System.out.print("Ingrese el número de contrato: ");
        int noContrato = s.nextInt();
        s.nextLine();
        contrato.setNoContrato(noContrato);

        System.out.print("Ingrese el año del contrato: ");
        int annio = s.nextInt();
        s.nextLine();
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
        empleados.addContrato(id,noContrato,annio,horario,tipoCargo);
        int idempleado = idempleado (id,empleados);

        if(idempleado != -1){
            System.out.println("Datos del empleado asociado al contrato:");
            System.out.println(empleados.getInfoEmpleado(idempleado));
        }else{
            System.out.println("Empleado no encontrado en el sistema");
        }


        //contrato.setTipoCargo(tipoCargo);

        System.out.println("\nDetalles del contrato:");
        System.out.println("ID del contrato: " + contrato.getId());
        System.out.println("Número de contrato: " + contrato.getNoContrato());
        System.out.println("Año del contrato: " + contrato.getAnnio());
        System.out.println("Horario: " + contrato.getHorario());
        System.out.println("Tipo de cargo: " + contrato.getTipoCargo());
        }
}