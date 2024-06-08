package src.clases;
import java.util.Scanner;

public class SinConstructor {
    private Scanner mens = new Scanner(System.in);
    String nombre = "";

    public void PedirNombre(){
        System.out.print("¿Cual es tu nombre?: ");
        nombre = mens.nextLine();
    } 

    public void Imprimir(){
        System.out.println("Tu nombre es " + nombre);
    }
}
