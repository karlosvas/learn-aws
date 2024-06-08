package src.clases;

import java.util.Scanner;

public class ConConstructor {
    public ConConstructor() {
        Scanner mens = new Scanner(System.in);
        System.out.print("¿Cual es tu nombre?: ");
        String nombre = mens.nextLine();
        System.out.println("Tu nombre es " + nombre);
    }
}
