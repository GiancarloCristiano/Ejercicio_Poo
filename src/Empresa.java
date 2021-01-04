import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private int id;
    private String nombre;
    private List<Empleado> empleados;

    public Empresa(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.empleados = new ArrayList<Empleado>();
    }

    public void addEmpleado(Empleado e){
        this.empleados.add(e);
    }

    public ArrayList<Empleado> getEmpleados() {
        return new ArrayList<Empleado>(empleados);
        //Retorno una copia por seguridad. Si quiero retornar la lista original es simplemente 'return this.empleados'.
    }

    public Empleado buscarEmpleadoId(int id){
        Empleado empleado = null;
        for (Empleado e: this.empleados) {
            if (e.getId() == id)
                empleado = e;
        }
        return empleado;
    }

    public double getPromedioEdad(){
        double contador = 0;
        for (Empleado e: this.empleados) {
            contador += e.getEdad();
        }
        if (empleados.size() != 0)
            return contador / empleados.size();
        return 0;
    }

}