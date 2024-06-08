package src.hilos;
import lib.hilos.Ejercicio2;

public class Main2 {
   public static void main(String[] args){
      Ejercicio2 thread1 = new Ejercicio2("Thread 1");
      Ejercicio2 thread2 = new Ejercicio2("Thread 2");
      Ejercicio2 thread3 = new Ejercicio2("Thread 3");

      thread1.SetCondition(5);
      thread2.SetCondition(10);
      thread3.SetCondition(15);

      thread1.start();
      thread2.start();
      thread3.start();
   }
}
