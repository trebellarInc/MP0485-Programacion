package Prog3Eval;

import java.time.LocalDate;
import java.util.ArrayList;


public class ModuloOperaciones {
    static ArrayList<Modulo> listaModulos = new ArrayList<>();

    public static void cargaModulos() {
        listaModulos.add(new Modulo("MP0486", "Acceso a datos.", "Desarrollo de aplicaciones que acceden y manipulan datos almacenados en bases de datos y otras fuentes de información."));
        listaModulos.add(new Modulo("MP0484", "Bases de datos.", "Diseño, implementación y gestión de bases de datos relacionales."));
        listaModulos.add(new Modulo("MP0487", "Contornos de desenvolvemento.", "Configuración y uso de entornos de desarrollo integrado (IDE) para la creación de aplicaciones."));
        listaModulos.add(new Modulo("MP0488", "Desenvolvemento de interfaces.", "Diseño y programación de interfaces de usuario amigables e intuitivas para aplicaciones multiplataforma."));
        listaModulos.add(new Modulo("MP0494", "Empresa e iniciativa emprendedora.", "Fomento del espíritu emprendedor, creación y gestión de empresas y análisis de viabilidad de proyectos empresariales."));
        listaModulos.add(new Modulo("MP0493", "Formación e orientación laboral.", "Conocimiento del entorno laboral y técnicas de búsqueda de empleo, además de principios de prevención de riesgos laborales."));
        listaModulos.add(new Modulo("MP0373", "Linguaxes de marcas e sistemas de xestión de información.", "Uso de lenguajes de marcas y herramientas para la creación y manipulación de documentos estructurados y gestión de información."));
        listaModulos.add(new Modulo("MP0485", "Programación.", "Desarrollo de aplicaciones mediante lenguajes de programación, siguiendo los principios de la programación estructurada y orientada a objetos."));
        listaModulos.add(new Modulo("MP0490", "Programación de servizos e procesos.", "Desarrollo y despliegue de servicios y procesos en entornos de red y cloud computing."));
        listaModulos.add(new Modulo("MP0489", "Programación multimedia e dispositivos móbiles.", "Desarrollo de aplicaciones multimedia y para dispositivos móviles, incluyendo aspectos de programación gráfica y uso de sensores."));
        listaModulos.add(new Modulo("MP0491", "Sistemas de xestión empresarial.", "Implantación y gestión de sistemas ERP y otras soluciones empresariales."));
        listaModulos.add(new Modulo("MP0483", "Sistemas informáticos.", "Configuración y administración de sistemas operativos, redes y servicios informáticos."));
    }

    public static void mostrarModulos() {
        for (Modulo m : listaModulos
        ) {
            System.out.println(m.toString());
        }
    }

    public static void examenModulo() {


        LocalDate fecha = LocalDate.of(2023, 12, 21);
        ModuloExamen me = new ModuloExamen(fecha, "MP0486", "40500001Z", "40100001F", 7);

        listaModulos.get(0).getListaExamenes().add(me);



    }


}
