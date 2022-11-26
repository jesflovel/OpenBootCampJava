import java.util.HashMap;
import java.util.Map;

public class MainMapas {
    public static void main(String[] args) {
        //Mapas o Array asociativo

        //tipo HashMap
        HashMap<String, Integer> mapa = new HashMap<>();

        //Añadiendo valor aun mapa
        //clave "clave" - valor 10
        mapa.put("clave1", 10);
        mapa.put("clave2", 20);
        mapa.put("clave3", 30);

        //Imprimiedo mapa
        System.out.println(mapa);

        //Imprimiendo una clave en especifico
        System.out.println(mapa.get("clave1"));

        //Removiendo una clave
        mapa.remove("clave2");
        System.out.println(mapa);

        //Recorriendo un map entero
        for(Map.Entry elemento : mapa.entrySet()){
            //Imprimiendo clave del mapa
            System.out.println("Elemento clave es: " + elemento.getKey());
            //Imprimiendo valor del mapa
            System.out.println("Elemento valor es: " + elemento.getValue());
        }
    }
}
