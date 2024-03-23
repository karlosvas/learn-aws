package src.ejemplos;

import java.math.BigInteger;

class Animales{
   private int patas;
   private String nombre;
   public static BigInteger ID;
   public static String raza;
   
   public Animales(int p, String  nombre, String raza){
      this.patas = p;
      this.nombre = nombre;
   }

   // getters y setters
   public void setPatas(int p){
      this.patas = p;
   }
   public void setNombre(String n){
      this.nombre = n;
   }

   public int getPatas(){
      return this.patas;
   }
   public String getNombre(){
      return this.nombre;
   }

   public void show(){
      System.out.println(this.nombre);
      System.out.println(this.patas);
   } 
}

public class Main {
   public static void main(String[] args){
      Animales a = new Animales(4, "perro", "canino");
      Animales.ID = new BigInteger("1823789278");
      a.show();
      Animales.raza = "canino";
      System.out.println(Animales.ID);
      System.out.println(Reverse.reverse(Animales.raza));
      System.out.println(Reverse.reverse(a.getNombre()));
      Reverse r = new Reverse();
   }
}
