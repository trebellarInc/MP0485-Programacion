package Ejercicios;


import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Nacho Limetre
 */

/*BYTES
   3)Crea una aplicación que copie un fichero binario a otra localización.
    En lugar de leer y escribir byte a byte,
    crea un array de bytes con el tamaño del fichero de origen (utiliza el método available()),
   copia el contenido del fichero a este array y escribe a partir de este array.
   Recuerda que debes controlar las excepciones que puedan aparecer.
   En caso de error, mostrar una ventana de dialogo con información del error.
   */
public class Binarios {

    public static void main(String[] args) {

       // JOptionPane.showMessageDialog(new JFrame(), "Erro ao salvar arquivo", "mensaje ", JOptionPane.ERROR_MESSAGE);

        // JFileChooser é a janela de seleção de arquivo
        JFileChooser fc = new JFileChooser();
       //fc.showSaveDialog(new JFrame());
       fc.showOpenDialog(new JFrame());

        System.out.println(fc.getSelectedFile());
    }

}
