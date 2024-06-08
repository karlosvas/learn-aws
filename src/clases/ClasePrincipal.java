package src.clases;

public class ClasePrincipal {
    public static void main(String[] args){
        SinConstructor mensajero = new SinConstructor();
        mensajero.PedirNombre();
        mensajero.Imprimir();

        ConConstructor mensajero2 = new ConConstructor();
    }
}
