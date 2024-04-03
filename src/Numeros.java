import java.util.Random;

public class Numeros {

    public static int generaInt(int min, int max) {
        // Metodo 1
        // Devuelve un número aleatorio entre 0 (inclusive) y el valor especificado (exclusivo).
        // Se suma 1 al Max para que sea inclusivo
        Random rand = new Random();
        return rand.nextInt((max + 1) - min) + min;
    }

    public static double generaDouble(int min, int max) {
        // Metodo 2
        // Esto generará un número aleatorio entre min (inclusive) y max (exclusivo).
        // Se suma 1 al Max para que sea inclusivo
        return (Math.random() * ((max + 1) - min)) + min;
    }
}
