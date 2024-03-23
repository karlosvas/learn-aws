package lib;

public class CajeroAutomatico {
   private int balance = 500;;
   
   // Getters and Setters
   // Cosulta de saldo
   public void getSaldo(){
      System.out.println("Saldo actual: " + this.balance);
   }

   // Retiro de saldo.
   public void withdrawBalance(int balance){
      if (balance >= 1000) {
         System.out.println("Cantidad demasiado grande, ingrese menos de 1000€");
      } else if(balance > this.balance){
         System.out.println("No se puede retirar esa cantidad, actualmente dispones de " + this.balance);
      } else {
         this.balance -= balance;
         System.out.println("Retiraste " + balance);
      }
   }

   // Depósito de saldo.
   public void setBalance(int balance){
      this.balance += balance;
      System.out.println("Depositaste " + balance);
   }
}