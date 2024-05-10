package Ejercicios.E04;
/**
 *  4)Crea una aplicación que almacene los datos básicos de un vehículo como:
 *     la matricula(String), marca (String), tamaño de deposito (double) y modelo (String)
 *     en ese orden y de uno en uno usando la clase DataInputStream.
 * *     Los datos anteriores datos se pedirán por teclado y se irán añadiendo al fichero
 *     (no se sobrescriben los datos) cada vez que ejecutemos la aplicación.
 * *     El fichero siempre sera el mismo, en todos los casos.
 * *     Muestra todos los datos de cada coche en un cuadro de dialogo,
 *     es decir, si tenemos 3 vehículos mostrara 3 cuadros de dialogo con sus respectivos datos.
 * *     Un ejemplo de salida de información puede ser este:
 * *     El vehiculo tiene una matrícula 6691PJ, su marca es Opel, el tamaño depósito
 *     es de 45.0 litros y su modelo es Astra.
 */
public class Principal {


    public static void main(String[] args) {


        Vehiculo v1 = new Vehiculo("6691PJD","Opel",45.00,"Astra");
        Vehiculo v2 = new Vehiculo("1978NLR","Toyota",40.00,"Corolla");
        Vehiculo v3 = new Vehiculo("1993CRB","Reanult",30.00,"Clio");



    }
}
