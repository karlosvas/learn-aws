package src.area;
import java.util.Scanner;

import lib.Rectangulo;

public class RectanguloMain {
   public static void main(String[] args){

      Scanner entrada = new  Scanner(System.in);

      System.out.println("Dame un valor base: ");
      int base = entrada.nextInt();

      System.out.println("Dame un valor altura: ");
      int altura = entrada.nextInt();

      Rectangulo mensajero = new Rectangulo(base, altura);
      mensajero.Imprimir();
      
   }
}
