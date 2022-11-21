package ejercicio;

public class Coche {
    //1.Atributos
    String nombre;
    String modelo;
    int mumeroPueras;

    //2.Constructores
    public Coche(){

    }

    public Coche(String nombre, String modelo, int mumeroPueras) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.mumeroPueras = mumeroPueras;
    }

    //3.Metodos

    @Override
    public String toString() {
        return "Coche{" +
                "nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", mumeroPueras=" + mumeroPueras +
                '}';
    }
}
