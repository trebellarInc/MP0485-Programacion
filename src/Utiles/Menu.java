package Utiles;

import Prog3Eval.rev.Captura;

import java.util.Scanner;

public class Menu {
    static String SEPARADOR = "--------------------------------";
    static String ANSI_RESET = "\u001B[0m";
    static String ANSI_BLACK = "\u001B[30m";
    static String ANSI_RED = "\u001B[31m";
    static String ANSI_GREEN = "\u001B[32m";
    static String ANSI_YELLOW = "\u001B[33m";
    static String ANSI_BLUE = "\u001B[34m";
    static String ANSI_PURPLE = "\u001B[35m";
    static String ANSI_CYAN = "\u001B[36m";
    static String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        String[] menuTextos = {"1 - Modulos",
                "2 - Docentes",
                "3 - Alumnos Presencial",
                "4 - Alumnos Distancia",
                "",
                "0 - Salir"};

        boolean salir = false;
        while (!salir) {
            System.out.println(ANSI_GREEN + SEPARADOR + "\n\t\tMenu - Principal" + "\n" + SEPARADOR + ANSI_PURPLE);
            for (String m : menuTextos) {
                System.out.println(m);
            }
            System.out.println(SEPARADOR + ANSI_RESET);

            menuPregunta("Ingrese su opción:", "");


            int opcion = 99; // Default
            try {
                opcion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    subMenu1(scanner);
                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Help menu selected.");
                    break;
                case 0:
                    salir = true;
                    System.out.println("¡Hasta la próxima! \n¡Esperamos verte pronto!\n" + "\n");
                    break;
                default:
                    Texto.rojo("Lo siento." + "\nParece que has seleccionado una opción no válida en el menú." + "\nPor favor, intenta nuevamente o selecciona una opción diferente.");
            }
        }

        scanner.close();
    }

    public static void subMenu1(Scanner scanner) {
        boolean salirSubMenu = false;
        String[] menuTextos = {"1 - Modulos ",
                "2 - Modulos",
                "3 - Modulos Presencial",
                "4 - Modulos Distancia",
                "",
                "0 - Volver"};

        while (!salirSubMenu) {
            System.out.println(ANSI_GREEN + SEPARADOR + "\n\t\tsubMenu 1" + "\n" + SEPARADOR + ANSI_PURPLE);
            for (String m : menuTextos) {
                System.out.println(m);
            }
            System.out.println(SEPARADOR + ANSI_RESET);

            menuPregunta("Ingrese su opción:", "");

            int opcion = 99; // Default
            try {
                opcion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("1 -");
                    break;
                case 2:
                    System.out.println("2 -..");
                    break;
                case 3:
                    System.out.println("3 -.");
                    break;
                case 0:
                    salirSubMenu = true;
                    break;
                default:
                    Texto.rojo("Lo siento." + "\nParece que has seleccionado una opción no válida en el menú." + "\nPor favor, intenta nuevamente o selecciona una opción diferente.");
            }
        }
    }


    public static void rojo(String texto) {
        System.out.println(ANSI_RED + texto + ANSI_RESET);
    }

    public static void verde(String texto) {
        System.out.println(ANSI_GREEN + texto + ANSI_RESET);
    }

    public static void cyan(String texto) {
        System.out.println(ANSI_CYAN + texto + ANSI_RESET);
    }

    public static void azul(String texto) {
        System.out.println(ANSI_BLUE + texto + ANSI_RESET);
    }

    public static void menuPregunta(String pregunta, String user) {
        System.out.println(ANSI_BLUE + pregunta + ANSI_RED + user + ANSI_BLUE + "? " + ANSI_RESET);

    }
}
