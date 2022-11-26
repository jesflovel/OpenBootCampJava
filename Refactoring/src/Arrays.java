public class Arrays {
    public static void main(String[] args) {
        int array1[] ={1,2,3,4,5};
        String nombres[] = {"Pepe","Juan","Francisco"};

        for(int i : array1) {
            System.out.println(i);
        }

        //Imprimiendo los datos del array mediante forEach
        for(String i : nombres) {
            System.out.println("Nombre actual es: " + i);
        }

        //Imprimiendo los datos del array mediante for clasico
        for (int i = 0;i < nombres.length; i++){
            System.out.println("Nombre actual es: " + nombres[i] + "en posicion del array: " + i);
        }

        //Declarando array bidimensional de 2 filas por 4 columnas
        int arrayBidimensional[][] = {{1,2,3,4}, {10,20,30,40}};

        for(int i=0 ; i<arrayBidimensional.length;i++){
            System.out.print(i);
            for(int j = 0; j<arrayBidimensional[i].length;j++){
                System.out.print(j);
            }
        }
    }
}
