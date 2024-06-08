package src.math.decimales;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        double numero = 2;
        double raiz = Math.sqrt(numero);
        System.out.println("La raiz cuadrada de " + numero + " es: " + raiz);
        
        // Utilizando decimal format
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La raiz cuadrada de " + numero + " es: " + df.format(raiz));

        // Utilizando string format
        System.out.println("La raiz cuadrada de " + numero + " es: " + String.format("%.2f", raiz));

        // Utilizando math round
        System.out.println("La raiz cuadrada de " + numero + " es: " + (double)Math.round(raiz * 10000d) / 10000);

        // Utilizando big decimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(4, RoundingMode.HALF_UP);
        System.out.println("La raiz cuadrada de " + numero + " es: " + bd.doubleValue());
    }
}
