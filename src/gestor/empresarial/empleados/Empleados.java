package gestor.empresarial.empleados;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.errores.GestionErrores;
import gestor.empresarial.empresa.Empresa;

//modificar diagrama
//Práctica 9. Gestor Empresarial (Empleado)
public final class Empleados implements iEmpleados {
    public GestionErrores error;
    private DatosEmpresariales[] DatosPersonas;
    private int i;
    private Contrato[] Contratos;
    private int j;

    public Empleados() {
        DatosPersonas = new DatosEmpresariales[100];
        Contratos = new Contrato[100];
        this.i = 0;
        this.j = 0;
        error = new GestionErrores();
    }


    public void addDatosPersonales( String nombre, String apellidos, String correo,String whatsapp) {

        if (i < 100) {
            DatosPersonas[i] = new DatosEmpresariales();
            DatosPersonas[i].setId(i+1);
            DatosPersonas[i].setNombre(nombre);
            DatosPersonas[i].setApellidos(apellidos);
            DatosPersonas[i].setCorreo(correo);
            DatosPersonas[i].setWhatsapp(whatsapp);
            this.i++;
            System.out.println("Datos personales agregados");
        } else {
            error.getError(2);
        }
    }
    public int getId(){
        return this.i;
    }
    public void showDatosPersonales(){
        for(int k=0; k<i; k++){
            System.out.println(DatosPersonas[k].getId()+" "+DatosPersonas[k].getNombre()+" "+DatosPersonas[k].getApellidos()+" "+DatosPersonas[k].getCorreo()+" "+DatosPersonas[k].getWhatsapp());
        }
    }

        //PRUEBA
    public void addDatosEmpresariales(int Id, String Adscripcion, String TelefonoExterior, String Puesto) {
        if (Id >=0 && Id <=this.i) {

            DatosPersonas[Id].setAdscripcion(Adscripcion);
            DatosPersonas[Id].setTelefonoExterior(TelefonoExterior);
            DatosPersonas[Id].setPuesto(Puesto);

            System.out.println("Datos Empresariales agregados");
        } else {
            error.getError(2);
        }
    }

    public void showDatosEmpleado() {
        for (int k = 0; k<i; k++) {
            System.out.println(
                    DatosPersonas[k].getId()+" "+DatosPersonas[k].getNombre()+" "+DatosPersonas[k].getApellidos()+" "+DatosPersonas[k].getCorreo() +" "+DatosPersonas[k].getWhatsapp()+" "
                            + DatosPersonas[k].getAdscripcion()+" "+DatosPersonas[k].getTelefonoExterior()+" "+DatosPersonas[k].getPuesto());
        }
    }

    public void addContrato(int id, int noContrato, int annio, String horario, Cargos tipoCargo) {
        Contratos[j] = new Contrato(id);
        if (this.j < 100) {//mejorar validasion
            Contratos[j].setNoContrato(noContrato);
            Contratos[j].setAnnio(annio);
            Contratos[j].setHorario(horario);
            Contratos[j].setTipoCargo(tipoCargo);
            this.j++;
            System.out.println("Datos del contrato agregados");
        } else {
            error.getError(1);
        }
    }

    public void showContratosEmpleado(int b) {
        for (int k = 0; k<j; k++) { /*linea agregada con int*/
            if (Contratos[k] != null) {
                System.out.println(Contratos[k].getNoContrato() + " " + Contratos[k].getAnnio() + " " + Contratos[k].getHorario() + " " + Contratos[k].getTipoCargo()+" "+
                        DatosPersonas[k].getId());
            }
        }
    }
    public void showEmpresa(){
        System.out.println("Nombre de la empresa: ITERA mexico");
        System.out.println("Telefono: 222-333-568");
        System.out.println("RFC: ITE22374458A0");
    }
    }

