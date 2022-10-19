package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Jesus");
        nombres.add("Yare");
        nombres.add("Luis");
        nombres.add("Anna");

        System.out.println(nombres);
        //For: tipo_dato nombre : variable que se va a recorrer
        for(String nombre : nombres){
            System.out.println(nombre);
        }

        List<Coche> coches = new ArrayList<>();
        coches.add(new Coche("Murcielago"));
        coches.add(new Coche("LaFerrari"));
        coches.add(new Coche("Carrera911"));
        System.out.println(coches);
        for(Coche coche : coches){
            System.out.println(coche);
        }
    }
}
