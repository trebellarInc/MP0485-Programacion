package Utiles;

import java.util.HashMap;

public class Acceso {

    public static boolean login(String user, String pass, HashMap<String, Usuario> mapa) {
        boolean retorno = false;

        if (mapa.containsKey(user)) {
            //System.out.print("El código " + user + " corresponde a ");
            //System.out.println(mapa.get(user));
            if (mapa.get(user).getPasswd().equals(Cifrado.md5(pass))) {
                if (mapa.get(user).isActivo() == true) {
                    //System.out.println("Utiles.Acceso correcto");
                    Texto.verde("Utiles.Acceso correcto.");
                    retorno = true;
                } else {
                    //System.out.println("Utiles.Acceso denegado - usuario no activo");
                    Texto.rojo("Utiles.Acceso denegado - usuario no activo.");
                }
            } else {
                //System.out.println("Utiles.Acceso denegado - clave incorrecta.");
                Texto.rojo("Utiles.Acceso denegado - clave incorrecta.");
            }
        } else {
            //System.out.print("Utiles.Acceso denegado - el usuario " + user + " no existe.");
            Texto.rojo("Utiles.Acceso denegado - el usuario " + user + " no existe.");
        }
        return retorno;
    }

}
