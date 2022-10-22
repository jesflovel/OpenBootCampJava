package com.example;

public class EjercicioFunciones {
    public static void main(String[] args) {
        double precio;
        double resultado = precioIva(12.50);
        System.out.println(resultado);
    }

    public static double precioIva(double precio){
        double IVA = 0.16;
        return precio += precio * IVA;
    }
}
