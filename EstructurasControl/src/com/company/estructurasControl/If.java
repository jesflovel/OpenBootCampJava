package com.company.estructurasControl;

public class If {
    public static void main(String[] args) {
        int edad = 17;
        boolean esMayor = edad >= 18;
        if(esMayor){
            System.out.println("Es mayot de edad");
        }

        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("No es mayor de edad");
        }

    }

}