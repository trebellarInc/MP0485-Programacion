package UD10ejemplosCódigo.JOptionPane;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author mrnov
 */
public class MessageDialog {
    public static void main(String[] args) {
        /*
•	Primer Parámetro: El componente padre sobre el cual se mostrará la ventana de dialogo.
•	Segundo Parámetro: El mensaje que se mostrará dentro de la ventana.
•	Tercer Parámetro: El mensaje que se mostrará en la barra de titulo.
•	Cuarto Parámetro: Una variable Int contenida por JOptionPane, que representa el icono que se mostrará en la ventana, algunos de los valores posibles son: INFORMATION_MESSAGE , WARNING_MESSAGE , QUESTION_MESSAGE , PLAIN_MESSAGE, ERROR_MESSAGE

        */
        
        //JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
    
//        JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", 
//                "Mensaje en la barra de titulo", JOptionPane.WARNING_MESSAGE);

          MyIcon icon = new MyIcon();
        JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", 
                "Titulo", JOptionPane.DEFAULT_OPTION, icon);

    }

}
