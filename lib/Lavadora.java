package lib;

public class Lavadora {
   private int kilos;
   private int typeRopa;
   private boolean llenadoCompleto = false;
   private boolean lavadoCompleto = false;

   public Lavadora(int kilos, int typeRopa){
      this.kilos = kilos;
      this.typeRopa = typeRopa;
   }

   private void Llenado(){
      if(kilos <= 12) {
         this.llenadoCompleto = true;
         System.out.println("Llenando...");
         System.out.println("Llenando completo");
      } else{
         System.out.println("La carga de ropa es muy pesada, reduce la carga");
      }
   }

   private void Lavado(){
      Llenado();
      if(this.llenadoCompleto){
         if(this.typeRopa == 1){
            System.out.println("Ropa blanca / lavado suave");
         } else if(this.typeRopa == 2){
            System.out.println("Ropa de color / lavado intenso");
         } else {
            System.out.println("Tipo de ropa no disponible");
         }

         System.out.println("Lavando...");
         this.lavadoCompleto = true;
         System.out.println("Lavando la ropa");
      } else {
         System.out.println("No se ha llenado la lavadora");
      }
   }

   public void CicleFinalizado(){
      Lavado();
      if(this.lavadoCompleto){
         System.out.println("Tu ropa esta lista");
      }
   }

   // Getters
   public int getKilos(){
      return this.kilos;
   }

   public int getTypeRopa(){
      return this.typeRopa;
   }
}
