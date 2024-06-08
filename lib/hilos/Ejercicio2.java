package lib.hilos;

public class Ejercicio2 extends Thread{

   int num_int;

   public Ejercicio2(String NombreTheread){
      super(NombreTheread);
   }

   @Override
   public void run() {
      for (int i = 0; i < 5; i++) {
         System.out.println(i + this.getName());
      }
      System.out.println("");
   }

   // Setter
   public void SetCondition(int valor) {
      this.num_int = valor;
   }
}
