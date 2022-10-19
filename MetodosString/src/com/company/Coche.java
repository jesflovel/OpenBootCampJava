package com.company;

public class Coche {
    String nombre = "Lambo";

    public Coche(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
