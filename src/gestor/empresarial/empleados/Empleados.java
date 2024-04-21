package gestor.empresarial.empleados;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.errores.GestionErrores;

public final class Empleados implements iEmpleados {//empleados implementa la interfaz iEmpleados
    public GestionErrores error;
    private DatosEmpresariales[] DatosPersonas;
    private int i;
    private Contrato[] Contratos;
    private int j;

    public Empleados() {//constructor
        DatosPersonas = new DatosEmpresariales[100];
        Contratos = new Contrato[100];
        this.i = 0;
        this.j = 0;
        error = new GestionErrores();
    }


    public void addDatosPersonales( String nombre, String apellidos, String correo,String whatsapp) {//arreglo para agregar datos personales

        if (i < 100) {
            DatosPersonas[i] = new DatosEmpresariales();//datos que almacenamos
            DatosPersonas[i].setId(i+1);
            DatosPersonas[i].setNombre(nombre);
            DatosPersonas[i].setApellidos(apellidos);
            DatosPersonas[i].setCorreo(correo);
            DatosPersonas[i].setWhatsapp(whatsapp);
            this.i++;
            System.out.println("Datos personales agregados");
        } else {
            System.out.println(error.getError(2));//muestra eeror 2 en pantalla y almacena
        }
    }
    public int getId(){
        return this.i;
    }//brindamos un id controlado por i
    public void showDatosPersonales(){//mostramos lo contenido en el arreglo cuando se invoca desde el principal
        for(int k=0; k<i; k++){
            System.out.println("Id: " + DatosPersonas[k].getId()+", Nombre: "+DatosPersonas[k].getNombre()+", Apellidos: "+DatosPersonas[k].getApellidos()+", Correo: "+DatosPersonas[k].getCorreo()+", WhatsApp: "+DatosPersonas[k].getWhatsapp());
        }
    }

    public void addDatosEmpresariales(int Id, String Adscripcion, String TelefonoExterior, String Puesto) {//agregamos Datos empresariales en el arreglo
        if (Id >=0 && Id <=this.i) {

            DatosPersonas[Id].setAdscripcion(Adscripcion);
            DatosPersonas[Id].setTelefonoExterior(TelefonoExterior);
            DatosPersonas[Id].setPuesto(Puesto);

            System.out.println("Datos Empresariales agregados");
        }
    }

    public void showDatosEmpleado() {//mostramos toda la información desde datos personales hasta empresariales
        for (int k = 0; k<i; k++) {
            System.out.println("Id: " + DatosPersonas[k].getId()+", Nombre: "+DatosPersonas[k].getNombre()+", Apellidos: "+DatosPersonas[k].getApellidos()+", Correo: "+DatosPersonas[k].getCorreo()+", WhatsApp: "+DatosPersonas[k].getWhatsapp()
                    + ", Adscripción: " + DatosPersonas[k].getAdscripcion()+", Telefono exterior: "+DatosPersonas[k].getTelefonoExterior()+", Puesto: "+DatosPersonas[k].getPuesto());
        }
    }

    public void addContrato(int id, int noContrato, int annio, String horario, Cargos tipoCargo) {//este arreglo nos permite agregar informacion del contrato
        Contratos[j] = new Contrato(id);
        if (this.j < 100) {
            Contratos[j].setNoContrato(noContrato);
            Contratos[j].setAnnio(annio);
            Contratos[j].setHorario(horario);
            Contratos[j].setTipoCargo(tipoCargo);
            this.j++;
            System.out.println("Datos del contrato agregados");
        }
    }

    public void showContratosEmpleado(int b) {//mostramos los datos del contrato almacenados en el arreglo
        for (int k = 0; k<j; k++) { /*linea agregada con int*/
            if (Contratos[k] != null) {
                System.out.println("Id empleado: " + DatosPersonas[k].getId() + ", No de contrato: " + Contratos[k].getNoContrato() + ", Año: " + Contratos[k].getAnnio() + ", Horario: " + Contratos[k].getHorario() + ", Cargo: " + Contratos[k].getTipoCargo());
            }
        }
    }
    public void showEmpresa(){//aui simplemente mostramos los datos de la empresa, estos datos no cambian ni se pueden agregar mas a menos que se modifique el sistema
        System.out.println("Nombre de la empresa: ITERA mexico");
        System.out.println("Telefono: 222-333-568");
        System.out.println("RFC: ITE22374458A0");
    }
}

