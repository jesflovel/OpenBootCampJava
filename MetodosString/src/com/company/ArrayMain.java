package com.company;

public class ArrayMain {
    public static void main(String[] args) {
        String nombre1 = "Juan";
        String nombre2 = "Pedro";
        String nombre3 = "Paco";

        String[] nombres = new String[3];
        int[] numeros = new int[5];
        Coche[] coches = new Coche[2];

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
