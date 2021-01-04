/** Si bien Empresa y Empleado comparten dos atributos,
 *  se eligio tener solo un nivel de herencia:
 *  de empleado hacia sus tipos posibles:
 *  programador o diseniador*/

public class Main {
    public static void main(String[] args) {
        Empresa summa = new Empresa(1, "Summa Solutions");
        Empleado lucianoSantos = new Programador(232, "Luciano", "Santos", 28, LenguajeProgramacion.PHP);
        Empleado javierRomero = new Programador(57, "Javier", "Romero", 35, LenguajeProgramacion.PHP);
        Empleado facundoCapua = new Programador(72, "Facundo", "Capua", 34, LenguajeProgramacion.PHP);
        Empleado giancarloCristiano = new Diseniador(580, "Giancarlo", "Cristiano", 30, TipoDiseniador.GRAFICO);
        int idBusqueda = 57;
        summa.addEmpleado(lucianoSantos);
        summa.addEmpleado(javierRomero);
        summa.addEmpleado(facundoCapua);
        summa.addEmpleado(giancarloCristiano);

        System.out.println("Listado de todos los empleados:");
        System.out.println(summa.getEmpleados());

        System.out.println("\nBúsqueda de empleado por el ID " + idBusqueda);
        System.out.println(summa.buscarEmpleadoId(idBusqueda));

        System.out.println("Promedio de edad de todos los empleados:");
        System.out.println(summa.getPromedioEdad());

    }
}
