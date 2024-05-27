package UD10ejemplosCódigo;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class fileChooser extends JFrame{

    private JPanel contentPane;
    private JTextField textField;
    private JTextArea textArea;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    fileChooser frame = new fileChooser();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


    }

    public fileChooser() throws HeadlessException {
        //Parametros asociados a la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        textField = new JTextField();
        textField.setToolTipText("Inserta la ruta del fichero de audio");
        textField.setBounds(52, 26, 209, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        JButton btnSeleccionar = new JButton("Seleccionar...");
        btnSeleccionar.setBounds(288, 25, 109, 23);
        contentPane.add(btnSeleccionar);

        JButton btnGuardar = new JButton("Guardar...");
        btnGuardar.setBounds(288, 232, 109, 23);
        contentPane.add(btnGuardar);

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBounds(52, 76, 360, 156);

        JScrollPane scroll=new JScrollPane(textArea);
        scroll.setBounds(52, 76, 360, 156);
        contentPane.add(scroll);

        btnSeleccionar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                leerTexto();
            }

        });

        btnGuardar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                escribirTexto();
                escribirTextoInicial();
            }

        });

    }

    public void leerTexto(){
         /*LECTURA
            //Ecribe la ruta del fichero seleccionado en el campo de texto
    textField.setText(fichero.getAbsolutePath());

    try(FileReader fr=new FileReader(fichero)){
        String cadena="";
        int valor=fr.read();
        while(valor!=-1){
            cadena=cadena+(char)valor;
            valor=fr.read();
        }
        textArea.setText(cadena);
    } catch (IOException e1) {
        e1.printStackTrace();
    }

        * */

        /*
        * Primero crearemos un objeto de JFileChooser, lo podemos crear sin parámetros o una ruta por defecto indicada con un String o un File.
Después invocamos el método showOpenDialog(contentPane) que nos devolverá un int, para saber que opción realiza el usuario. Tenemos las siguientes constantes:
•	JFileChooser.CANCEL_OPTION: Si el usuario pulsa en cancelar.
•	JFileChooser.APPROVE_OPTION: Si el usuario pulsa en aceptar
•	JFileCHooser.ERROR_OPTION: Si ocurre algún error.
La que nos interesa es JFileChooser.APPROVE_OPTION, después podemos copiar la ruta de ese fichero con el método getSelectedFile(); se guardara en un objeto File.
Esta ruta la podríamos guardar en el campo de texto, también podríamos hacer que escribiera el contenido del texto en el textarea.

* //Creamos el objeto JFileChooser
JFileChooser fc=new JFileChooser();

//Abrimos la ventana, guardamos la opcion seleccionada por el usuario
int seleccion=fc.showOpenDialog(contentPane);

//Si el usuario, pincha en aceptar
if(seleccion==JFileChooser.APPROVE_OPTION){

    //Seleccionamos el fichero
    File fichero=fc.getSelectedFile();

    //Ecribe la ruta del fichero seleccionado en el campo de texto
    textField.setText(fichero.getAbsolutePath());

    try(FileReader fr=new FileReader(fichero)){
        String cadena="";
        int valor=fr.read();
        while(valor!=-1){
            cadena=cadena+(char)valor;
            valor=fr.read();
        }
        textArea.setText(cadena);
    } catch (IOException e1) {
        e1.printStackTrace();
    }

        * */
        JFileChooser fc=new JFileChooser();

        //Indicamos lo que podemos seleccionar
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

//Creamos el filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT", "txt");

//Le indicamos el filtro
        fc.setFileFilter(filtro);


//Abrimos la ventana, guardamos la opcion seleccionada por el usuario
        int seleccion=fc.showOpenDialog(contentPane);

//Si el usuario, pincha en aceptar
        if(seleccion==JFileChooser.APPROVE_OPTION) {

            //Seleccionamos el fichero
            File fichero = fc.getSelectedFile();

            //Ecribe la ruta del fichero seleccionado en el campo de texto
            textField.setText(fichero.getAbsolutePath());

            try (FileReader fr = new FileReader(fichero)) {
                String cadena = "";
                int valor = fr.read();
                while (valor != -1) {
                    cadena = cadena + (char) valor;
                    valor = fr.read();
                }
                textArea.setText(cadena);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }

        }

    public void escribirTextoInicial(){
        JFileChooser guardarComo = new JFileChooser();
        guardarComo.setApproveButtonText("Guardar");
        guardarComo.showSaveDialog(null);

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.TXT","*.txt");
        guardarComo.setFileFilter(filtro);
        guardarComo.setMultiSelectionEnabled(true);
        guardarComo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);


        File archivo=new File(guardarComo.getSelectedFile()+".txt");

        try {
            BufferedWriter salida = new BufferedWriter(new FileWriter(archivo));
            salida.write("Esta es la cadena que va a ser guardada en el archivo seleccionado");
            salida.newLine();
            salida.append("esta es otra linea");
            salida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void escribirTexto() {
        //Creamos el objeto JFileChooser
        JFileChooser fc = new JFileChooser();

//Abrimos la ventana, guardamos la opcion seleccionada por el usuario
        int seleccion = fc.showSaveDialog(contentPane);

//Si el usuario, pincha en aceptar
        if (seleccion == JFileChooser.APPROVE_OPTION) {

            //Seleccionamos el fichero
            File fichero = fc.getSelectedFile();

            try (FileWriter fw = new FileWriter(fichero)) {

                //Escribimos el texto en el fichero
                fw.write(textArea.getText());

            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }
    }
}
