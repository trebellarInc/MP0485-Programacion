/**
 * Genera un nombre y apellidos aleatorios basandose en los 100 nombres y 100 apellidos mas comunes en españa.
 * Datos estraidos del INE - Estadística del Padrón Continuo a fecha 01/01/2022 España
 * Estan en frecuencia x 1000,  NombreM 582 NombreF 516.4 Apellido 372.4
 *
 * @autor Nacho Limetre (Trebellar Inc)
 */

import java.util.Random;

public class Personas_Aleatorias {
    final private static String[] nombreM = {"ANTONIO", "MANUEL", "JOSE", "FRANCISCO", "DAVID", "JUAN", "JAVIER", "DANIEL", "JOSE ANTONIO", "FRANCISCO JAVIER", "JOSE LUIS", "CARLOS", "ALEJANDRO", "JESUS", "MIGUEL", "JOSE MANUEL", "MIGUEL ANGEL", "RAFAEL", "PABLO", "PEDRO", "ANGEL", "SERGIO", "FERNANDO", "JOSE MARIA", "JORGE", "LUIS", "ALBERTO", "ALVARO", "JUAN CARLOS", "ADRIAN", "DIEGO", "JUAN JOSE", "RAUL", "IVAN", "RUBEN", "JUAN ANTONIO", "OSCAR", "ENRIQUE", "RAMON", "ANDRES", "JUAN MANUEL", "SANTIAGO", "VICENTE", "MARIO", "VICTOR", "JOAQUIN", "EDUARDO", "ROBERTO", "MARCOS", "JAIME", "FRANCISCO JOSE", "HUGO", "IGNACIO", "JORDI", "ALFONSO", "RICARDO", "SALVADOR", "MARC", "GUILLERMO", "MOHAMED", "GABRIEL", "MARTIN", "GONZALO", "EMILIO", "JOSE MIGUEL", "JULIO", "JULIAN", "TOMAS", "NICOLAS", "AGUSTIN", "LUCAS", "SAMUEL", "JOSE RAMON", "ISMAEL", "CRISTIAN", "JOAN", "AITOR", "FELIX", "HECTOR", "ALEX", "IKER", "JUAN FRANCISCO", "JOSE CARLOS", "MATEO", "SEBASTIAN", "CESAR", "JOSEP", "ALFREDO", "MARIANO", "RODRIGO", "JOSE ANGEL", "DOMINGO", "VICTOR MANUEL", "JOSE IGNACIO", "FELIPE", "LUIS MIGUEL", "JOSE FRANCISCO", "XAVIER", "ALBERT", "JUAN LUIS"};
    final private static double[] porcentajeM1000 = {27.0, 23.8, 22.8, 19.6, 15.9, 13.7, 13.3, 13.1, 12.9, 12.2, 12.1, 11.9, 11.5, 11.4, 10.2, 10.2, 9.8, 9.7, 9.6, 9.1, 9.0, 9.0, 8.5, 8.5, 8.3, 7.8, 7.7, 7.1, 6.9, 6.9, 6.7, 6.5, 6.1, 5.9, 5.6, 5.6, 5.3, 5.3, 4.9, 4.8, 4.8, 4.7, 4.7, 4.7, 4.6, 4.5, 4.4, 4.2, 4.1, 4.1, 4.1, 4.0, 3.8, 3.5, 3.5, 3.4, 3.3, 3.2, 3.1, 3.1, 3.1, 3.0, 3.0, 2.9, 2.8, 2.7, 2.7, 2.6, 2.6, 2.5, 2.5, 2.5, 2.4, 2.4, 2.4, 2.3, 2.3, 2.2, 2.2, 2.1, 2.1, 2.0, 1.9, 1.9, 1.8, 1.8, 1.8, 1.8, 1.8, 1.8, 1.7, 1.7, 1.7, 1.7, 1.7, 1.6, 1.5, 1.5, 1.5, 1.4};
    final private static double porcentajeM = 582;
    final private static String[] nombreF = {"MARIA CARMEN", "MARIA", "CARMEN", "ANA MARIA", "LAURA", "MARIA PILAR", "MARIA DOLORES", "ISABEL", "JOSEFA", "MARIA TERESA", "ANA", "MARTA", "CRISTINA", "MARIA ANGELES", "LUCIA", "MARIA ISABEL", "MARIA JOSE", "FRANCISCA", "ANTONIA", "DOLORES", "PAULA", "SARA", "ELENA", "MARIA LUISA", "RAQUEL", "ROSA MARIA", "MANUELA", "MARIA JESUS", "PILAR", "CONCEPCION", "MERCEDES", "JULIA", "BEATRIZ", "ALBA", "SILVIA", "NURIA", "IRENE", "PATRICIA", "ROSARIO", "JUANA", "ROCIO", "ANDREA", "TERESA", "ENCARNACION", "MONTSERRAT", "MONICA", "ALICIA", "MARIA MAR", "SANDRA", "SONIA", "MARINA", "SUSANA", "ANGELA", "NATALIA", "ROSA", "YOLANDA", "SOFIA", "CLAUDIA", "MARGARITA", "MARIA JOSEFA", "CARLA", "EVA", "INMACULADA", "MARIA ROSARIO", "MARIA MERCEDES", "ANA ISABEL", "NOELIA", "ESTHER", "VERONICA", "DANIELA", "NEREA", "CAROLINA", "INES", "MIRIAM", "EVA MARIA", "MARTINA", "MARIA VICTORIA", "LORENA", "ANGELES", "ANA BELEN", "MARIA ELENA", "MARIA ROSA", "VICTORIA", "MARIA CONCEPCION", "ALEJANDRA", "AMPARO", "MARIA ANTONIA", "LIDIA", "CELIA", "CATALINA", "FATIMA", "MARIA NIEVES", "AINHOA", "OLGA", "CLARA", "CONSUELO", "MARIA CRISTINA", "ADRIANA", "GLORIA", "MARIA SOLEDAD"};
    final private static double[] porcentajeF1000 = {26.3, 23.5, 14.8, 11.1, 10.7, 10.6, 10.3, 10.3, 10.2, 10.0, 10.0, 9.4, 9.4, 9.1, 8.9, 8.4, 8.4, 8.0, 7.8, 7.3, 7.2, 7.2, 6.6, 6.3, 6.1, 6.0, 5.7, 5.6, 5.5, 5.5, 5.3, 5.2, 5.1, 5.1, 5.0, 5.0, 4.9, 4.6, 4.6, 4.5, 4.5, 4.5, 4.5, 4.4, 4.4, 4.3, 4.2, 4.1, 4.0, 4.0, 4.0, 3.9, 3.9, 3.9, 3.9, 3.8, 3.6, 3.6, 3.5, 3.4, 3.4, 3.4, 3.2, 3.2, 3.2, 3.1, 3.1, 3.0, 3.0, 2.8, 2.8, 2.8, 2.6, 2.6, 2.6, 2.6, 2.6, 2.6, 2.5, 2.5, 2.5, 2.5, 2.4, 2.4, 2.3, 2.3, 2.2, 2.2, 2.2, 2.1, 2.1, 2.1, 2.1, 2.1, 2.0, 1.9, 1.9, 1.9, 1.9, 1.9};
    final private static double porcentajeF = 516.4;
    final private static String[] apellido = {"GARCIA", "RODRIGUEZ", "GONZALEZ", "FERNANDEZ", "LOPEZ", "MARTINEZ", "SANCHEZ", "PEREZ", "GOMEZ", "MARTIN", "JIMENEZ", "HERNANDEZ", "RUIZ", "DIAZ", "MORENO", "MUÑOZ", "ALVAREZ", "ROMERO", "GUTIERREZ", "ALONSO", "NAVARRO", "TORRES", "DOMINGUEZ", "RAMOS", "VAZQUEZ", "RAMIREZ", "GIL", "SERRANO", "MORALES", "MOLINA", "BLANCO", "SUAREZ", "CASTRO", "ORTEGA", "DELGADO", "ORTIZ", "MARIN", "RUBIO", "NUÑEZ", "MEDINA", "SANZ", "CASTILLO", "IGLESIAS", "CORTES", "GARRIDO", "SANTOS", "GUERRERO", "LOZANO", "CANO", "CRUZ", "MENDEZ", "FLORES", "PRIETO", "HERRERA", "PEÑA", "LEON", "MARQUEZ", "CABRERA", "GALLEGO", "CALVO", "VIDAL", "CAMPOS", "REYES", "VEGA", "FUENTES", "CARRASCO", "DIEZ", "AGUILAR", "CABALLERO", "NIETO", "SANTANA", "VARGAS", "PASCUAL", "GIMENEZ", "HERRERO", "HIDALGO", "MONTERO", "LORENZO", "SANTIAGO", "BENITEZ", "DURAN", "IBAÑEZ", "ARIAS", "MORA", "FERRER", "CARMONA", "VICENTE", "ROJAS", "SOTO", "CRESPO", "ROMAN", "PASTOR", "VELASCO", "PARRA", "SAEZ", "MOYA", "BRAVO", "RIVERA", "GALLARDO", "SOLER"};
    final private static double[] porcentajeA1000 = {30.5, 19.5, 19.4, 19.0, 18.2, 17.4, 17.1, 16.3, 10.3, 10.1, 8.3, 7.8, 7.7, 7.2, 6.8, 5.9, 5.9, 4.7, 4.1, 4.1, 3.7, 3.6, 3.3, 3.1, 3.1, 3.0, 2.9, 2.7, 2.6, 2.6, 2.6, 2.5, 2.5, 2.5, 2.5, 2.3, 2.2, 2.2, 1.9, 1.9, 1.9, 1.9, 1.8, 1.8, 1.8, 1.8, 1.7, 1.7, 1.6, 1.6, 1.6, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.4, 1.4, 1.4, 1.4, 1.4, 1.4, 1.4, 1.3, 1.3, 1.3, 1.3, 1.3, 1.2, 1.2, 1.2, 1.2, 1.2, 1.2, 1.2, 1.2, 1.2, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.1, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.9, 0.9, 0.9, 0.9};
    final private static double porcentajeA = 372.4;

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i <= 10; i++) {
            String[] nombreApellido = {"", "", ""};

            nombreApellido = nombreApellidosAleatorios();
            System.out.println(nombreApellido[0] + " " + nombreApellido[1] + " " + nombreApellido[2]);
        }
    }

    private static int PosicionAleatoria(double[] arrayPorcentaje, double porcentaje) {
        Random random = new Random();
        Double numAleatorio = random.nextDouble() * porcentaje;
        double valorArray = arrayPorcentaje[0];
        int punteroArray = 1;

        while (numAleatorio > valorArray) {
            valorArray = valorArray + arrayPorcentaje[punteroArray];
            punteroArray++;
        }
        return punteroArray - 1;
    }

    static String[] nombreApellidosAleatorios() {
        Random random = new Random();
        String[] nombreApellido = {"", "", ""};

        // Determina el nombre si es femenino o masculino
        int sexo = random.nextInt(2);
        // Prueba con operador ternario
        nombreApellido[0] = (sexo == 1) ? nombreM[PosicionAleatoria(porcentajeM1000, porcentajeM)] : nombreF[PosicionAleatoria(porcentajeF1000, porcentajeF)];
        nombreApellido[1] = apellido[PosicionAleatoria(porcentajeA1000, porcentajeA)];
        nombreApellido[2] = apellido[PosicionAleatoria(porcentajeA1000, porcentajeA)];

        // Version antigua
        /*
        if (sexo == 1) {
            nombreApellido[0] = nombreM[PosicionAleatoria(porcentajeM1000, porcentajeM)];
            // System.out.println(nombreM[PosicionAleatoria(porcentajeM1000, porcentajeM)]
            //         + " " + apellido[PosicionAleatoria(porcentajeA1000, porcentajeA)] + " " + apellido[PosicionAleatoria(porcentajeA1000, porcentajeA)] + " ");
        } else {
            nombreApellido[0] = nombreF[PosicionAleatoria(porcentajeF1000, porcentajeF)];
            //       System.out.println(nombreF[PosicionAleatoria(porcentajeF1000, porcentajeF)]
            //       + " " + apellido[PosicionAleatoria(porcentajeA1000, porcentajeA)] + " " + apellido[PosicionAleatoria(porcentajeA1000, porcentajeA)] + " ");

        }
        */
        return nombreApellido;
    }

}
