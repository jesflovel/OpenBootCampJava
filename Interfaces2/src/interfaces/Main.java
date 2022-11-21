package interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado juanito = new Empleado("Juanito",30,40000,true);
        Empleado pedrito = new Empleado("Pedrito",27,30000,true);
        Empleado pablito = new Empleado("Pablito",29,35000,false);


        empleadoCRUD.save(juanito);
        empleadoCRUD.save(pedrito);
        empleadoCRUD.save(pablito);

        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);

    }
}