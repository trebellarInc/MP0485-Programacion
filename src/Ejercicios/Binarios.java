package Ejercicios;


import javax.swing.*;
import java.io.*;

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
        // Array de bytes con el tamaño fichero origen
        byte[] buffer;
        // Frame_Response = new byte[];

        File pathDefecto = new File(System.getProperty("user.home") + System.getProperty("file.separator") + "dev\\java\\tbl\\src\\ficheros");
        File ficheroOrigen;
        File ficheroDestino;

        // Para seleccion de archivo via GUI
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(pathDefecto);

        fc.showDialog(new JFrame(), "Copiar");
        ficheroOrigen = fc.getSelectedFile();
        System.out.println(ficheroOrigen.getParentFile());
        System.out.println(ficheroOrigen.getName());

        fc.showSaveDialog(new JFrame());
        ficheroDestino = fc.getSelectedFile();


        System.out.println("Origen  -> " + ficheroOrigen);
        System.out.println("Destino -> " + ficheroDestino);

        try {
            FileInputStream fis = new FileInputStream(ficheroOrigen);
            FileOutputStream fos = new FileOutputStream(ficheroDestino);

            // Lee el tamaño de los bytes
            System.out.println("avariable -> " + fis.available());

            int tamanoBuffer = fis.available();
            buffer = new byte[tamanoBuffer];

            // Lee el fichero de origen y lo almacena en el array
            for (int i = 0; i < tamanoBuffer; i++) {
                buffer[i] = (byte) fis.read();
                System.out.println(buffer[i] + " - " + (char) buffer[i]);
            }
            fis.close();

            // Lee el array y lo escribe en el fichero de destino
            for (int i = 0; i < tamanoBuffer; i++) {
                fos.write(buffer[i]);
                System.out.println(buffer[i] + " - " + buffer[i]);
            }
            fos.close();


        } catch (FileNotFoundException e) {
            System.err.println("Error\n" + e.getMessage());
            ;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //fc.showOpenDialog(new JFrame());


        // JOptionPane.showMessageDialog(new JFrame(), "Erro ao salvar arquivo", "mensaje ", JOptionPane.ERROR_MESSAGE);

        // JFileChooser é a janela de seleção de arquivo
        //fc.showSaveDialog(new JFrame());


    }


    private String obtenerExtensionArchivo(File fichero){
        String extension ="";



        return extension;
    }


}
