package com.company.estructurasControl;

public class IfElseIf {
    public static void main(String[] args) {
        String dia = "Martes";


        //Ejemplos comparar
        boolean resultadoCompararNum = 5==5;
        boolean resultado  = dia.equals("Martes");

        // if else if

        if(dia.equals("Lunes")){
            System.out.println("Animi con la semana champions");
        }else if(dia.equals("Martes")){
            System.out.println("Martes con M");
        }
    }
}
