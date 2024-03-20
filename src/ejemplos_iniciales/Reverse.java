package src.ejemplos_iniciales;
import java.util.Scanner;

public class Reverse {
   public static void main(String[] args) {
      // Para recivir datos desde teclado es necesario el objeto Scanner
      String message = "";
      Scanner input = new Scanner(System.in);

      // El usuario ingresa un mensaje
      System.out.print("Ingrese un mensaje: ");
      message = input.nextLine();

      // Cerramos el objeto Scanner
      input.close();

      // Mostramos el mensaje invertido y lo devolvemos a su estado original
      String reverseString = reverse(message);
      System.out.println(reverseString);
      String originalString = reverse(reverseString);
      System.out.println(originalString);
   }

   public static String reverse(String message) {
      String reverseString = "";
      int long_mes = message.length();

      // Recorrido del mensaje de forma inversa
      while (long_mes != 0) {
         reverseString += message.substring(long_mes - 1, long_mes);
         long_mes--;
      }

      return reverseString;
   }
}