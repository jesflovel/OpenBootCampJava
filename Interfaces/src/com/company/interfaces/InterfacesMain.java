package com.company.interfaces;

import com.company.Coche;

public class InterfacesMain {
    public static void main(String[] args) {
        CocheService service = new CocheServiceSportImpl();


        Coche coche = service.crearCocheDemo();

    }
}
