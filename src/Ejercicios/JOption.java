package Ejercicios;

import javax.swing.*;
import java.io.*;

/**
 * Crea una aplicación que pida la ruta de dos ficheros de texto y de una ruta de destino
 * (solo la ruta, sin fichero al final).
 * Debes copiar el contenido de los dos ficheros en uno, este tendrá el nombre de los dos ficheros
 * separados por un guion bajo, este se guardara en la ruta donde le hayamos indicado por teclado.
 * Para unir los ficheros en uno, crea un método donde le pases como parámetro todas las rutas.
 * En este método, aparte de copiar debe comprobar que si existe el fichero de destino, nos muestre un mensaje
 * informándonos de si queremos sobrescribir el fichero.
 * Te recomiendo usar la clase File y JOptionPane.
 *
 * @author Nacho Limetre
 */
// System.getProperty("user.home")
public class JOption {
    public static void main(String[] args) {
        String mensajeError = null;



      //  String ruta1 = JOptionPane.showInputDialog("Introduce la ruta del 1er fichero");
      //  String ruta2 = JOptionPane.showInputDialog("Introduce la ruta del 2er fichero");
        String rutaDestino = JOptionPane.showInputDialog("Introduce la ruta de carpeta de detino");

        String ruta1 = "C:\\Users\\soporte\\Desktop\\PROG\\TestFicheros\\fichero1.txt";
        String ruta2 = "C:\\Users\\soporte\\Desktop\\PROG\\TestFicheros\\fichero2.txt";
      //  String rutaDestino = "C:\\Users\\soporte\\Desktop\\PROG\\TestFicheros\\Destino";



        File fichero1 = new File(ruta1);
        File fichero2 = new File(ruta2);
        File carpeta = new File(rutaDestino);

        // Control de errores
        if (!fichero1.exists()) {
            mensajeError = "La ruta del 1er fichero no es valida.";
        }
        if (!fichero2.exists()) {
            mensajeError += "\nLa ruta del 2er fichero no es valida.";
        }
        if (!carpeta.isDirectory()) {
            mensajeError += "\nLa ruta de carpeta de detino no es valida.";
        }

        // Si no hay errores ejecuta el bloque de codigo
        if (mensajeError != null) {
            JOptionPane.showMessageDialog(null, mensajeError, "Error de fichero", JOptionPane.ERROR_MESSAGE);
        } else {
            unirFicheros(fichero1, fichero2, carpeta);
        }


    }

    public static void unirFicheros(File f1, File f2, File dest) {
        String mensajeError = null;
        File ficheroUnido = new File(dest + File.separator + "fichero_unido6.txt");
        System.out.println(ficheroUnido);

        if (!dest.isDirectory()) {
            mensajeError += "\nLa ruta de carpeta de detino no es valida.";
        }


        // Si no hay errores ejecuta el bloque de codigo
        if (mensajeError != null) {
            JOptionPane.showMessageDialog(null, mensajeError, "Error de fichero", JOptionPane.ERROR_MESSAGE);
        } else {
            // Comprueba si exite el fichero en la ruta especifica, si es asi pregunta si se sobreescribe
            if (ficheroUnido.exists()) {
                int sino = JOptionPane.showConfirmDialog(null, "Desea sobreescribir el archivo?",
                        "Elige una opción", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                //si 0 , no 1
                if (sino == 0) {
                    // Une los ficheros
                    BufferedReader buffread = null;
                    BufferedWriter buffwrite = null;

                    try {
                        String linea = null;
                        buffwrite = new BufferedWriter(new FileWriter(ficheroUnido));

                        buffread = new BufferedReader(new FileReader(f1));
                        while ((linea = buffread.readLine()) != null) {
                            buffwrite.write(linea);
                            buffwrite.newLine();
                            System.out.println(linea);
                        }

                        buffread = new BufferedReader(new FileReader(f2));
                        while ((linea = buffread.readLine()) != null) {
                            buffwrite.write(linea);
                            buffwrite.newLine();
                            System.out.println(linea);
                        }

                        buffread.close();
                        buffwrite.close();

                    } catch (IOException e) {
                        System.err.println("Error unir ficheros buffer " + e.getMessage());
                    }
                if(ficheroUnido.exists()){
                    System.out.println("El fichero ha sido creado satisfactoriamente");
                }
                } else {
                    // no se sobreescribe
                    System.out.println("El fichero no ha sido modificado.");
                }



            } else {
                // Une los ficheros
                BufferedReader buffread = null;
                BufferedWriter buffwrite = null;

                try {
                    String linea = null;
                    buffwrite = new BufferedWriter(new FileWriter(ficheroUnido));

                    buffread = new BufferedReader(new FileReader(f1));
                    while ((linea = buffread.readLine()) != null) {
                        buffwrite.write(linea);
                        buffwrite.newLine();
                        System.out.println(linea);
                    }

                    buffread = new BufferedReader(new FileReader(f2));
                    while ((linea = buffread.readLine()) != null) {
                        buffwrite.write(linea);
                        buffwrite.newLine();
                        System.out.println(linea);
                    }

                    buffread.close();
                    buffwrite.close();


                } catch (IOException e) {
                    System.err.println("Error unir ficheros buffer " + e.getMessage());
                }
                if(ficheroUnido.exists()){
                    System.out.println("El fichero ha sido creado satisfactoriamente");
                }


            }


        }

    }
}