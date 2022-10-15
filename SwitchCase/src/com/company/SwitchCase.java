package com.company;

public class SwitchCase {
    public static void main(String[] args) {
        String weather = "windy";
        switch (weather){
            case "sunny":
                System.out.println("El clima es soleado");
                break;
            case "cloudy":
                System.out.println("El clima es nublado");
                break;
            case "raining":
                System.out.println("El clima es lluvioso");
                break;
            case "windy":
                System.out.println("El clima es ventoso");
                break;
            default:
                System.out.println("El clima es desconocido");
        }
    }
}