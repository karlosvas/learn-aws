import java.util.Scanner;

public class Reverse {
   public static void main(String[] args) {
      // Para recivir datos desde teclado es necesario el objeto Scanner
      String message = "", reverseString = "";
      Scanner input = new Scanner(System.in);

      // El usuario ingresa un mensaje
      System.out.print("Ingrese un mensaje: ");
      message = input.nextLine();

      // Guardamos la longitud del mensaje
      int long_mes = message.length();

      // Recorrido del mensaje de forma inversa
      while (long_mes != 0) {
         reverseString += message.substring(long_mes - 1, long_mes);
         long_mes--;
      }

      // Cerramos el objeto Scanner
      input.close();

      // Mostramos el mensaje invertido y lo devolvemos a su estado original
      System.out.println(reverseString);
      String originalString = "";
      long_mes = message.length();

      for (int i = long_mes - 1; i >= 0; i--) {
         originalString += reverseString.charAt(i);
      }

      System.out.println(originalString);

   }
}