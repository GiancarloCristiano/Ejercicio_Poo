public class Programador extends Empleado{
    private LenguajeProgramacion lenguajeProgramacion;

    public Programador(int id, String nombre, String apellido, int edad, LenguajeProgramacion lenguajeProgramacion) {
        super(id, nombre, apellido, edad);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ". ID: " + id + ". Edad: " + edad + ". Tipo: Programador " + lenguajeProgramacion.getValor() + ". \n";
    }
}