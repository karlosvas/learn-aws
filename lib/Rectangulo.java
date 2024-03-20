package lib;

public class Rectangulo {
   private int area, base, altura;

   // creamos el constructor
   public Rectangulo(int base, int altura){
      this.base = base;
      this.altura = altura;
      Calculadora();
   }

   public void Calculadora() {
      this.area = base * altura;
   }

   public void Imprimir(){
      System.out.println("El área del rectángulo es: " + this.area);
   }
}
