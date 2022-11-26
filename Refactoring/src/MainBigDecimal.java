import java.math.BigDecimal;

public class MainBigDecimal {
    public static void main(String[] args) {
        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(4f);

        //Suma el BigDecimal "valorB" a "valorA"
        BigDecimal resultado = valorA.add(valorB);

        System.out.println(resultado);
    }
}
