package Prog3Eval;


/*


36018173. CSIFC02. MP0486. Acceso a datos. 2023-2024. (Grupo A)
36018173. CSIFC02. MP0484. Bases de datos. 2023-2024. (Grupo A)
36018173. CSIFC02. MP0487. Contornos de desenvolvemento. 2023-2024. (Grupo A)
36018173. CSIFC02. MP0488. Desenvolvemento de interfaces. 2023-2024. (Grupo A)
36018173. CSIFC02. MP0494. Empresa e iniciativa emprendedora. 2023-2024. (Grupo A)
36018173. CSIFC02. MP0493. Formación e orientación laboral. 2023-2024. (Grupo A)
36018173. CSIFC02. MP0373. Linguaxes de marcas e sistemas de xestión de información. 2023-2024. (Grupo A)
36018173. CSIFC02. MP0485. Programación. 2023-2024. (Grupo A)
36018173. CSIFC02. MP0490. Programación de servizos e procesos. 2023-2024. (Grupo A)
36018173. CSIFC02. MP0489. Programación multimedia e dispositivos móbiles. 2023-2024. (Grupo A)
36018173. CSIFC02. MP0491. Sistemas de xestión empresarial. 2023-2024. (Grupo A)
36018173. CSIFC02. MP0483. Sistemas informáticos. 2023-2024. (Grupo A)
    "Proyecto de desarrollo de aplicaciones multiplataforma",
    "Formación en centros de trabajo (FCT)"


 */

public class Modulo {

    String id;
    String nombre;

    public Modulo(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
