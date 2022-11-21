package ejercicio;

import java.util.ArrayList;
import java.util.List;

public interface CocheCRUD {
     List<Coche> coche = new ArrayList<>();

     void save(Coche coche);

     List<Coche>findAll();


}
