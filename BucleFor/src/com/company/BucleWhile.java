package com.company;

public class BucleWhile {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10){
            count ++; //Condicion que finaliza el loop
            if (count == 6)
                break; //Rompe el flujo de ejecicion
                //continue; //Salta el valor 6 y continua a la siguiente iteracion
            System.out.println("Hola Mundo " + count);
        }
        System.out.println("Fin");
    }
}
