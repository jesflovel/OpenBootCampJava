package com.company.bucles;

public class ejercicio {
    public static void main(String[] args) {
        String[] nombres = {"Jesus", "Flores", "Velasco"};
        String textoConcatenado= "";
        for(int i =0;i<nombres.length;i++){
            textoConcatenado += nombres[i];
        }
        System.out.println(textoConcatenado);
    }
}
