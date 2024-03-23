package lib.operaciones;

public class Hijo_Suma extends Padre {
   public void Sumar(){
      resultado = valor1 + valor2;
      System.out.println("El resultado de la suma es: " + resultado);
   }

   @Override
   public void Operaciones() {
      System.out.println("Suma finalizada");
   }

   public void Saludar(){
      // Se ejecutará el método Saludar de la clase Padre
      super.Saludar();
   }
}
