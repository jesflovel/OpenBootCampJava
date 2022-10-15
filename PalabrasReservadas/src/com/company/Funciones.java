package com.company;

public class Funciones {
    public static void main(String[] args) {
        holaMundo();
        holaMundo("Jesus");
        String hola = devolverHola();
        System.out.println(hola);
    }

    //Función sin parámetros de entrada
    private static void holaMundo() {
        System.out.println("Hola Mundo");
    }

    //Función con parámetros de entrada
    private static void holaMundo(String nombre) {
        System.out.println("Hola " + nombre);
    }

    //Función con return
    private static String devolverHola(){
        return "Devolviendo Hola Mundo";
    }

}