package conInterfaces;

import interfaces.Empleado;

import java.util.List;

/**
 * Se declaran los metodos, no se implementan(usan)
 * Actúa como un contrato. Dice lo que hay que hacer pero no lo hace
 */

public interface EmpleadoCRUD {

    void save(Empleado empleado);
    List<Empleado> findAll();
    void delete(Empleado empleado);

}
