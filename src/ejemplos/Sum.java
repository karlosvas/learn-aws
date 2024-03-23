package src.ejemplos;
import java.util.Scanner;

public class Sum {
   public static void main(int[] args){
      // Inicializamos las variables de los números.
      int num1, num2;

      // Creamos el objeto scanner.
      Scanner input = new Scanner(System.in);

      System.out.println("Dame el primer valor: ");
      num1 = input.nextInt();

      System.out.println("Dame el  segundo valor: ");
      num2 = input.nextInt();

      input.close();
      
      // Imprimimos le resultado
      System.out.println(num1 + num2);
   }
}
