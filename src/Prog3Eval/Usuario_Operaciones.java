package Prog3Eval;

import Utiles.Cifrado;
import Utiles.Texto;

import java.io.*;
import java.util.HashMap;
public class Usuario_Operaciones {

    public static  HashMap<String, Usuario> cargaUsuariosDesdeArchivo() {
        HashMap<String, Usuario> mapa = new HashMap<>();
        File file = new File("usuarios.data");
        if (!file.exists()) {
            Txt.rojo("No existe el fichero de usuarios !!");
        }

        try (FileInputStream fileReader = new FileInputStream(file);
             ObjectInputStream objectStream = new ObjectInputStream(fileReader)) {
            mapa = (HashMap<String, Usuario>) objectStream.readObject();
            Txt.cyan("Carga de usuarios correcta.");
        } catch (FileNotFoundException e) {
            System.out.println("error -> " + e.getMessage());
             throw new RuntimeException(e);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("error -> " + e.getMessage());
             throw new RuntimeException(e);
        }
        return mapa;
    }

    public static void guardaUsuariosAArchivo(HashMap<String,Usuario> mapa) {
        File file = new File("usuarios.data");
        try (FileOutputStream fileOutput = new FileOutputStream(file);
             ObjectOutputStream objectStream = new  ObjectOutputStream(fileOutput)) {
            objectStream.writeObject(mapa);
        } catch (FileNotFoundException e) {
            Txt.rojo(e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            Txt.rojo(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    static void cargaUsuariosTest(HashMap<String, Usuario> mapa){
        Usuario user1 = new Usuario("nacho", "qweasd");
        Usuario user2 = new Usuario("maria", "qweasd");
        Usuario user3 = new Usuario("anxo", "asdqwe");
        Usuario user4 = new Usuario("maria", "asdqwe");
        Usuario user5 = new Usuario("admin", "admin");
        // user1.setActivo(false);
        mapa.put(user1.getNombre(), user1);
        mapa.put(user2.getNombre(), user2);
        mapa.put(user3.getNombre(), user3);
        mapa.put(user4.getNombre(), user4);
        mapa.put(user5.getNombre(), user5);

        System.out.println("Carga de usuarios Test");

    }

    public static boolean login(String user, String pass, HashMap<String, Usuario> mapa) {
        boolean retorno = false;

        if (mapa.containsKey(user)) {
            //System.out.print("El código " + user + " corresponde a ");
            //System.out.println(mapa.get(user));
            if (mapa.get(user).getPasswd().equals(Cifrado.md5(pass))) {
                if (mapa.get(user).isActivo() == true) {
                    //System.out.println("Utiles.Acceso correcto");
                    Txt.verde("Acceso correcto.");
                    retorno = true;
                } else {
                    //System.out.println("Utiles.Acceso denegado - usuario no activo");
                    Txt.rojo("Acceso denegado - usuario no activo.");
                }
            } else {
                //System.out.println("Utiles.Acceso denegado - clave incorrecta.");
                Txt.rojo("Acceso denegado - clave incorrecta.");
            }
        } else {
            //System.out.print("Utiles.Acceso denegado - el usuario " + user + " no existe.");
            Txt.rojo("Acceso denegado - el usuario " + user + " no existe.");
        }
        return retorno;
    }


}
