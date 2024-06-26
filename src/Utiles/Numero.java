package Utiles;

import java.util.Random;
import java.util.UUID;

public class Numero {

    public static int generaInt(int min, int max) {
        // Metodo 1
        // Devuelve un número aleatorio entre 0 (inclusive) y el valor especificado (exclusivo).
        // Se suma 1 al Max para que sea inclusivo
        Random rand = new Random();
        return rand.nextInt((max + 1) - min) + min;
    }

    public static int generaInt2(int minimo, int maximo) {
        // Profesora
        //int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));
    }

    public static double generaDouble(int minimo, int maximo) {
        // Metodo 2
        // Esto generará un número aleatorio entre min (inclusive) y max (exclusivo).
        // Se suma 1 al Max para que sea inclusivo
        return (Math.random() * ((maximo + 1) - minimo)) + minimo;
    }

    /**
     * Un identificador único universal o universally unique identifier (UUID) es un número de 128 bits,
     * con lo que el número de posibles UUID diferentes sería de 2128, o unos 3,4 × 1038
     *
     * @return
     */
    public static UUID generaUuid() {
        UUID uuid = UUID.randomUUID();
        return uuid;
    }


}
