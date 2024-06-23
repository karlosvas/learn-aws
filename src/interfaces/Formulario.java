package src.interfaces;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {
       private JTextField textFiled1;
       private JLabel label1;
       private JButton button1;

       public Formulario(){
            setLayout(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            label1 = new JLabel("Text: ");
            label1.setBounds(15, 10, 100, 30);
            add(label1);

            textFiled1 = new JTextField();
            textFiled1.setBounds(80,16,190,20);
            add(textFiled1);    

            button1 = new JButton("Mostrar");
            button1.setBounds(10,60,100,30);
            add(button1);

            button1.addActionListener(this);
       }

       @Override
       public void actionPerformed(ActionEvent e){
            if(e.getSource() == button1){
                String cadena = textFiled1.getText();
                JOptionPane.showMessageDialog(null, cadena);
            }    
       }

       public static void main(String []args){
            Formulario formulario = new Formulario();
            formulario.setBounds(0,0,300,150);
            formulario.setVisible(true);
            formulario.setLocationRelativeTo(null);
       }
}
