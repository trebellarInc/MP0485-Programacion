package Prog3Eval;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.TreeMap;

public class TestArrayBusquedas {
    static ArrayList<Docente> listaDocentes = new ArrayList<>();

    static TreeMap <String, Docente> listaDocentesTree = new TreeMap<>();

    public static void main(String[] args) {


        cargaDocentes();
        for (Docente d: listaDocentes
             ) {

           System.out.println(d.toString());
            listaDocentesTree.put(d.getDni(),d);
        }
        System.out.println("----------------");
        //System.out.println(listaDocentesTree);

        String respuesta = JOptionPane.showInputDialog("Indica nombre a buscar ?", "");


        for (String tm : listaDocentesTree.keySet()){
            if(listaDocentesTree.get(tm).Nombre.contains(respuesta.toUpperCase())){
            System.out.println(listaDocentesTree.get(tm));
            }

        }




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
}
