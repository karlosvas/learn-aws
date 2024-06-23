package src.listas.FIFO;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcion = 0, nodo = 0;
        Pila pila = new Pila();

        while (opcion != 8) {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Seleciona: \n\n"
                    + "1 Insertar nodo\n"
                    + "2 Eliminar nodo\n"
                    + "3 La pila está vacía?\n"
                    + "4 ¿Cual es el ultimo valor ingresado en la Pila?\n"
                    + "5 ¿Cuantos nodos tiene la pila?\n"
                    + "6 Vaciar pila\n"
                    + "7 Mostrar el conteniido de la Pila\n"
                    + "8 Salir\n"));

                if (pila.IsPilaEmpty() && opcion != 8 && opcion != 1) {
                    JOptionPane.showMessageDialog(null, "La pila está vacia");
                } else {
                    switch (opcion) {
                        case 1:
                            nodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Porfavor ingrese el valor a guardar en el nodo"));   
                            pila.InsertNode(nodo);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: " + pila.DelateNode());                               
                            break;
                        case 3:   
                            JOptionPane.showMessageDialog(null, "La pila no está vacia");   
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado es el nodo  " + pila.ShowLastValue());                               
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "La pila contiene " + pila.Size() + " nodos");   
                            break;
                        case 6:   
                            pila.PilaEmptyAll();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                            break;
                        case 7:
                            pila.ShowValues();
                            break;
                        case 8:
                            opcion = 8;   
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelva a intentar nuevamente");
                            break;
                    }
                }
            } catch (NumberFormatException e) {

            }
        }
    }    
}
