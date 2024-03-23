package src.herencia;

import java.util.Scanner;
import lib.operaciones.Hijo_Resta;
import lib.operaciones.Hijo_Suma;

public class Main {
   public static void main(String[] args){
      // Pedimos los datos al usuario
      Hijo_Suma suma = new Hijo_Suma();
      suma.giveData();
      suma.Sumar();
      // Polymorphism
      suma.Operaciones();

      Hijo_Resta resta = new Hijo_Resta();
      resta.giveData();
      resta.Restar();
      // Polymorphism
      resta.Operaciones();
   }
}
