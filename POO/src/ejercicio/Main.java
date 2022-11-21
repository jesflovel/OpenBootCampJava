package ejercicio;

public class Main {

    public static void main(String[] args) {
        //Creando objetos con constructores vacios
        SmartDevice galaxyS20 = new SmartDevice();

        SmartDevice Watch2 = new SmartDevice();

        //Creando objeros con constructores con parametros
        SmartDevice galaxyS22Ultra = new SmartDevice("Samsung","S22Ultra",30.000,7);
        SmartDevice watch2GTPro = new SmartDevice("Amazon","Watch2GTPro",8.000,2.5);
        System.out.println(galaxyS22Ultra.marca);
        System.out.println(galaxyS22Ultra.modelo);
        System.out.println(galaxyS22Ultra.precio);

        System.out.println(watch2GTPro.marca);
        System.out.println(watch2GTPro.modelo);
        System.out.println(watch2GTPro.precio);
    }

}
