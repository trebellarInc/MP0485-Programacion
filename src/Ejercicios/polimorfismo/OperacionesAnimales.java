package Ejercicios.polimorfismo;

import java.util.ArrayList;

public class OperacionesAnimales {
    static Perro[] animalesPerro = new Perro[5];
    static Gato[] animalesGato = new Gato[5];

    public static void main(String[] args) {

        animalesPerro[0] = new Perro("Cooper", 8, true);
        animalesPerro[1] = new Perro("Golfo", 2, false);
        animalesPerro[2] = new Perro("Snoopy", 12, false);
        animalesPerro[3] = new Perro("Toto", 7, true);
        animalesPerro[4] = new Perro("Laika", 5, true);
        //animalesPerro[5]=new Perro("Desborde",1,false) ;

        animalesGato[0] = new Gato("Garfield", 3, true);
        animalesGato[1] = new Gato("Silvestre", 10, true);
        animalesGato[2] = new Gato("Kitty", 5, true);
        animalesGato[3] = new Gato("Cheshire", 201, false);
        animalesGato[4] = new Gato("Doraemon", 55, false);

        for (Perro p : animalesPerro) {
            System.out.println(p.toString() + " " + p.getTipo());
        }
        for (Gato g : animalesGato) {
            System.out.println(g.toString() + " " + g.getTipo());
        }
    }
}
