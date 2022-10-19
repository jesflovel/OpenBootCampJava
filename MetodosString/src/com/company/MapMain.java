package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        /**
         * Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
         * Map<Integer, String> nombreMap = new HashMap<Integer, String>();
         * nombreMap.size(); // Devuelve el numero de elementos del Map
         * nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
         * nombreMap.put(K clave, V valor); // Añade un elemento al Map
         * nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
         * nombreMap.clear(); // Borra todos los componentes del Map
         * nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
         * nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
         * nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
         * nombreMap.values(); // Devuelve una "Collection" con los valores del Map
         */
        //Tipo map tipo_clave tipo_valor
        Map<String, String> personas = new HashMap<>();
        personas.put("FOVJ911224HMCLLS01", "Jesus Flores Velasco");
        personas.put("VOJFHF937475JFLS01", "Manuel Garcia Bernal");
        personas.put("FOODF0384JDFKDKH93", "Mario Lopez Gonzalez");

        System.out.println(personas);

        //Imprimiendo la clave
        for(String key : personas.keySet()){
            System.out.println(key);
        }

        //Imprimiendo el valor
        for (String value : personas.values()){
            System.out.println(value);
        }

        //Impimiendo clave y valor
        for (Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
