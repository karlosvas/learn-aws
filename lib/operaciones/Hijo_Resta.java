package lib.operaciones;

public class Hijo_Resta extends Padre{
    public void Restar(){
      resultado = valor1 - valor2;
      System.out.println("El resultado de la resta es: " + resultado);
   }

   @Override
   public void Operaciones() {
      System.out.println("Resta finalizada");
   }
}
