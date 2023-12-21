public class Dni {


    public static boolean esValido(String dni){
        boolean retorno = false;

        if (dni == null || !dni.matches("\\d{8}")) {
            retorno = false;
        } else {
            retorno = true;
        }

        System.out.println(dni);


        return retorno;
    }


}
