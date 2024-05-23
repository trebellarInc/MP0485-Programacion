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
public class InputDialog {
    public static void main(String[] args) {
        //String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
 //----------------------------------------------------------------       
//        JOptionPane.showInputDialog(Componente padre, Mensaje, Texto Inicial);
//        String respuesta = JOptionPane.showInputDialog("¿Cual es su nombre?", "atxy2k");
 //-----------------------------------------------------------------------       
//        JOptionPane.showInputDialog(Componente padre, Mensaje, Titulo, Tipo De Mensaje (WARNING) );
        String respuesta = JOptionPane.showInputDialog(null, 
                "Escriba nuevamente su nombre", "Error!", JOptionPane.ERROR_MESSAGE);
 //------------------------------------------------------------------       
//        JOptionPane.showInputDialog(Componente padre, Mensaje, Titulo, 
//        Tipo De Mensaje, Icono, Array de opciones, Seleccion por defecto );
    

//        String[] carreras = {
//            "Ingeniería en sistemas computacionales",
//            "Ingeniería industrial",
//            "Ingeniería en mecatrónica",
//            "Ingeniería en informatica",
//            "Ingeniería petroquímica"
//        };
//        
//        MyIcon icon = new MyIcon();
//        
//        String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera",
//                JOptionPane.DEFAULT_OPTION, icon, carreras, carreras[0]);
//        
//        JOptionPane.showMessageDialog(null, resp);
//------------------------------------------------------------------
            JOptionPane.showMessageDialog(null, respuesta);


    }

}
