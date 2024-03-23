package lib.operaciones;

import java.util.Scanner;

public abstract class Padre {
   protected int valor1, valor2, resultado;
   Scanner entrada = new Scanner(System.in);

   // Este método pide los datos al usuario
   public void giveData(){
      System.out.print("Digite el primer valor: ");
      this.valor1 = entrada.nextInt();
      System.out.print("Digite el segundo valor: ");
      this.valor2 = entrada.nextInt();
   }

   // Este método muestra los datos
   public void showData(){
      System.out.println("El primer valor es: " + this.valor1);
      System.out.println("El segundo valor es: " + this.valor2);
   }

   // Polimorfismo, solo permite declararlo
   public abstract void Operaciones();

   public void Saludar(){
      System.out.println("Hola desde el Padre");
   }
}