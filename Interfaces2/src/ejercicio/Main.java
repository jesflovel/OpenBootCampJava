package ejercicio;

import java.util.List;

public class Main {
    static CocheCRUD cocheCRUD;

    public static void main(String[] args) {
       cocheCRUD.findAll();
       cocheCRUD.save(new Coche());

    }
}
