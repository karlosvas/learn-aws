package src.hilos;

import lib.hilos.*;

public class Main{
   public static void main(String[] args){
      // Extends Thread
      Proceso1 thread1 = new Proceso1();
      // Implements Runeable
      Thread thread2 = new Thread(new Proceso2());
      // Se puede crear mas de una instancia
      Proceso1 thread3 = new Proceso1();

      thread3.start();
      thread1.start();
      thread2.start();
   }
}