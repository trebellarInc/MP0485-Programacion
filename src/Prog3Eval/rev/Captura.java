package Prog3Eval.rev;

import java.util.Scanner;

public class Captura {


    public static String cadena(String pregunta) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(pregunta);
        String entradaTeclado = scanner.nextLine();
        return entradaTeclado;
    }


    public static int enteroValidacion(String pregunta) {
        int dato = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print(pregunta);
        String entradaTeclado = scanner.nextLine();

        while (!esEntero(entradaTeclado)) {
            System.out.println("El valor ingresado no es válido.\n" + pregunta);
            entradaTeclado = scanner.nextLine();
        }

        if (esEntero(entradaTeclado)) {
            dato = Integer.parseInt(entradaTeclado);
            // System.out.println("El número ingresado es: " + dato);
        }
        scanner.close();
        return dato;
    }

    public static boolean esEntero(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
