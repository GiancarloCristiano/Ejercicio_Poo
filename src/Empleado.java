public class Empleado extends Empresa {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Empleado(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

}