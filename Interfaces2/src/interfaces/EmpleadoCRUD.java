package interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    private List<Empleado> empleados = new ArrayList<Empleado>();
    //Metodo que guarda un empleado - CREATE
    public void save(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }


}
