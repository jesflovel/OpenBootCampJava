package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {
    public static void main(String[] args) {
        //Clases y objetos

        //Clase identificador = new Clase();

        //Crear un objeto utilizando un constructor vacío
        Vehiculo toyotaPrius = new Vehiculo();

        //Crear un objeto utilizando el constructor con parametros
        Motor motorGTI = new Motor("GTI", 190, 459.0,6);
        Vehiculo fordMondeo = new Vehiculo("ford", "Mondeo", 2.1, 2010, false,0,motorGTI);
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed);
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed);

        //Herencia
        Motocicleta kawasakiNinja = new Motocicleta();
        kawasakiNinja.fabricante = "Kawasaki";
        System.out.println("Fin del programa");

        //Polimorfismo
        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(50);

        vehiculo = new Coche();
        vehiculo.acelerar(50);

        vehiculo = new Camion();
        vehiculo.acelerar(50);

        //4.Clases abstractas: no se pueden instanciar, solo instancian las clases hijas


    }
}
