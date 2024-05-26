package Prog3Eval;

import Utiles.Fechas;
import Utiles.Id_Esp;
import Utiles.Personas_Aleatorias;

import java.time.LocalDate;
import java.util.HashMap;

public class Inicio {
    public static void main(String[] args) {
        HashMap<String, Usuario> mapaUsuarios = new HashMap<>();

        Txt.azul("Incio del programa...\n");

        mapaUsuarios = Usuario_Operaciones.cargaUsuariosDesdeArchivo();

        System.out.println(Usuario_Operaciones.login("admin", "admin", mapaUsuarios));
        System.out.println(mapaUsuarios);

        ModuloOperaciones.cargaModulos();
        PersonaOperaciones.cargaAlumnos();
        PersonaOperaciones.mostrarAlumnos();
        PersonaOperaciones.cargaDocentes();
        PersonaOperaciones.mostrarDocentes();


        ModuloOperaciones.examenModulo();
        ModuloOperaciones.mostrarModulos();


        /*
        LocalDate inicio = LocalDate.of(1965, 1, 1);
        LocalDate fin = LocalDate.of(2000, 12, 31);
        int dninumero=40500000;
        for (int i=1;i<=20;i++){
            int num = dninumero+ i;
            System.out.print(num);
            System.out.print(Id_Esp.calcularLetra(String.valueOf(num))+"\t\t");
            System.out.print(Fechas.fechaEntre(inicio,fin)+"\t\t");
            System.out.print(Personas_Aleatorias.nombre()+"\t\t");
            System.out.print(Personas_Aleatorias.apellido()+"\t\t");
            System.out.println(Personas_Aleatorias.apellido()+"\t\t");
        }
*/


    }
}
