package com.example;

public class Sobrecarga {
    /**
     * Sobre carga de funciones permite duplicar um metodo siempre y cuando no tengan exactamente los mismos parametros
     */
    public static void main(String[] args) {
        int resultado = suma(10,20);
        int resultado2 = suma(1, 2, 3);
        double resultado3 = suma(11.3, 33.12);
        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println(resultado3);

    }

    static double suma(double numero1, double numero2){
        return numero1 + numero2;
    }

    static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    static int suma(int numero1, int numero2, int numero3){
        return numero1 + numero2 + numero3;
    }
}
