//pongo el nombre con "ni" para evitar problemas de codificacion
public class Diseniador extends Empleado{
    private TipoDiseniador tipoDiseniador;

    public Diseniador(int id, String nombre, String apellido, int edad, TipoDiseniador tipoDiseniador) {
        super(id, nombre, apellido, edad);
        this.tipoDiseniador = tipoDiseniador;
    }


    @Override
    public String toString() {
        return nombre + " " + apellido + ". ID: " + id + ". Edad: " + edad + ". Tipo: Diseñador " + tipoDiseniador.getValor() + ". \n";
    }
}