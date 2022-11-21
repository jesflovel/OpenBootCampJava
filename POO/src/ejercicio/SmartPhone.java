package ejercicio;

public class SmartPhone extends SmartDevice{
    protected int megapixeles;

    public SmartPhone(){

    }

    public SmartPhone(String marca, String modelo, double precio, double tamanioPnatalla, int megapixeles) {
        super(marca, modelo, precio, tamanioPnatalla);
        this.megapixeles = megapixeles;
    }
}


