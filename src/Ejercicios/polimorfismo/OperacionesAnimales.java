package Ejercicios.polimorfismo;


import java.io.*;

/**
 * Dicha clase podrá guardar información sobre cinco perros y cinco gatos.
 * Debes hacer uso de arrays estáticos de tamaño 5.
 */
public class OperacionesAnimales {
    static int MAXIMONumeroAnimales = 5;
    static Perro[] animalesPerro = new Perro[MAXIMONumeroAnimales];
    static Gato[] animalesGato = new Gato[MAXIMONumeroAnimales];


    /**
     * Dispondrá de un método addPerro(Perro perro) que permitirá añadir un perro (de los cinco posibles).
     * Necesitarás un contador que te indique en qué posición del array debes de añadir el perro nuevo.
     * Dicho método devolverá un boolean indicando si se añadió correctamente el perro.
     * Si intentamos añadir un nuevo perro y el array está ocupado, devolverá false.
     */
    public static boolean addPerro(Perro perro) {
        boolean retorno = false;
        boolean arrayLleno = false;

        // System.out.println("Perro a añadir -> " + perro.toString());
        int i = 0;

        while (arrayLleno == false && !retorno) {
            if (animalesPerro[i] == null) {
                animalesPerro[i] = perro;
                System.out.println("Se añade - " + animalesPerro[i] + " - [" + i + "]");
                retorno = true;
            }
            i++;
            if (i == (MAXIMONumeroAnimales)) {
                //System.out.println("El array esta lleno. " + i + " de " + MAXIMONumeroAnimales);
                arrayLleno = true;
            }
        }
        return retorno;
    }

    public static boolean addGato(Gato gato) {
        boolean retorno = false;
        boolean arrayLleno = false;

        // System.out.println("Perro a añadir -> " + perro.toString());
        int i = 0;

        while (arrayLleno == false && !retorno) {
            if (animalesGato[i] == null) {
                animalesGato[i] = gato;
                System.out.println("Se añade - " + animalesGato[i] + " - [" + i + "]");
                retorno = true;
            }
            i++;
            if (i == (MAXIMONumeroAnimales)) {
                //System.out.println("El array esta lleno. " + i + " de " + MAXIMONumeroAnimales);
                arrayLleno = true;
            }
        }
        return retorno;
    }

    /**
     * Dispondrá de un método guardarAnimalesADisco(String fichero) en el que se guardarán
     * todos los objetos que se encuentren en los dos arrays (perros / gatos). Como no
     * sabemos crear arrays dinámicos, escribiremos en el fichero, antes de los objetos, el
     * número de objetos total que vamos a escribir.
     */

    public static void guardarAnimalesADisco(String fichero) {
        File archivoDatos = new File(fichero);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        int animales = 0;
        for (Gato g : animalesGato) {
            animales++;
            System.out.println(animales + " - " + g.toString());
        }
        for (Perro p : animalesPerro) {
            animales++;
            System.out.println(animales + " - " + p.toString());
        }
        NumeroAnimales numAnimales = new NumeroAnimales(animales);

        try {
            fos = new FileOutputStream(archivoDatos);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(numAnimales);
            for (Gato g : animalesGato) {
                oos.writeObject(g);
            }
            for (Perro p : animalesPerro) {
                oos.writeObject(p);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * • Dispondrá de un método leerAnimalesDisco(String fichero) que leerá de disco los
     * objetos guardados del paso anterior. Primero leeremos el número de animales
     * guardados en disco para dar memoria al array que debe devolver el método. Después
     * leeremos todos los animales que se irán guardando en el array que tenemos que
     * devolver. Se actualizarán los datos de la clase (los arrays que guardan los gatos y los
     * perros).
     */

    public static void leerAnimalesDisco(String fichero) {
        animalesPerro = new Perro[MAXIMONumeroAnimales];
        animalesGato = new Gato[MAXIMONumeroAnimales];
        int numPerro = 0, numGato = 0;

        File archivoDatos = new File(fichero);

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        NumeroAnimales animales = null;
        animales = new NumeroAnimales(0);


        try {
            fis = new FileInputStream(archivoDatos);
            ois = new ObjectInputStream(fis);

            // Numero de objetos de animales en el fichero la suma de gatos y perros.
            animales = (NumeroAnimales) ois.readObject();
            System.out.println("Hay " + animales.getAnimales() + " animales en el fichero");

            // Se crea un array de animales con los objetos del fichero
            Animal[] listaAnimales = new Animal[animales.getAnimales()];

            // Animal aux =null;

            for (int i = 0; i < animales.getAnimales(); i++) {
                listaAnimales[i] = (Animal) ois.readObject();
                // System.out.println(listaAnimales[i].toString());
                // System.out.println(listaAnimales[i].getClass().getName().toLowerCase());
                if (listaAnimales[i].getClass().getName().toLowerCase().contains("perro")) {
                    animalesPerro[numPerro] = (Perro) listaAnimales[i];
                    numPerro++;
                }
                if (listaAnimales[i].getClass().getName().toLowerCase().contains("gato")) {
                    animalesGato[numGato] = (Gato) listaAnimales[i];
                    numGato++;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }



    public static void muestraGatos (){
        for (Gato g :animalesGato){
            System.out.println(g.toString());
        }
    }
    public static void muestraPerros (){
        for (Perro g :animalesPerro){
            System.out.println(g.toString());
        }
    }

}
