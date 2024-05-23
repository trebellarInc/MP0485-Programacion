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
public class OptionDialog {
    public static void main(String[] args) {
//        JOptionPane.showOptionDialog(padre, mensaje, titulo, tipo de seleccion,
//                tipo de mensaje, icono, opciones, valor inicial);
          
        MyIcon icon = new MyIcon();
        String[] options = {"Opcion A", "Opcion B", "Opcion C", "Opcion D"};
        int seleccion = JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Titulo", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
        
        if(seleccion==0){//resp 0 -> si
            JOptionPane.showMessageDialog(null, "Ha dicho que A");
        }
        else if(seleccion==1){//resp 1 -> no
            JOptionPane.showMessageDialog(null, "Ha dicho que B");
        }
        else if(seleccion==2){//resp 1 -> no
            JOptionPane.showMessageDialog(null, "Ha dicho que C");
        }
        else if(seleccion==3){//resp 1 -> no
            JOptionPane.showMessageDialog(null, "Ha dicho que D");
        }
    }
}
