package src.hilos.sincronizacion;
import lib.hilos.sincronizacion.*;

public class Main {
    public static void main(String[] args){
        Hilo1 tread1 = new Hilo1();
        Hilo2 tread2 = new Hilo2();
        Hilo3 tread3 = new Hilo3();
        Hilo4 tread4 = new Hilo4();

        tread1.start();
        try {
            tread1.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo1" + e);
        }

        tread2.start();
        try {
            tread2.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo2" + e);
        }

        tread3.start();
        try {
            tread3.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo3" + e);
        }

        tread4.start();
        try {
            tread4.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo4" + e);
        }
    }
}