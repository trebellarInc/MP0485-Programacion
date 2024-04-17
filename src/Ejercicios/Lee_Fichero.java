package Ejercicios;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Nacho Limetre
 */

public class Lee_Fichero {
    public static void main(String[] args) {
        File rutaArchivo = new File("src/Ficheros/contenido.txt");


        System.out.println("Ejercicio - lea un fichero de texto carácter a carácter y muestre su contenido por pantalla  sin espacios.");
        leeArchivo(rutaArchivo);
        System.out.println("\n");
        leeConvierteMayusculas(rutaArchivo);

    }

    public static void leeArchivo(File archivo) {
        FileReader lector = null;
        if (archivo.exists()) {
            try {
                lector = new FileReader(archivo);
                int character;

                while ((character = lector.read()) != -1) {
                    // Si el caracter leido es un espacio (32) no lo imprime en pantalla
                    if (character != 32) {
                        System.out.print((char) character);
                    }
                }
                lector.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                ;
            }
        } else {
            System.err.println("No existe el archivo:\n" + archivo);
        }
    }


    static void leeConvierteMayusculas(File archivo) {
        FileReader lector = null;
        if (archivo.exists()) {
            try {
                lector = new FileReader(archivo);
                int character;

                while ((character = lector.read()) != -1) {
                    // Si el caracter leido es un espacio (32) no lo imprime en pantalla
                    if (character != 32) {
                        System.out.print((char) character);
                    }
                }
                lector.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
                ;
            }
        } else {
            System.err.println("No existe el archivo:\n" + archivo);
        }
    }


}
