package Prog3Eval;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;

public class PersonaOperaciones {
    /**
     * Se añaden 50 alumnos a la lista de alumnos a distancia.
     * Se añaden 100 alumnos a la lista de alumnos presencial 50 de 1 y 50 de segundo.
     */
    static ArrayList<AlumnoPresencial> listaAlumnosPresencial = new ArrayList<>();
    static ArrayList<AlumnoDistancia> listaAlumnosDistancia = new ArrayList<>();

    static ArrayList<Docente> listaDocentes = new ArrayList<>();

    public static void cargaAlumnos() {
        listaAlumnosDistancia.add(new AlumnoDistancia("40100001F", LocalDate.of(1981, 3, 22), "MARIA DOLORES", "MARTIN ", "NAVARRO"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100002P", LocalDate.of(1971, 2, 6), "ELENA", "FERNANDEZ", "PEREZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100003D", LocalDate.of(2003, 1, 24), "LUIS ", "GOMEZ", "GONZALEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100004X", LocalDate.of(1986, 5, 5), "MANUEL", "MARTIN", "NIETO"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100005B", LocalDate.of(1997, 6, 6), "FRANCISCO", "TORRES ", "ALVAREZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100006N", LocalDate.of(1976, 1, 27), "RUBEN ", "SANZ", "GUERRERO"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100007J", LocalDate.of(1986, 6, 11), "DOLORES", "MARTIN", "LOPEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100008Z", LocalDate.of(1995, 6, 17), "ANGELES", "RUIZ ", "ORTEGA"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100009S", LocalDate.of(1998, 2, 28), "EMILIO", "GONZALEZ", "PEREZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100010Q", LocalDate.of(2006, 7, 13), "ALEJANDRO", "GARCIA ", "CALVO"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100011V", LocalDate.of(2006, 2, 22), "MONTSERRAT", "DURAN ", "MARTINEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100012H", LocalDate.of(1973, 1, 14), "VICTOR", "MUÑOZ ", "MARTINEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100013L", LocalDate.of(1986, 1, 29), "DANIEL", "GARCIA", "HERNANDEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100014C", LocalDate.of(1981, 9, 20), "JESUS ", "MARTINEZ", "HERRERA"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100015K", LocalDate.of(1995, 6, 27), "ALBA", "FERNANDEZ", "RODRIGUEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100016E", LocalDate.of(1982, 1, 19), "MARIA JOSEFA", "RAMOS", "MARTIN"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100017T", LocalDate.of(2008, 8, 8), "XAVIER", "LOPEZ ", "GONZALEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100018R", LocalDate.of(1993, 5, 2), "CARMEN", "MARQUEZ", "VAZQUEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100019W", LocalDate.of(2009, 1, 22), "MARIA MAR", "GARCIA ", "RAMIREZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100020A", LocalDate.of(1993, 3, 10), "RAFAEL", "LOPEZ ", "CAMPOS"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100021G", LocalDate.of(1990, 9, 30), "ISMAEL", "MARTINEZ", "PEREZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100022M", LocalDate.of(1991, 11, 23), "JUAN CARLOS ", "GUTIERREZ", "LOPEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100023Y", LocalDate.of(1979, 11, 3), "MARIA ", "TORRES ", "MORENO"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100024F", LocalDate.of(1975, 9, 20), "MARTA ", "CANO", "MEDINA"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100025P", LocalDate.of(1987, 1, 11), "TERESA", "GOMEZ ", "RUIZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100026D", LocalDate.of(1970, 6, 21), "MARIA", "TORRES", "PEREZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100027X", LocalDate.of(1971, 11, 12), "MARIA PILAR ", "SANCHEZ ", "PRIETO"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100028B", LocalDate.of(1991, 10, 14), "JESUS ", "GARCIA ", "HERRERA"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100029N", LocalDate.of(1990, 2, 2), "JOSE ANTONIO", "GIL ", "PEREZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100030J", LocalDate.of(1983, 7, 7), "JUAN CARLOS ", "DURAN", "RAMOS"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100031Z", LocalDate.of(1985, 2, 19), "RAFAEL", "LOPEZ ", "PEREZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100032S", LocalDate.of(1991, 4, 17), "ANGEL ", "MORENO ", "PEREZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100033Q", LocalDate.of(2002, 4, 27), "ANTONIO", "GARCIA", "ORTEGA"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100034V", LocalDate.of(1989, 4, 22), "CARLA", "GONZALEZ", "MOLINA"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100035H", LocalDate.of(1997, 1, 3), "MARIA MAR", "LOPEZ", "FLORES"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100036L", LocalDate.of(2008, 7, 25), "ANA MARIA", "FERNANDEZ", "RUIZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100037C", LocalDate.of(1996, 10, 1), "SUSANA", "HIDALGO", "GONZALEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100038K", LocalDate.of(1971, 11, 5), "MARTA ", "LOPEZ", "MARTINEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100039E", LocalDate.of(1972, 7, 27), "JULIA ", "MARTIN ", "MUÑOZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100040T", LocalDate.of(1975, 11, 26), "VICTORIA ", "DIAZ ", "MORENO"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100041R", LocalDate.of(1998, 1, 20), "RAUL", "HERNANDEZ", "MARTINEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100042W", LocalDate.of(1972, 2, 8), "DAVID ", "ALONSO ", "MARTIN"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100043A", LocalDate.of(1973, 5, 19), "JOSE", "GONZALEZ ", "SERRANO"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100044G", LocalDate.of(1998, 6, 28), "MARIA CARMEN", "IBAÑEZ", "LOPEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100045M", LocalDate.of(2000, 8, 19), "BEATRIZ", "HERNANDEZ", "GARRIDO"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100046Y", LocalDate.of(1972, 11, 20), "JUAN MANUEL ", "GONZALEZ ", "MARTINEZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100047F", LocalDate.of(1972, 3, 25), "ALEJANDRO", "GOMEZ", "MUÑOZ"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100048P", LocalDate.of(1973, 12, 30), "JOSE MARIA", "DIAZ", "GARCIA"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100049D", LocalDate.of(1972, 2, 8), "ANTONIO", "MARTIN", "GARCIA"));
        listaAlumnosDistancia.add(new AlumnoDistancia("40100050X", LocalDate.of(1984, 8, 20), "DAVID ", "GONZALEZ", "GARCIA"));

        listaAlumnosPresencial.add(new AlumnoPresencial("40200001A", LocalDate.of(2006, 4, 14), "MARIA CARMEN", "PEREZ", "CORTES"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200002G", LocalDate.of(2006, 3, 11), "JOSE ANTONIO", "MARTINEZ", "RUBIO"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200003M", LocalDate.of(2006, 7, 6), "ALFONSO", "GONZALEZ", "LOPEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200004Y", LocalDate.of(2006, 8, 27), "RAFAEL", "LOPEZ", "MORENO"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200005F", LocalDate.of(2006, 2, 17), "MARIA ROSA ", "MARTIN", "ALVAREZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200006P", LocalDate.of(2006, 6, 8), "CARLOS", "RUIZ", "GARCIA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200007D", LocalDate.of(2006, 8, 25), "CARMEN", "GONZALEZ", "FERNANDEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200008X", LocalDate.of(2006, 7, 18), "FRANCISCO JAVIER ", "GUTIERREZ", "ALVAREZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200009B", LocalDate.of(2006, 1, 28), "ENCARNACION ", "LOPEZ", "HERRERA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200010N", LocalDate.of(2006, 9, 13), "LUIS", "GIL", "GARCIA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200011J", LocalDate.of(2006, 1, 31), "ENCARNACION ", "ORTEGA", "PEREZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200012Z", LocalDate.of(2006, 9, 25), "SEBASTIAN ", "MONTERO", "LOPEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200013S", LocalDate.of(2006, 12, 30), "CLAUDIA", "ALVAREZ", "RODRIGUEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200014Q", LocalDate.of(2006, 6, 4), "MANUEL", "GONZALEZ", "MARTIN"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200015V", LocalDate.of(2006, 6, 25), "CARLA", "RODRIGUEZ", "JIMENEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200016H", LocalDate.of(2006, 11, 15), "MARIA CARMEN", "GONZALEZ", "LOPEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200017L", LocalDate.of(2006, 5, 4), "ELENA", "GARCIA", "DIAZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200018C", LocalDate.of(2006, 9, 22), "NICOLAS", "PEREZ", "GARCIA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200019K", LocalDate.of(2006, 12, 5), "DAVID", "JIMENEZ", "GIL"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200020E", LocalDate.of(2006, 12, 13), "IGNACIO", "REYES", "ALVAREZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200021T", LocalDate.of(2006, 9, 11), "ALICIA", "MENDEZ", "GARCIA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200022R", LocalDate.of(2006, 3, 27), "LUIS", "FERNANDEZ", "MARTINEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200023W", LocalDate.of(2006, 8, 13), "HUGO", "ALVAREZ", "SANCHEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200024A", LocalDate.of(2006, 10, 27), "ESTHER", "LOPEZ", "BLANCO"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200025G", LocalDate.of(2006, 7, 15), "SANDRA", "VICENTE", "RUIZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200026M", LocalDate.of(2006, 1, 25), "JESUS", "GARCIA", "BENITEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200027Y", LocalDate.of(2006, 7, 30), "FRANCISCO JOSE", "GONZALEZ", "AGUILAR"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200028F", LocalDate.of(2006, 5, 22), "NEREA", "FERNANDEZ", "SANCHEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200029P", LocalDate.of(2006, 11, 29), "RAFAEL", "ALONSO", "CABRERA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200030D", LocalDate.of(2006, 3, 25), "ANTONIA", "SANZ", "FERNANDEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200031X", LocalDate.of(2006, 2, 18), "OSCAR", "RODRIGUEZ", "ORTEGA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200032B", LocalDate.of(2006, 3, 3), "MARIA CARMEN", "LOPEZ", "SANCHEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200033N", LocalDate.of(2006, 10, 22), "NEREA", "LEON", "LOPEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200034J", LocalDate.of(2006, 2, 7), "ROSARIO", "NIETO", "SANCHEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200035Z", LocalDate.of(2006, 6, 16), "JUAN ANTONIO", "FERNANDEZ", "SANCHEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200036S", LocalDate.of(2006, 6, 16), "JUAN ANTONIO", "MUÑOZ", "DELGADO"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200037Q", LocalDate.of(2006, 12, 2), "JOSE", "LOPEZ", "MORENO"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200038V", LocalDate.of(2006, 9, 11), "MARIA DOLORES", "HERNANDEZ", "MARTINEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200039H", LocalDate.of(2006, 4, 15), "HECTOR", "SANTANA", "LOPEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200040L", LocalDate.of(2006, 3, 27), "JOSE RAMON ", "LOZANO", "MARTINEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200041C", LocalDate.of(2006, 7, 21), "MANUEL", "LORENZO", "VIDAL"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200042K", LocalDate.of(2006, 7, 17), "MARIA DOLORES", "LOPEZ", "MENDEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200043E", LocalDate.of(2006, 12, 22), "IKER", "MUÑOZ", "TORRES"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200044T", LocalDate.of(2006, 11, 23), "ALVARO", "GARCIA", "RODRIGUEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200045R", LocalDate.of(2006, 11, 3), "ANGELES", "CASTILLO", "GARCIA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200046W", LocalDate.of(2006, 2, 1), "CAROLINA ", "LOPEZ", "JIMENEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200047A", LocalDate.of(2006, 6, 3), "ANTONIO", "GUTIERREZ", "FERNANDEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200048G", LocalDate.of(2006, 11, 22), "JOSE MANUEL ", "GOMEZ", "GONZALEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200049M", LocalDate.of(2006, 10, 17), "JOSE", "MORENO", "MORENO"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200050Y", LocalDate.of(2006, 2, 26), "ALFREDO", "RAMIREZ", "GARCIA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200101B", LocalDate.of(2005, 12, 22), "CLARA", "MORENO", "RUIZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200102N", LocalDate.of(2005, 7, 31), "NEREA", "MARTINEZ", "MARQUEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200103J", LocalDate.of(2005, 3, 29), "VERONICA ", "GONZALEZ", "CASTRO"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200104Z", LocalDate.of(2005, 2, 16), "VICENTE", "MARTINEZ", "RUIZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200105S", LocalDate.of(2005, 7, 13), "MARIA PILAR ", "MARTINEZ", "GONZALEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200106Q", LocalDate.of(2005, 2, 21), "JOSE IGNACIO", "GARRIDO", "GARCIA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200107V", LocalDate.of(2005, 2, 10), "MARIA ANGELES", "ROMERO", "BENITEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200108H", LocalDate.of(2005, 7, 29), "DAVID", "VICENTE", "FERNANDEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200109L", LocalDate.of(2005, 1, 28), "INMACULADA ", "MUÑOZ", "GOMEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200110C", LocalDate.of(2005, 1, 25), "ANTONIA", "GOMEZ", "FERNANDEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200111K", LocalDate.of(2005, 2, 8), "JULIA", "MARTINEZ", "GARCIA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200112E", LocalDate.of(2005, 5, 18), "PABLO", "RAMIREZ", "LOPEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200113T", LocalDate.of(2005, 4, 2), "PAULA", "HERNANDEZ", "GALLARDO"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200114R", LocalDate.of(2005, 8, 22), "MERCEDES ", "AGUILAR", "RUIZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200115W", LocalDate.of(2005, 11, 24), "CRISTINA ", "GARCIA", "MUÑOZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200116A", LocalDate.of(2005, 10, 9), "ALFONSO", "JIMENEZ", "GARCIA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200117G", LocalDate.of(2005, 4, 1), "MARINA", "GONZALEZ", "MARTIN"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200118M", LocalDate.of(2005, 10, 12), "NURIA", "LOPEZ", "PEREZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200119Y", LocalDate.of(2005, 9, 12), "INMACULADA ", "LOPEZ", "RUIZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200120F", LocalDate.of(2005, 11, 16), "MANUEL", "GARCIA", "PEREZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200121P", LocalDate.of(2005, 10, 2), "IKER", "BLANCO", "FERNANDEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200122D", LocalDate.of(2005, 11, 24), "JOSE LUIS ", "CASTRO", "SANTOS"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200123X", LocalDate.of(2005, 1, 30), "MARIA CARMEN", "GONZALEZ", "GARCIA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200124B", LocalDate.of(2005, 3, 17), "ANTONIO", "PARRA", "GONZALEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200125N", LocalDate.of(2005, 5, 16), "JOSE", "LOPEZ", "SUAREZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200126J", LocalDate.of(2005, 8, 2), "JULIAN", "JIMENEZ", "LOPEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200127Z", LocalDate.of(2005, 2, 7), "ISABEL", "FERRER", "VAZQUEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200128S", LocalDate.of(2005, 8, 4), "ISMAEL", "MARTIN", "SANTOS"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200129Q", LocalDate.of(2005, 7, 3), "ANGEL", "PRIETO", "SUAREZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200130V", LocalDate.of(2005, 6, 27), "MANUELA", "GOMEZ", "MUÑOZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200131H", LocalDate.of(2005, 4, 22), "TERESA", "DIAZ", "RODRIGUEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200132L", LocalDate.of(2005, 5, 3), "ANA MARIA ", "PEREZ", "MOLINA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200133C", LocalDate.of(2005, 4, 4), "JAVIER", "GOMEZ", "SANZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200134K", LocalDate.of(2005, 9, 24), "PILAR", "GARCIA", "LOPEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200135E", LocalDate.of(2005, 4, 29), "ELENA", "JIMENEZ", "RODRIGUEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200136T", LocalDate.of(2005, 11, 07), "DANIEL", "IBAÑEZ", "GARCIA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200137R", LocalDate.of(2005, 9, 14), "JESUS", "SANCHEZ", "GONZALEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200138W", LocalDate.of(2005, 1, 15), "DOLORES", "ALONSO", "SANTIAGO"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200139A", LocalDate.of(2005, 4, 26), "DANIEL", "RUIZ", "ALVAREZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200140G", LocalDate.of(2005, 11, 6), "JUAN", "MARTINEZ", "RAMIREZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200141M", LocalDate.of(2005, 7, 6), "PAULA", "RODRIGUEZ", "SANCHEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200142Y", LocalDate.of(2005, 5, 29), "MARTA", "ROMAN", "MARTINEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200143F", LocalDate.of(2005, 4, 12), "BEATRIZ", "RAMOS", "JIMENEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200144P", LocalDate.of(2005, 9, 13), "ENRIQUE", "GONZALEZ", "RAMIREZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200145D", LocalDate.of(2005, 1, 16), "MANUEL", "GARCIA", "MARIN"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200146X", LocalDate.of(2005, 11, 5), "XAVIER", "GARCIA", "GONZALEZ"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200147B", LocalDate.of(2005, 4, 25), "RAUL", "FERNANDEZ", "GARCIA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200148N", LocalDate.of(2005, 9, 28), "MANUEL", "LOPEZ", "GARCIA"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200149J", LocalDate.of(2005, 1, 30), "JOSE LUIS ", "PEREZ", "RAMOS"));
        listaAlumnosPresencial.add(new AlumnoPresencial("40200150Z", LocalDate.of(2005, 12, 7), "MARIA", "ORTIZ", "DIAZ"));
    }

    public static void cargaDocentes() {
        listaDocentes.add(new Docente("40500001Z", LocalDate.of(2000, 1, 19), "MARIA PILAR", "GONZALEZ", "DIAZ"));
        listaDocentes.add(new Docente("40500002S", LocalDate.of(1988, 11, 13), "MARIA CRISTINA", "MARTINEZ", "NAVARRO"));
        listaDocentes.add(new Docente("40500003Q", LocalDate.of(1986, 8, 23), "MARIA JOSE", "ALVAREZ", "GARCIA"));
        listaDocentes.add(new Docente("40500004V", LocalDate.of(1975, 10, 9), "MARIA CARMEN", "JIMENEZ", "SANCHEZ"));
        listaDocentes.add(new Docente("40500005H", LocalDate.of(1966, 12, 23), "DIEGO", "VEGA", "MARTINEZ"));
        listaDocentes.add(new Docente("40500006L", LocalDate.of(2000, 7, 6), "NURIA", "NIETO", "MONTERO"));
        listaDocentes.add(new Docente("40500007C", LocalDate.of(1988, 5, 24), "MIGUEL ANGEL", "ALONSO", "RODRIGUEZ"));
        listaDocentes.add(new Docente("40500008K", LocalDate.of(1984, 1, 30), "DAVID", "CABRERA", "BENITEZ"));
        listaDocentes.add(new Docente("40500009E", LocalDate.of(1999, 1, 29), "FRANCISCO", "JIMENEZ", "CRUZ"));
        listaDocentes.add(new Docente("40500010T", LocalDate.of(1984, 5, 23), "LAURA", "RODRIGUEZ", "ALONSO"));
        listaDocentes.add(new Docente("40500011R", LocalDate.of(1966, 4, 14), "GUILLERMO", "GARCIA", "ALVAREZ"));
        listaDocentes.add(new Docente("40500012W", LocalDate.of(1989, 3, 20), "OSCAR", "PEREZ", "NAVARRO"));
        listaDocentes.add(new Docente("40500013A", LocalDate.of(1965, 9, 12), "JOSE", "NUÑEZ", "MARTIN"));
        listaDocentes.add(new Docente("40500014G", LocalDate.of(1983, 4, 30), "ALEJANDRO", "PEREZ", "GONZALEZ"));
        listaDocentes.add(new Docente("40500015M", LocalDate.of(1994, 3, 8), "MARTINA", "CALVO", "GONZALEZ"));
        listaDocentes.add(new Docente("40500016Y", LocalDate.of(1969, 10, 30), "ANTONIA", "RUIZ", "ALONSO"));
        listaDocentes.add(new Docente("40500017F", LocalDate.of(1978, 7, 19), "JOSE ANTONIO", "GONZALEZ", "CASTRO"));
        listaDocentes.add(new Docente("40500018P", LocalDate.of(1995, 8, 9), "MARIA ISABEL", "GIL ", " JIMENEZ"));
        listaDocentes.add(new Docente("40500019D", LocalDate.of(1976, 7, 12), "MANUEL", "ARIAS", "GARCIA"));
        listaDocentes.add(new Docente("40500020X", LocalDate.of(1981, 11, 25), "PEDRO", "NUÑEZ", "MARTIN"));


    }

    public static void mostrarAlumnos() {
        System.out.println("Alumnos en modalidad de prensencial:\n\n");
        for (AlumnoPresencial a : listaAlumnosPresencial) {
            System.out.println(a.toString());
        }

        System.out.println("Alumnos en modalidad de distancia:\n\n");
        for (AlumnoDistancia a : listaAlumnosDistancia) {
            System.out.println(a.toString());
        }

    }
    public static void mostrarDocentes(){
        System.out.println("Muestra los doncentes: ");
        for (Docente d : listaDocentes
             ) {
            System.out.println(d.toString());

        }

    }



}
