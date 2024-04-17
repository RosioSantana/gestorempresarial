package gestor.empresarial.empleados;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.DatosEmpresariales;
import gestor.empresarial.datos.DatosPersonales;
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


    public void addDatosPersonales(int id, String nombre, String apellidos, String correo) { /*duda porque no puedo instanciar para hacer el add*/
        if (i < 100) {
            DatosPersonas[i] = new DatosEmpresariales((i), nombre, apellidos, correo);
            i++;
            System.out.println("Datos personales agregados");
        } else {
            System.out.println("No se pueden agregar más postulantes");
        }
    }
        //PRUEBA
    public void addDatosEmpresariales(int Id, String Adscripcion, String TelefonoExterior, String Puesto) { /*duda porque no puedo instanciar para hacer el add*/
        if (i < 100) {
            DatosPersonas[i] = new DatosEmpresariales((i),Adscripcion, TelefonoExterior, Puesto);
            i++;
            System.out.println("Datos Empresariales agregados");
        } else {
            System.out.println("No se pueden agregar más postulantes");
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

    private int findEmpleado(int find1) {/*buscabdo en datos personales por id*/
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

    public void setAdscripcion(int id, String ads) {
        int i = findEmpleado(id);
        if (i > -1) {
            DatosPersonas[i].setAdscripcion(ads); /*public*/
        }
        error.getError(8);
        //System.out.println("No se puede registrar la adscripcion");
    }

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

    public void showDatosEmpleado() {
        for (int j = 0; i < 100; j++) { /*linea agregada con string*/
            System.out.println(getInfoEmpleado(j));
        }

    }

    public void showContratosEmpleado(int ce) {
        for (int j = 0; i < 100; j++) { /*linea agregada con int*/
            System.out.println(getInfoEmpleado(j));
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
