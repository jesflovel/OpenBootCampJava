package com.company;

public class StringMain {
    public static void main(String[] args) {

        /*Metodos de la clase String
        length() -> Regresa la cantidad  total de caracteres en una cadena de texto contando los espacios en blanco
        startsWith("") -> Determina si la cadena de texto empieza o no con el caracter especificado
         */

        String mensaje = "  Hola mundo  ";
        String mensaje2 = "  Hola mundo ";
        System.out.println("El total de caracteres es: " + mensaje.length());
        System.out.println("El mensaje empieza con la letra h?: " + mensaje.startsWith("J"));
        String mensajeMayus = mensaje.toUpperCase();
        System.out.println(mensajeMayus);
        System.out.println(mensaje.trim().toUpperCase());
        if(mensaje.equals(mensaje2)){
            System.out.println("El mensaje es igual");
        }else{
            System.out.println("El mensaje no es igual");
        }

    }
}