import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        /**
         * La capacidad inicial es el tamaño del vector que tendra cuando sea inicializado
         * La capacidad de incremento es el numero de espacios con los que se actualizara el vector si su capacidad inicial es rebasada
         */
        Vector<Integer> vector = new Vector(1, 15);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);

        System.out.println(vector);
        System.out.println("Vector tamaño: " + vector.size() + "capacidad: " + vector.capacity());

        Vector<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2);

        //Comparando vectores
        boolean resultado = vector.equals(vector2);
        System.out.println(resultado);

        //Recorriendo un vector con forEach
        for (int i : vector){
            System.out.println("Valor actual del vector: " + i);
        }

        //Recorriendo un vector con for clasico
        for (int i = 0; i < vector.size() -1; i++){
            if( i % 2 == 0){
                vector.remove(i);
                continue;
            }
            System.out.println("Valor actual del vector: " + vector.get(i) + " en posicion: " + i);

        }

        //Decreciendo el tamñano de un vector
        //Ajusta la capacidad del vector al mismo numero de su tamaño
        vector.trimToSize();




    }
}
