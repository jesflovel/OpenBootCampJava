package com.company;

public class CocheMain {
    public static void main(String[] args) {
        String coche ="alfa romeo";
        Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche("Azul", "Nissan", "GT-R");
        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);
        cocheObj2.velocidad=60;
        System.out.println(cocheObj2);


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
    }
}
