package com.company;

public class CocheHibrido extends Coche{
    String motorHibrido;

    public void CocheHibrido(){

    }
    public void CocheHibrido(String motorHibrido) {
        this.motorHibrido = motorHibrido;
    }

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "motorHibrido='" + motorHibrido + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
