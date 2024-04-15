import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class Conexion_Datos {

    /**
     * Carga usuarios de ejemplo en el mapa de usuarios.
     * El indice sera el nombre de usuario y sera unico e inmutable por eso no tiene la clase la opcion set.
     * Luego se guarda el objeto de usuario en el mapa.
     */
    public static void cargaUsuariosTest(HashMap<String, Usuario> mapa) {
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

        System.out.println("Carga de usuarios");
    }

    /**
     * Carga pilotos de formula 1 de 2024 - Abril en el mapa de pilotos.
     * El indice sera el dorsal de este piloto y sera unico e inmutable por eso no tiene la clase la opcion set.
     * Luego se guarda el objeto de piloto en el mapa.
     */
    public static void cargaPilotos(HashMap<Integer, Piloto> mapa) {
        DateTimeFormatter yMd = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        Piloto pilotos1 = new Piloto(1,
                "Max Verstappen",
                "Red Bull Racing",
                LocalDate.parse("1997/09/30", yMd),
                26,
                "Países Bajos - Holanda");
        Piloto pilotos2 = new Piloto(2, "Logan Sargeant", "Williams", LocalDate.parse("2000/12/31", yMd), 23, "Estados Unidos");
        Piloto pilotos3 = new Piloto(3, "Daniel Ricciardo", "Visa CashApp RB", LocalDate.parse("1989/07/01", yMd), 34, "Australia");
        Piloto pilotos4 = new Piloto(4, "Lando Norris", "McLaren F1", LocalDate.parse("1999/11/13", yMd), 24, "Reino Unido");
        Piloto pilotos5 = new Piloto(10, "Pierre Gasly", "Alpine", LocalDate.parse("1996/02/07", yMd), 28, "Francia");
        Piloto pilotos6 = new Piloto(11, "Sergio Pérez", "Red Bull Racing", LocalDate.parse("1990/01/26", yMd), 34, "México");
        Piloto pilotos7 = new Piloto(14, "Fernando Alonso", "Aston Martin Racing", LocalDate.parse("1981/07/29", yMd), 42, "España");
        Piloto pilotos8 = new Piloto(16, "Charles Leclerc", "Ferrari", LocalDate.parse("1997/10/16", yMd), 26, "Mónaco");
        Piloto pilotos9 = new Piloto(18, "Lance Stroll", "Aston Martin Racing", LocalDate.parse("1998/10/29", yMd), 25, "Canadá");
        Piloto pilotos10 = new Piloto(20, "Kevin Magnussen", "Haas F1 Team", LocalDate.parse("1992/10/05", yMd), 31, "Dinamarca");
        Piloto pilotos11 = new Piloto(22, "Yuki Tsunoda", "Visa CashApp RB", LocalDate.parse("2000/05/11", yMd), 23, "Japón");
        Piloto pilotos12 = new Piloto(23, "Alexander Albon", "Williams", LocalDate.parse("1996/03/23", yMd), 28, "Tailandia");
        Piloto pilotos13 = new Piloto(24, "Guanyu Zhou", "Sauber F1 Team", LocalDate.parse("1999/05/30", yMd), 24, "China");
        Piloto pilotos14 = new Piloto(27, "Nico Hulkenberg", "Haas F1 Team", LocalDate.parse("1987/08/19", yMd), 36, "Alemania");
        Piloto pilotos15 = new Piloto(31, "Esteban Ocon", "Alpine", LocalDate.parse("1996/09/17", yMd), 27, "Francia");
        Piloto pilotos16 = new Piloto(38, "Oliver Bearman", "Ferrari", LocalDate.parse("2005/05/08", yMd), 18, "Reino Unido");
        Piloto pilotos17 = new Piloto(44, "Lewis Hamilton", "Mercedes", LocalDate.parse("1985/01/07", yMd), 39, "Reino Unido");
        Piloto pilotos18 = new Piloto(55, "Carlos Sainz", "Ferrari", LocalDate.parse("1994/09/01", yMd), 29, "España");
        Piloto pilotos19 = new Piloto(63, "George Russell", "Mercedes", LocalDate.parse("1998/02/15", yMd), 26, "Reino Unido");
        Piloto pilotos20 = new Piloto(77, "Valtteri Bottas", "Sauber F1 Team", LocalDate.parse("1989/08/28", yMd), 34, "Finlandia");
        Piloto pilotos21 = new Piloto(81, "Oscar Piastri", "McLaren F1", LocalDate.parse("2001/04/06", yMd), 23, "Australia");

        mapa.put(pilotos1.getDorsal(), pilotos1);
        mapa.put(pilotos2.getDorsal(), pilotos2);
        mapa.put(pilotos3.getDorsal(), pilotos3);
        mapa.put(pilotos4.getDorsal(), pilotos4);
        mapa.put(pilotos5.getDorsal(), pilotos5);
        mapa.put(pilotos6.getDorsal(), pilotos6);
        mapa.put(pilotos7.getDorsal(), pilotos7);
        mapa.put(pilotos8.getDorsal(), pilotos8);
        mapa.put(pilotos9.getDorsal(), pilotos9);
        mapa.put(pilotos10.getDorsal(), pilotos10);
        mapa.put(pilotos11.getDorsal(), pilotos11);
        mapa.put(pilotos12.getDorsal(), pilotos12);
        mapa.put(pilotos13.getDorsal(), pilotos13);
        mapa.put(pilotos14.getDorsal(), pilotos14);
        mapa.put(pilotos15.getDorsal(), pilotos15);
        mapa.put(pilotos16.getDorsal(), pilotos16);
        mapa.put(pilotos17.getDorsal(), pilotos17);
        mapa.put(pilotos18.getDorsal(), pilotos17);
        mapa.put(pilotos19.getDorsal(), pilotos19);
        mapa.put(pilotos20.getDorsal(), pilotos20);
        mapa.put(pilotos21.getDorsal(), pilotos21);
        System.out.println("Carga de pilotos");
    }
}