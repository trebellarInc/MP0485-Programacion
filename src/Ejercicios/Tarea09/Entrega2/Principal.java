package Ejercicios.Tarea09.Entrega2;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

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


        String ficheroDestinoRutaJson = "entrega2UD9_objetosInput.json";
        String ficheroDestinoRutaXml = "entrega2UD9_objetosInput.xml";

        File ficheroDestino = new File(ficheroDestinoRutaXml);
        if (!ficheroDestino.exists()) ficheroDestino.createNewFile();

        File ficheroDestinoJson = new File(ficheroDestinoRutaXml);
        if (!ficheroDestinoJson.exists()) ficheroDestinoJson.createNewFile();

        salvarClientesXML(listaClientes, ficheroDestinoRutaXml);
        leeClientesXML(ficheroDestinoRutaXml);
        salvarClientesJson(listaClientes, ficheroDestinoRutaJson);

    }

    public static void salvarClientesXML(ArrayList<Cliente> listaClientes, String ficheroDestino) {
        XStream xstream = new XStream();

        xstream.alias("DatosCliente", Cliente.class);

        System.out.println(xstream.toXML(listaClientes));

        try {
            xstream.toXML(listaClientes, new FileOutputStream(ficheroDestino));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Creado el fichero xml");
    }

    public static void leeClientesXML(String ficheroDestino) {
        XStream xstream = new XStream();

        xstream.allowTypes(new Class[]{Cliente.class});

        xstream.alias("DatosCliente", Cliente.class);

        ArrayList<Cliente> lista;
        try {
            lista = (ArrayList<Cliente>) xstream.fromXML(new FileInputStream(ficheroDestino));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        for (Cliente c : lista) {
            System.out.println(c.getSaldoCuenta());
            c.show();
        }
    }

    public static void salvarClientesJson(ArrayList<Cliente> listaClientes, String ficheroDestino) {
        Gson gson = new Gson();
        String json = gson.toJson(listaClientes);


        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(ficheroDestino));
            System.out.println(json);
            bw.write(json);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }


    }
}