package Utiles;

import Prog3Eval.rev.Captura;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Fechas {

    private static int dia;

    public static void main(String[] args) {
        /*
        // Test del metodo FechaEntre

        LocalDate inicio = LocalDate.of(1982,1,1);
        LocalDate fin = LocalDate.of(1999,12,31);
        System.out.println(fechaEntre(inicio,fin));
                 */

        String entradaTeclado = Captura.cadena("Introduce un fecha ?");
        LocalDate f = null;
        f = captura(entradaTeclado);
        System.out.println("La fecha devuelta es -> " +f);

    }


    public static LocalDate captura(String entradaTeclao) {


        LocalDate retorno = null;

        int anio = 0;
        int mes = 0;
        int dia = 0;


        // Valida este formato YYYY-MM-DD
        String patronFecha = "\\d{4}-\\d{2}-\\d{2}";
        // Valida este formato DD-MM-AAAA
        String patronFecha2 = "\\d{2}-\\d{2}-\\d{4}";


        if (entradaTeclao.matches(patronFecha)) {
            System.out.println("El formato introducido es YYYY-MM-DD");
            anio = Integer.parseInt(entradaTeclao.substring(0, 4));
            mes = Integer.parseInt(entradaTeclao.substring(5, 7));
            dia = Integer.parseInt(entradaTeclao.substring(8));
            System.out.println(anio + " " + mes + " " + dia);

        } else if (entradaTeclao.matches(patronFecha2)) {
            System.out.println("El formato introducido es DD-MM-AAAA");
            dia = Integer.parseInt(entradaTeclao.substring(0, 2));
            mes = Integer.parseInt(entradaTeclao.substring(3, 5));
            anio = Integer.parseInt(entradaTeclao.substring(6));
            System.out.println(anio + " " + mes + " " + dia);

        } else {
           // System.out.println("El formato de fecha introducido no es valido");
        }


        try {
            retorno = LocalDate.of(anio, mes, dia);
        } catch (DateTimeException | NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("El formato de fecha introducido no es valido");

        }


        return retorno;

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
