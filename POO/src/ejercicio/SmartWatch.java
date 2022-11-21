package ejercicio;

public class SmartWatch extends SmartDevice{
    protected boolean medidorOxigeno;

    protected boolean contadorPasos;

    public SmartWatch() {

    }

    public SmartWatch(String marca, String modelo, double precio, double tamanioPnatalla, boolean medidorOxigeno, boolean contadorPasos) {
        super(marca, modelo, precio, tamanioPnatalla);
        this.medidorOxigeno = medidorOxigeno;
        this.contadorPasos = contadorPasos;
    }
}
