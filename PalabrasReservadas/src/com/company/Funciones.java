package com.company;

public class Funciones {
    public static void main(String[] args) {
        holaMundo();
        holaMundo("Jesus");
        String hola = devolverHola();
        System.out.println(hola);
        int res = sum(5,5);
        System.out.println(res);
        holaMundo("Jesus", "Flores");
        holaMundo("Jesus", "Flores", "Velasco");
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
    //Sobre carga de funciones
    //La sobrecarga de funciones o funciones sobrecargadas son funciones o metodos que se duplica su nombre y se diferencian en que aunque tienen
    //el mismo nombre, sus argumentos o parámetros de entrada son distintos entre sí
    /*
    NOTA: Para hacer una correcta sobrecarga de funciones, es necesario que la funcion que se va a sobrecargar, no tenga exactamente los mismos parametros
    o argumentos en más de una funcion
     */
    public static void holaMundo(String nombre, String apellidoMaterno) {
        System.out.println("Hola " + nombre + apellidoMaterno);
    }
    public static void holaMundo(String nombre, String apellidoMaterno, String apellidoPaterno) {
        System.out.println("Hola " + nombre + apellidoMaterno + apellidoPaterno);
    }

}