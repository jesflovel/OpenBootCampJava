package com.company;

public class Coche {
        //atributos p.e.
        String color;
        String marca;
        String modelo;
        Integer velocidad = 0;





        //constructores permiten crear objetos de una clase

    public Coche(){

    }
        public Coche(String color, String marca, String modelo){
            this.color = color;
            this.marca = marca;
            this.modelo = modelo;
        }

        //comportamiento p.e. acelerar, frenar, girar

        public void acelerar(Integer cantidad){
            if(cantidad > 0 && cantidad <= 120)
            this.velocidad += cantidad;
        }

        public void frenar(Integer cantidad){
            if(cantidad < 0 && cantidad <= 120)
            this.velocidad -= cantidad;
        }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
