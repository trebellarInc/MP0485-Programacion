// DNI NIF NIE CIF etc... en creación.
// 48.592.909 Habitantes en España 1 Enero de 2024

public class Id_Esp {
    private static final String letrasValidasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";

    // El Ministerio del Interior establece que el número del Documento Nacional de Identidad es realmente lo que se
    // denomina NIF (Número de Identificación Fiscal).

    // Valida el formato del DNI y si la letra corresponde con sus digitos
    public static boolean esValidoDNI(String cadena) {
        // 1 - comprobamos que el formato de la cadena alfanumerica es correcto
        // 2 - calculamos la letra para esos digitos
        // 3 - comparamos la letra calculada con la de la cadena
        boolean retorno = false;

        if (esFormatoValidoDNI(cadena)) {
            /*
            char letraCadena = cadena.charAt(8);
            char letraCalculada = calcularLetra(cadena);
             if (letraCalculada == letraCadena){
                retorno = true;
            }
            */
            retorno = (cadena.charAt(8) == calcularLetra(cadena)) ? true : false;
            System.out.println("letra -> " + cadena.charAt(8) + " = " + calcularLetra(cadena) + " ?");
        }
        return retorno;
    }

    // Calcula la letra del DNI/NIE a partir de los 8 digitos.
    public static char calcularLetra(String cadena) {
        int numero = Integer.parseInt(cadena.substring(0, 8));
        return letrasValidasDNI.charAt(numero % 23);
    }

    // Determina si el formato de dato del DNI es valido o no.
    public static boolean esFormatoValidoDNI(String dni) {
        boolean retorno = false;
        if (dni == null || !dni.matches("\\d{8}[TRWAGMYFPDXBNJZSQVHLCKE]")) {
            System.err.println("Formato DNI no valido. " + dni);
        } else {
            retorno = true;
        }
        return retorno;
    }

    public static boolean esFormatoValidoNIE(String dni) {
        boolean retorno = false;

        return retorno;
    }

    public static boolean esFormatoValidoCIF(String dni) {
        boolean retorno = false;

        return retorno;
    }
    //


    // www.interior.gob.es
    // NIF DDDDDDDDC
    // Para verificar el NIF de españoles residentes mayores de edad, el algoritmo de cálculo del dígito de control
    // es el siguiente:
    //Se divide el número entre 23 y el resto se sustituye por una letra que se determina por inspección mediante
    // la siguiente tabla:
    // Se divide el número entre 23 y el resto se sustituye por una letra que se determina por inspección mediante
    // la siguiente tabla:
    // RESTO 	0 	1 	2 	3 	4 	5 	6 	7 	8 	9 	10 	11  12 	13 	14 	15 	16 	17 	18 	19 	20 	21 	22
    // LETRA 	T 	R 	W 	A 	G 	M 	Y 	F 	P 	D 	X 	B   N 	J 	Z 	S 	Q 	V 	H 	L 	C 	K 	E
    //TRWAGMYFPDXBNJZSQVHLCKE

    /*

     NIE ADDDDDDDC
     Los NIE's de extranjeros residentes en España tienen una letra (X, Y, Z), 7 números y dígito de control.

 Para el cálculo del dígito de control se sustituye:

     X → 0
     Y → 1
     Z → 2

 y se aplica el mismo algoritmo que para el NIF.
     */
    public static String generaDNI(int min, int max) {
        String dni = String.valueOf((int) Numero.generaDouble(min, max));
        return dni = dni + calcularLetra(dni);
    }
}
