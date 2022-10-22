package com.example;

public class Funciones {
    public static void main(String[] args) {
        //Opcion 1: Funciones sin parámetros ni tipos de retornos
        showMenu();

        //Opcion 2: Funcion sin parámetros y con tipos de retorno
        String menu = getMenu();
        System.out.println(menu);
        System.out.println(getMenu());

        double price = getPrice();

        //Opcion 3: Funcion con parametros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootcamp");

        //Opcion 4: Funcion con parametros y con tipo de retorno
        String saludo = obtenerSaludo("Jesus", "Flores");
        System.out.println(saludo);

        int resultadoSuma = suma(50, 200);
        System.out.println(resultadoSuma);


    //Como se crea una funcion

    }
    /*
    La palabra void indica que no devolvera ningun valor
     */
    static void showMenu(){
        System.out.println("Bienvenido al E-commerce de zapatillas");
        System.out.println("1.- Ver zapatillas");
        System.out.println("2.- Comprar zapatillas");
        System.out.println("3.- Salir");
    }

    static String getMenu(){
        return "Bienvenido al E-commerce de zapatillas";
    }

    static double getPrice(){
        return 100.99;
    }

    static void imprimirSaludoBuenosDias(String nombre){
        System.out.println("Buenas tardes" + nombre);
    }

    static String obtenerSaludo(String nombre, String apellido){
        return "Nuenas tardes " + nombre + apellido;
    }

    static int suma(int numero1, int numero2){
        return numero1 + numero2;
    }
}
