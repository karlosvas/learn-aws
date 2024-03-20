package src.modificador_acceso.pakete2;

import src.modificador_acceso.pakete1.Atributos_Metodos;
import java.math.BigInteger;
public class ClaseModificador2 {
   public static void main(String[] args){
      Atributos_Metodos am = new Atributos_Metodos();
      // El modificador de acceso de valorUno es default, por lo que no se puede acceder a el desde otro paquete
      // am.valorUno = 10;
      
      // El modificador de acceso valorPublico es public, por lo que se puede acceder a el desde otro paquete
      am.valorPublico = new BigInteger("100000000000000000");
   }
}
