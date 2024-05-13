package Ejercicios.Entrega2_UD09;

import java.io.*;
import java.util.ArrayList;

public class Principal {


    public static void main(String[] args) throws IOException {
        System.out.println("Inicio Entrega 02 - UD09");

        ArrayList<Cliente> listaClientes = new ArrayList<>();

        Cliente c1 = new Cliente(1, "Pablo", 1.20);
        Cliente c2 = new Cliente(1, "Juan", 123.20);
        Cliente c3 = new Cliente(1, "Pablo", -12.45);


        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);


/*
         for (Cliente c : listaClientes){
             System.out.println(c.getSaldoCuenta());
        c.show();
         }
*/

        String ficheroDestinoRuta = "entrega2UD9_objetosInput.dat";
        File ficheroDestino = new File(ficheroDestinoRuta);
        if (!ficheroDestino.exists()) ficheroDestino.createNewFile();




    }

    public static void salvarClientes (ArrayList <Cliente> listaClientes , String ficheroDestino){
        FileInputStream fis = new FileInputStream(new File(ficheroDestino));



        FileOutputStream fos = new FileOutputStream((new File(ficheroDestino));






    }


}
