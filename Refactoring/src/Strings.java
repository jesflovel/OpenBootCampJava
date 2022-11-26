public class Strings {
    public static void main(String[] args) {
        var cadena = "Hola mundo";
        int numeroLetras = cadena.length();
        System.out.println(numeroLetras);
        String mayusculas = cadena.toUpperCase();
        System.out.println(mayusculas);
        boolean resultado = cadena.startsWith("H");
        if(resultado){
            System.out.println("Empieza por lo que estoy buscando");
        }else {
            System.out.println("No empieza con la letra que estoy buscando");
        }

        char letra = cadena.charAt(3);
        System.out.println(letra);
        for(int i = 0; i<cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
    }
}
