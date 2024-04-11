import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Usuario> mapaUsuarios = new HashMap<>();
        HashMap<Integer, Piloto> mapaPilotos = new HashMap<>();






        /**
         * Carga usuarios de ejemplo en el mapa de usuarios.
         * El indice sera el nombre de usuario y sera unico e inmutable por eso no tiene la clase la opcion set.
         * Luego se guarda el objeto de usuario en el mapa.
         */
        Conexion_Datos.cargaUsuariosTest(mapaUsuarios);

        Conexion_Datos.cargaPilotos(mapaPilotos);

        System.out.println(mapaUsuarios);
        System.out.println(mapaPilotos);

        String userIntroducido = "nacho";
        String passIntroducido = "qweads";


        if (mapaUsuarios.containsKey(userIntroducido)) {
            System.out.print("El código " + userIntroducido + " corresponde a ");
            System.out.println(mapaUsuarios.get(userIntroducido));
            if (mapaUsuarios.get(userIntroducido).getPasswd().equals(Cifrado.md5(passIntroducido))) {
                if (mapaUsuarios.get(userIntroducido).isActivo() == true) {
                    System.out.println("Acceso correcto");
                } else {
                    System.out.println("Acceso denegado - usuario no activo");
                }
            } else {
                System.out.println("Acceso denegado - clave incorrecta");
            }
        } else {
            System.out.print("Acceso denegado - el usuario "+userIntroducido+" no existe.");
        }






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
            System.out.println(Fechas.fechaEntre(inicio, fin));
        }
*/
        /*

        String dniTest1 = "44083909v";
        String dniTest2 = "44083910V";
        String dniTest3 = "12345678Z";
        System.out.println(Id_Esp.esValidoDNI(dniTest1));
        System.out.println(Id_Esp.esValidoDNI(dniTest2));
        System.out.println(Id_Esp.esValidoDNI(dniTest3));
         */

/*
        System.out.println(Personas_Aleatorias.nombre());
        System.out.println(Personas_Aleatorias.apellido());
        System.out.println(Personas_Aleatorias.apellido());

        System.out.println(Id_Esp.generaDNI(10000000, 48100999));
        System.out.println(Fechas.fechaEntre(LocalDate.of(1950, 1, 1), LocalDate.of(2019, 12, 31)));
    */


    }
}