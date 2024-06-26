package Utiles;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    // Se crean los mapas de Usuarios y pilotos
    static HashMap<String, Usuario> mapaUsuarios = new HashMap<>();
    static HashMap<Integer, Piloto> mapaPilotos = new HashMap<>();

    // Valiables globales de acceso
    static boolean banderaAccesoAutorizado = false;
    static boolean banderaSalir = false;
    static final int INTENTOS_LOGIN = 3;

    public static void main(String[] args) {
        // Objeto para leer desde el teclado
        Scanner leerTeclado = new Scanner(System.in);

        // Se cargan los datos, sean ficticios, API, base de datos...
        mapaUsuarios = Conexion_Datos.cargaUsuariosArchivo();
        // Utiles.Conexion_Datos.UsuariosTets(mapaUsuarios);
        Conexion_Datos.cargaPilotos(mapaPilotos);



        String userIntroducido ;
        String passIntroducido ;

        // no pedir user y pass
        banderaAccesoAutorizado = true;


        //  Este while se repite siempre hasta que banderaSalir sea true, es la salida del programa
        while (banderaSalir == false) {
            System.out.println(banderaSalir + " estado de banderaSalir ");
            System.out.println(banderaAccesoAutorizado + " estado de banderaAccesoAutorizado ");

            // Si el acceso es autorizado entra en el menu principal
            if (banderaAccesoAutorizado == true) {
                menuPrincipal();
            } else { // Si no es autorizado prueba hacer login
                int intentoNumero = 1;

                while (intentoNumero <= INTENTOS_LOGIN && banderaAccesoAutorizado == false) {
                    Texto.menuAcceso();
                    // Indica el numero de intentos restantes
                    if (intentoNumero == 3) {
                        Texto.rojo("Utiles.Numero de intentos: " + (INTENTOS_LOGIN - (intentoNumero - 1)));
                    } else {
                        System.out.println("Utiles.Numero de intentos: " + (INTENTOS_LOGIN - (intentoNumero - 1)));
                    }
                    Texto.menuPregunta("Nombre de usuario ", "");
                    userIntroducido = leerTeclado.nextLine();
                    Texto.menuPregunta("Clave de acceso ", "");
                    passIntroducido = leerTeclado.nextLine();

                    // BORRAR SOLO DEV
                    //userIntroducido = "nacho";
                    //passIntroducido = "qweasd";

                    if (Acceso.login(userIntroducido, passIntroducido, mapaUsuarios)) {
                        banderaAccesoAutorizado = true;
                    } else {
                        intentoNumero++;
                        if (intentoNumero > INTENTOS_LOGIN) {
                            banderaSalir = true;
                            Texto.rojo("Has superado el número máximo de intentos de inicio de sesión.\nPor favor contacta con el soporte si necesitas asistencia");
                        }
                    }
                }
            }
        }
        System.out.println("¡Hasta la próxima! \n¡Esperamos verte pronto!\n" + "\n");
        /*

        JFrame ventana = new JFrame("Ventana");
        ventana.setSize(1080, 720);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
                 */

        /*
        LocalDate inicio = LocalDate.of(1980, 1, 1);
        LocalDate fin = LocalDate.of(1999, 12, 31);
        for (int i = 0; i < 10; i++) {
            System.out.println(Utiles.Fechas.fechaEntre(inicio, fin));
        }
*/
        /*

        String dniTest1 = "44083909v";
        String dniTest2 = "44083910V";
        String dniTest3 = "12345678Z";
        System.out.println(Utiles.Id_Esp.esValidoDNI(dniTest1));
        System.out.println(Utiles.Id_Esp.esValidoDNI(dniTest2));
        System.out.println(Utiles.Id_Esp.esValidoDNI(dniTest3));
         */

/*
        System.out.println(Utiles.Personas_Aleatorias.nombre());
        System.out.println(Utiles.Personas_Aleatorias.apellido());
        System.out.println(Utiles.Personas_Aleatorias.apellido());

        System.out.println(Utiles.Id_Esp.generaDNI(10000000, 48100999));
        System.out.println(Utiles.Fechas.fechaEntre(LocalDate.of(1950, 1, 1), LocalDate.of(2019, 12, 31)));
    */


    }

    public static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Imprime el menu del texto principal
            Texto.menuPrincipal();
            Texto.menuPregunta("Ingrese su opción:", "");
            // scanner.hasNextInt() - Este método devuelve true si el próximo token es un entero.
            while (!scanner.hasNextInt()) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                Texto.rojo("Lo siento." +
                        "\nParece que has seleccionado una opción no válida en el menú." +
                        "\nPor favor, intenta nuevamente o selecciona una opción diferente.");
                Texto.menuPrincipal();
                Texto.menuPregunta("Ingrese su opción:", "");
                scanner.next(); // Descarta la entrada no válida del usuario que no es un número entero.
            }
            opcion = scanner.nextInt();

            // ##################### SWITCH
            switch (opcion) {
                case 1:

                case 2:
                    Conexion_Datos.guardaUsuariosArchivo(mapaUsuarios);
                    break;
                case 3:
                    mapaUsuarios = Conexion_Datos.cargaUsuariosArchivo();
                    break;
                case 4:
                    imprimeMapaUsuarios();
                    break;
                case 9:
                    banderaAccesoAutorizado = false;
                    opcion = 0;
                    break;
                case 0:
                    banderaSalir = true;
                    break;
                default:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    Texto.rojo("Lo siento." +
                            "\nParece que has seleccionado una opción no válida en el menú." +
                            "\nPor favor, intenta nuevamente o selecciona una opción diferente.");
            }
            // ##################### FIN SWITCH
        } while (opcion != 0);


    }


    public static void imprimeMapaUsuarios() {
        DateTimeFormatter yMd = DateTimeFormatter.ofPattern("yyyy-MM-dd' T 'HH:mm:ss");
        System.out.println("----------------------------------------------------------------------------");
        for (Usuario user : mapaUsuarios.values()) {
            System.out.println("Utiles.Usuario -> " + user.getNombre() + " \t(Activo - " + user.isActivo() + ") \t\t Ingreso = " + user.getFechaIngreso().format(yMd));
        }
        System.out.println("----------------------------------------------------------------------------");
        Texto.pulsaTecla();
    }


}