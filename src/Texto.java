public class Texto {
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

    public static void menuPregunta(String pregunta, String user) {
        System.out.println(ANSI_BLUE +
                pregunta + ANSI_RED + user + ANSI_BLUE + "? " +
                ANSI_RESET);

    }
    public static void menuAcceso() {

        System.out.println(ANSI_GREEN + SEPARADOR +
                "\n\t\tMenu - Acceso" +
                "\n" + SEPARADOR + ANSI_RESET);

    }

    public static void rojo(String texto) {
        System.out.println(ANSI_RED + texto + ANSI_RESET);
    }

    public static void verde(String texto) {
        System.out.println(ANSI_GREEN + texto + ANSI_RESET);
    }


    public static void menuPrincipal() {

        System.out.println(ANSI_GREEN + SEPARADOR +
                "\n\t\tMenu - Principal" +
                "\n" + SEPARADOR + ANSI_PURPLE +
                "\n\t1 - Carga" +
                "\n\t-" +
                "\n\t-" +
                "\n\t-" +
                "\n\t-" +
                "\n\t-" +
                "\n\t-" +
                "\n\t9 - Logout" +
                "\n\t0 - Salir" +
                "\n" + SEPARADOR + ANSI_RESET);

    }

}
