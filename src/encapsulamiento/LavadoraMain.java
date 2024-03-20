package src.encapsulamiento;
import java.util.Scanner;

import lib.Lavadora;

public class LavadoraMain {
   public static void main(String[] args){
      int kilos, typeRopa;
      Scanner scan = new Scanner(System.in);

      System.out.print("Cuantos KG de ropa queres añadir: ");
      kilos = scan.nextInt();
      System.out.print("Que tipo de ropa es, 1 save, 2 intenso: ");
      typeRopa = scan.nextInt();

      Lavadora SamsumgLavadora = new Lavadora(kilos, typeRopa);
      SamsumgLavadora.CicleFinalizado();

   }
}
