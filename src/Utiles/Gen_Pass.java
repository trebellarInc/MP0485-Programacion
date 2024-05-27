package Utiles;

public class Gen_Pass {

    public static void test() {
        System.out.println("test");

        // Mayúsculas
        //        Minúsculas
        // Números 0123456789
        //   Símbolos ! " # $ % & ' ( ) * + , - . / : ; < = > ? @ [ \ ] ^ _` { | } ~

        //12 alphanumeris la mas interesante
        char[] letrasMayusculas = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] letrasMinusculas = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] simbolos = {'!', '"', '#', '$', '%', '&', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', ']', '^', '_', '`', '{', '|', '}', '~'}; // ' , \
        System.out.println(letrasMayusculas[2]);
    }
}
