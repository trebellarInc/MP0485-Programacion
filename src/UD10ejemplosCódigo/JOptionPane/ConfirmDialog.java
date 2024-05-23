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
public class ConfirmDialog {
    public static void main(String[] args) {
        //JOptionPane.showConfirmDialog(Componente padre, "Mensaje");
        //int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro?");
    //-----------------------------------------------------------------    
        //JOptionPane.showConfirmDialog(Componente padre, "Mensaje", "Titulo","Tipo de seleccion");
        //int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
    //----------------------------------------------------------------    
        //JOptionPane.showConfirmDialog(Componente padre, "Mensaje", "titulo", "tipo de seleccion", "tipo de mensaje");
        
      //  int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
    //---------------------------------------------------------------------   
        MyIcon icon = new MyIcon();
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, icon);

    
        if(resp==0){//resp 0 -> si
            JOptionPane.showMessageDialog(null, "Ha dicho que si");
        }
        else{//resp 1 -> no
            JOptionPane.showMessageDialog(null, "Ha dicho que no");
        }
        
    }
}
