import java.util.ArrayList;
public class MainArrayList {
    public static void main(String[] args) {
        //Capacidad de ArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5)
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("ElementoA");
        lista.add( "ElementoB");
        lista.add( "ElementoC");

        System.out.println("contenido" + lista);
        //Recorriendo ArrayList con forEach
        for (String elemento: lista) {
            System.out.println("Elemento: " + elemento);
        }

        //Recorriendo ArrayList con for clasico
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        //Conviertiendo un tipo de dato en otro tipo de dato
        String array[] = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }


    }
}
