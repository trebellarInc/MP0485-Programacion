package Prog3Eval;



import java.util.HashMap;

public class Inicio {
    public static void main(String[] args) {
        HashMap<String, Usuario> mapaUsuarios = new HashMap<>();

        Txt.azul("Incio del programa...\n");



        mapaUsuarios = Usuario_Operaciones.cargaUsuariosDesdeArchivo();


        System.out.println(Usuario_Operaciones.login("admin","admin",mapaUsuarios));


        System.out.println(mapaUsuarios);




    }
}
