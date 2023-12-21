import java.time.LocalDate;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class Fechas {

    public static void main(String[] args) {
        LocalDate inicio = LocalDate.of(1982,1,1);
        LocalDate fin = LocalDate.of(1999,12,31);
        System.out.println(fechaEntre(inicio,fin));

    }

    public static LocalDate fechaEntre(LocalDate fechaInicio, LocalDate fechaFinal) {

        // Definir las fechas de inicio y fin
        //LocalDate inicio = LocalDate.of(fechaInicio);
        //LocalDate fin = LocalDate.of(fechaFinal);

        // Calcular la diferencia en días entre las dos fechas
        long diferenciaEnDias = fechaFinal.toEpochDay() - fechaInicio.toEpochDay();

        // Generar un número aleatorio de días dentro del rango
        long diasAleatorios = ThreadLocalRandom.current().nextLong(diferenciaEnDias + 1);

        // Crear la fecha aleatoria sumando los días aleatorios a la fecha de inicio
        LocalDate fechaAleatoria = fechaInicio.plusDays(diasAleatorios);

        // Imprimir la fecha aleatoria
        //System.out.println("Fecha aleatoria entre " + fechaInicio + " y " + fechaFinal + ": " + fechaAleatoria);

        // Retornar la fecha generadada entre las fechas dadas.
        return fechaAleatoria;

    }


}
