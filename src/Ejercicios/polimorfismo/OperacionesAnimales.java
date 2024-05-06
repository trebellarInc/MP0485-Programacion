package Ejercicios.polimorfismo;



/**
 * Dicha clase podrá guardar información sobre cinco perros y cinco gatos.
 * Debes hacer uso de arrays estáticos de tamaño 5.
 */
public class OperacionesAnimales {
    static int MAXIMONumeroAnimales = 5;
    static Perro[] animalesPerro = new Perro[MAXIMONumeroAnimales];
    static Gato[] animalesGato = new Gato[MAXIMONumeroAnimales];

    public static void main(String[] args) {

        System.out.println(animalesPerro.length);

        addPerro(new Perro("Cooper", 8, true));
        addPerro(new Perro("Golfo", 2, false));
        addPerro(new Perro("Snoopy", 12, false));
        addPerro(new Perro("Toto", 7, true));
        addPerro(new Perro("Laika", 5, true));
        addPerro(new Perro("Desborde", 1, false));

        /*
        animalesGato[0] = new Gato("Garfield", 3, true);
        animalesGato[1] = new Gato("Silvestre", 10, true);
        animalesGato[2] = new Gato("Kitty", 5, true);
        animalesGato[3] = new Gato("Cheshire", 201, false);
        animalesGato[4] = new Gato("Doraemon", 55, false);
         */


        for (Perro p : animalesPerro) {

            if (p == null) {
                System.out.println("no hay perros");
            }

            // System.out.println(p.toString() + " " + p.getTipo());
        }

        /*
        for (Gato g : animalesGato) {
            System.out.println(g.toString() + " " + g.getTipo());
        }
        */


        System.out.println("Tamaño del array de Perros -> " + animalesPerro.length);
        System.out.println("Tamaño del array de Gatos -> " + animalesGato.length);

    }

    /**
     * Dispondrá de un método addPerro(Perro perro) que permitirá añadir un perro (de los cinco posibles).
     * Necesitarás un contador que te indique en qué posición del array debes de añadir el perro nuevo.
     * Dicho método devolverá un boolean indicando si se añadió correctamente el perro.
     * Si intentamos añadir un nuevo perro y el array está ocupado, devolverá false.
     */
    public static boolean addPerro(Perro perro) {
        boolean retorno = false;
        int i = 0;
        for (Perro p : animalesPerro) {
            if (p == null && retorno == false) {
                System.out.println("no hay perros y se añade en la posicion -> " + i);
                animalesPerro[i] = perro;
                System.out.println(animalesPerro[i].toString());
                retorno = true;
            }
            i++;
            if (i == (MAXIMONumeroAnimales - 1)){
                System.err.println("No se puede añadir mas" + i);
            }
        }


    }

}
