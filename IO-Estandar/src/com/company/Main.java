package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un nombre");
        String nombre = scanner.nextLine();
        System.out.println("introduce un numero");
        int numero = scanner.nextInt();
        //Salida estandar (Output)
        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("El numero introducido es: " + numero);
    }
}