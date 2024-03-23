package cajero;
import java.util.Scanner;
import lib.CajeroAutomatico;

public class Main {
   public static void main(String[] args){
      CajeroAutomatico cajero = new CajeroAutomatico();

      Scanner scan = new Scanner(System.in);
      int option = 0;

      while(option != 4){
         System.out.print("1. Consultar saldo\n2. Retirar saldo\n3. Depositar saldo\n4. Salir\nOpción: ");

         if (scan.hasNextInt()){
            option = scan.nextInt();
         } else {
            System.out.println("Porfavor ingrese un número\n----------");
            scan.next();
            continue;
         }

         
         if (option == 1){
            cajero.getSaldo();
         } else if (option == 2){
            System.out.print("Cantidad a retirar: ");
            cajero.withdrawBalance(scan.nextInt());
         } else if (option == 3){
            System.out.print("Cantidad a ingresar: ");
            cajero.setBalance(scan.nextInt());
         } else if (option != 4) {
            System.out.println("Opción no válida");
         }
         System.out.println("----------");
      }

      scan.close();
   }
}