package com.company;

public class Funciones {
    public static void main(String[] args) {
        holaMundo();
        holaMundo("Jesus");
        String hola = devolverHola();
        System.out.println(hola);
        int res = sum(5,5);
        System.out.println(res);
    }

    //Función sin parámetros de entrada
    //Funcion con modificador "protected" el cual deja disponible la función solo para funciones del mismo paquete "com.company"
    protected static void holaMundo() {
        System.out.println("Hola Mundo");
    }

    //Función con parámetros de entrada
    public static void holaMundo(String nombre) {
        System.out.println("Hola " + nombre);
    }

    //Función con return
    private static String devolverHola(){
        return "Devolviendo Hola Mundo";
    }

    private static int sum(int num1, int num2){
        return num1+ num2;
    }

}