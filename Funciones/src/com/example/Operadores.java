public class Operadores {
    public static void main(String[] args) {
        //Operadores aritmeticos
        int numero1= 10;
        int numero2= 20;
        int resultadoSuma = numero1 + numero2;
        System.out.println(numero1 + numero2);
        System.out.println(resultadoSuma);

        /*
        Operadores de comparación
        > Mayor que
        < Menor que
        >= Mayor o igual que
        <= Menor o igual que
        == Igual que
         */

        boolean resultado1 = numero1 > numero2; //false
        System.out.println(resultado1);
        boolean resultado2 = numero1 < numero2;
        System.out.println(resultado2);

        /*
        Operadores lógicos
        and &&
        or ||
         */

        boolean resultado3 = numero1 > 5 && numero1 < 30;
        int edad = 17;
        boolean carnerJoven = edad >= 15 && edad <= 27;



    }
}