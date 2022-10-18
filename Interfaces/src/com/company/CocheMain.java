package com.company;

public class CocheMain {
    public static void main(String[] args) {
        /*
        Una clase abstracta es una clase común que posee atributos y métodos, y tiene como mínimo un método abstracto,
         además puede contener métodos normales. Esta clase no puede ser instanciada, solo puede heredarse, o sea
         no se puede usar para crear un objeto.
         */
        String coche ="alfa romeo";
        //Coche cocheObj = new Coche();

       /* Coche cocheObj2 = new Coche("Azul", "Nissan", "GT-R");
        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);
        cocheObj2.velocidad=60;
        System.out.println(cocheObj2);
        */


        CocheElectrico cocheElectricoObj = new CocheElectrico();
        cocheElectricoObj.acelerar(100);
        cocheElectricoObj.motorElectrico = "1000KW";
        cocheElectricoObj.color = "Rojo";
        cocheElectricoObj.marca = "Tesla";
        cocheElectricoObj.modelo = "T200";
        System.out.println(cocheElectricoObj);

        CocheHibrido cocheHibridoObj = new CocheHibrido();
        cocheHibridoObj.acelerar(110);
        cocheHibridoObj.color = "Verde";
        cocheHibridoObj.marca = "Toyota";
        cocheHibridoObj.modelo = "Corolla";
        cocheHibridoObj.motorHibrido = "HIbrid 3000";
        System.out.println(cocheHibridoObj);

        CocheElectrico cocheElecricoObj2 = new CocheElectrico("Azul","Alfa","T1000","TXZ");
        System.out.println(cocheElecricoObj2);

        cocheElecricoObj2.acelerar(55);
        System.out.println(cocheElecricoObj2);
    }
}
