package Ejercicios;


import javax.swing.*;
import java.io.*;
import java.nio.file.FileSystems;

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


        // Se cambia System.getProperty por  FileSystems.getDefault().getSeparator()
        File pathDefecto = new File(System.getProperty("user.home") + FileSystems.getDefault().getSeparator() + "dev\\java\\tbl\\src\\ficheros");
        File ficheroOrigen;
        File ficheroDestino;

        // Para seleccion de archivo via GUI
        JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(pathDefecto);

        // Pregunta el fichero de origen a copiar
        fc.showDialog(new JFrame(), "Copiar");
        ficheroOrigen = fc.getSelectedFile();
        System.out.println(ficheroOrigen.getParentFile());
        System.out.println(ficheroOrigen.getName());
        System.out.println(obtenerExtension(ficheroOrigen.getName()));

        // Pregunta el fichero de destino
        fc.showSaveDialog(new JFrame());
        ficheroDestino = fc.getSelectedFile();

        // El fichero a copiar se llamara igual pero con un añadido en el nombre de backup
        ficheroDestino = new File(ficheroOrigen.getParentFile() + FileSystems.getDefault().getSeparator() + obtenerNombre(ficheroOrigen.getName()) + "_backup." + obtenerExtension(ficheroOrigen.getName()));



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


    private static String obtenerExtension(File fichero){
        String extension ="";
        int i = fichero.toString().lastIndexOf('.');
        if (i >= 0) {
            extension = fichero.toString().substring(i+1);
        }
        return extension;
    }

    private static String obtenerExtension(String fichero){
        String extension ="";
        int i = fichero.lastIndexOf('.');
        if (i >= 0) {
            extension = fichero.substring(i+1);
        }
        return extension;
    }

    private static String obtenerNombre(File fichero){
        String nombreSinExtension ="";
        int i = fichero.toString().lastIndexOf('.');
        if (i >= 0) {
            nombreSinExtension = fichero.toString().substring(0, i);
        }
        return nombreSinExtension;
    }

    private static String obtenerNombre(String fichero){
        String nombreSinExtension ="";
        int i = fichero.lastIndexOf('.');
        if (i >= 0) {
            nombreSinExtension = fichero.substring(0, i);
        }
        return nombreSinExtension;
    }




    /*
    Pablo *Lago* (c)
    Nacho *Limetre*
    Ivan *Montans*
    Juan *de Sola*
    Pablo *Romero*
    José *Jardón*
    Brais (Becario)
    */


}
