package src.listas.FIFO;

import javax.swing.JOptionPane;

public class Pila {
    private Nodo LastValue;
    int size = 0;
    String List = "";

    public Pila(){
        LastValue = null;
        size = 0;
    }

    public boolean IsPilaEmpty(){
        return LastValue == null;
    }

    public void InsertNode(int node){
        Nodo nuevo_nodo = new Nodo(node);
        nuevo_nodo.siguiente = LastValue;
        LastValue = nuevo_nodo;
        size++;
    }

    public int DelateNode(){
        int aux = LastValue.info;
        LastValue =LastValue.siguiente;
        size--;
        return aux;   
    }

    public int ShowLastValue(){
        return LastValue.info;
    }

    public int Size(){
        return this.size;
    }

    public void PilaEmptyAll(){
        while (!IsPilaEmpty()) {
            DelateNode();
        }   
    }

    public void ShowValues(){
        Nodo recorrido = LastValue;
        while (recorrido != null){
            this.List += recorrido.info + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, List);
        List = "";
    }
}
