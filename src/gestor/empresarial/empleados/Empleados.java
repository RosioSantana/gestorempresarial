package gestor.empresarial.empleados;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.errores.GestionErrores;

//modificar diagrama
//Práctica 9. Gestor Empresarial (Empleado)
public final class Empleados implements iEmpleados {
    public GestionErrores error;
    private DatosEmpresariales[] DatosPersonas;
    private int i;
    private Contrato[] Contratos;
    private int j;

    public Empleados() {//constructor
        DatosPersonas = new DatosEmpresariales[100];
        Contratos = new Contrato[100];
        i = 0;
        j = 0;
        error = new GestionErrores();
    }


    public void addDatosPersonales( String nombre, String apellidos, String correo) { /*duda porque no puedo instanciar para hacer el add*/

        if (i < 100) {//mejorar validacion  id >=0 && id <=j ------------------------------------------------------------
            DatosPersonas[i] = new DatosEmpresariales();
            DatosPersonas[i].setId(i+1);
            DatosPersonas[i].setNombre(nombre);
            DatosPersonas[i].setApellidos(apellidos);
            DatosPersonas[i].setCorreo(correo);
            this.i++;
            System.out.println("Datos empresariales agregados");
        } else {
            error.getError(5);
        }
    }
    public int getId(){
        return this.i;
    }
    public void showDatosPersonales(){
        for(int k=0; k<i; k++){
            System.out.println(DatosPersonas[k].getId()+" "+DatosPersonas[k].getNombre()+" "+DatosPersonas[k].getApellidos()+" "+DatosPersonas[k].getCorreo());
        }
    }

        //PRUEBA
    public void addDatosEmpresariales(int Id, String Adscripcion, String TelefonoExterior, String Puesto) { /*duda porque no puedo instanciar para hacer el add*/
        if (Id >=0 && Id <=this.i) {

            DatosPersonas[Id].setAdscripcion(Adscripcion);
            DatosPersonas[Id].setTelefonoExterior(TelefonoExterior);
            DatosPersonas[Id].setPuesto(Puesto);

            System.out.println("Datos Empresariales agregados");
        } else {
            System.out.println("No se pueden agregar más postulantes");
        }
    }

    public void showDatosEmpleado() {

        for (int k = 0; k<i; k++) { /*linea agregada con string*/
            System.out.println(
                    DatosPersonas[k].getId()+" "+DatosPersonas[k].getNombre()+" "+DatosPersonas[k].getApellidos()+" "+DatosPersonas[k].getCorreo() +" "
                            + DatosPersonas[k].getAdscripcion()+" "+DatosPersonas[k].getTelefonoExterior()+" "+DatosPersonas[k].getPuesto());
        }
    }


    public void addContrato(int id, int noContrato, int annio, String horario, Cargos tipoCargo) {
        Contratos[j] = new Contrato(id);
        if (j < 100) {//mejorar validasion
            Contratos[j].setNoContrato(noContrato);
            Contratos[j].setAnnio(annio);
            Contratos[j].setHorario(horario);
            Contratos[j].setTipoCargo(tipoCargo);
            this.j++;
            System.out.println("Datos del contrato agregados");
        } else {
            error.getError(5);
            //return GestionErrores.getError(5);
        }
    }

    public int findEmpleado(int find1) {/*buscabdo en datos personales por id*/
        int busqueda = -1;

        for (int j = 0; j < i; j++) {
            if (DatosPersonas[j].getId() == find1)/*id*/
                busqueda = j;
        }
        return busqueda;
    }

    private int findEmpleado(String find2) {/*nombre*/
        int busqueda = -1;

        for (int j = 0; j < this.i; j++) {
            if (DatosPersonas[j].getNombre().equals(find2))
                busqueda = j;
        }
        return busqueda;
    }

    public void setWhatsApp(int id, String persona) {
        int i = findEmpleado(id);
        if (i > -1) {
            DatosPersonas[i].setWhatsapp(persona);
        }
        System.out.println("No se encuentra el empleado");
    }

    private String datosPersonales(int dp) {
        String info = "";
        if (i > -1) {
            info += "ID: " + DatosPersonas[i].getId() + "\n";
            info += "Nombres: " + DatosPersonas[i].getNombre() + "\n";
            info += "Apellidos: " + DatosPersonas[i].getApellidos() + "\n";
            info += "Correo: " + DatosPersonas[i].getCorreo() + "\n";
            info += "Whatsapp: " + (this.DatosPersonas[i].getWhatsapp() != null ? this.DatosPersonas[i].getWhatsapp() : "Vacio") + "\n";
            info += "Adscripción: " + (this.DatosPersonas[i].getAdscripcion() != null ? this.DatosPersonas[i].getAdscripcion() : "Vacio") + "\n";
            info += "Puesto: " + (this.DatosPersonas[i].getPuesto() != null ? this.DatosPersonas[i].getPuesto() : "Vacio") + "\n";
            info += "Tipo de Puesto: " + (this.Contratos[i].getTipoCargo() != null ? this.Contratos[0].getTipoCargo() : "Vacio") + "\n";
        }
        else{
            error.getError(5);}
        return info;
    }

    @Override
    public String getInfoEmpleado(int empleado) {
        int i = findEmpleado(empleado);

        if (i < 0) {
            return error.getError(6);
            //System.out.println("No se pudo encontrar por id - numero");
        } else
            return datosPersonales(i);
    }

    public String getInfoEmpleado(String empleado) {
        int i = findEmpleado(empleado);

        if (i < 0) {
            return error.getError(7);
            //System.out.println("No se pudo encontrar por nombre");
        } else
            return datosPersonales(i);
    }

  /*  public void setAdscripcion() {
        int i = findEmpleado(id);
        if (i > -1) {
            DatosPersonas[i].setAdscripcion(); /*public
        }
        error.getError(8);
        //System.out.println("No se puede registrar la adscripcion");
    }*/

    public void setTelefonoExtension(int id, String num) {
        int i = findEmpleado(id);
        if (i > -1) {
            DatosPersonas[i].setTelefonoExterior(num); /*public*/
        }
        error.getError(9);
        //System.out.println("No se puede registar el numero");
    }

    public void setPuesto(int id, String puest) {
        int i = findEmpleado(id);
        if (i > -1) {
            DatosPersonas[i].setPuesto(puest); /*public*/
        }
        error.getError(10);
        //System.out.println("No se puede registar el puesto");
    }



    public void showContratosEmpleado(int b) {
        for (int k = 0; k<j; k++) { /*linea agregada con int*/
            System.out.println(Contratos[j].getNoContrato()+".-"+Contratos[j].getAnnio()+".-"+Contratos[j].getHorario()+".-"+Contratos[j].getTipoCargo());
        }
    }

    public void setCargos(int id, Cargos car) {
        int i = findEmpleado(id);
        if (i > -1) {
            Contratos[i].setTipoCargo(car);
        }
        error.getError(11);
        //System.out.println("No se puede colocar el cargo ");
    }
}
