package src.ambitos;

public class Ambito {
   static int variableEstatica;
   int variableGlobal;

   void miMetodo(int variableParametro) {
      int variableLocal = 52;
      System.out.println("El valor de variableLocal es: " + variableLocal);
      System.out.println("El valor de el parámetro es: " + variableParametro);
   }

   public void Prueba(){
      String variableLocal = "Hola";
      System.out.println("El valor de variableLocal es: " + variableLocal);
   }
}
