package Ejercicios.polimorfismo;


/**
 * Crea una clase Principal con un método main que haga uso de la clase anterior.
 *
 * @author Nacho Limetre (Trebellar Inc)
 */
public class Principal {
    public static void main(String[] args) {

/*
        OperacionesAnimales.addPerro(new Perro("Cooper", 12, true));
        OperacionesAnimales.addPerro(new Perro("Golfo", 2, false));
        OperacionesAnimales.addPerro(new Perro("Snoopy", 12, false));
        OperacionesAnimales.addPerro(new Perro("Toto", 7, true));
        System.out.println(OperacionesAnimales.addPerro(new Perro("Laika", 5, true)));
        System.out.println(OperacionesAnimales.addPerro(new Perro("Desborde", 1, false)));

        OperacionesAnimales.addGato(new Gato("Garfield", 3, true));
        OperacionesAnimales.addGato(new Gato("Silvestre", 10, true));
        OperacionesAnimales.addGato(new Gato("Kitty", 5, true));
        OperacionesAnimales.addGato(new Gato("Cheshire", 201, false));
        System.out.println(OperacionesAnimales.addGato(new Gato("Doraemon", 55, false)));
        System.out.println(OperacionesAnimales.addGato(new Gato("Desborde", 1, false)));


        OperacionesAnimales.guardarAnimalesADisco("datos.txt");

*/

        OperacionesAnimales.leerAnimalesDisco("datos.txt");


        OperacionesAnimales.muestraGatos();
        OperacionesAnimales.muestraPerros();

    }
}
