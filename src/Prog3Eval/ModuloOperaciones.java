package Prog3Eval;

import java.util.ArrayList;


public class ModuloOperaciones {
    static ArrayList<Modulo> listaModulos = new ArrayList<>();
    public static void cargaModulos (){
        listaModulos.add(new Modulo("MP0486","Acceso a datos."));
        listaModulos.add(new Modulo("MP0484","Bases de datos."));
        listaModulos.add(new Modulo("MP0487","Contornos de desenvolvemento."));
        listaModulos.add(new Modulo("MP0488","Desenvolvemento de interfaces."));
        listaModulos.add(new Modulo("MP0494","Empresa e iniciativa emprendedora."));
        listaModulos.add(new Modulo("MP0493","Formación e orientación laboral."));
        listaModulos.add(new Modulo("MP0373","Linguaxes de marcas e sistemas de xestión de información."));
        listaModulos.add(new Modulo("MP0485","Programación."));
        listaModulos.add(new Modulo("MP0490","Programación de servizos e procesos."));
        listaModulos.add(new Modulo("MP0489","Programación multimedia e dispositivos móbiles."));
        listaModulos.add(new Modulo("MP0491","Sistemas de xestión empresarial."));
        listaModulos.add(new Modulo("MP0483","Sistemas informáticos."));
    }

    public static void mostrarModulos (){
        for (Modulo m: listaModulos
             ) {
            System.out.println(m.toString());
        }
    }



}
