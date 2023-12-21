import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*
        JFrame ventana = new JFrame("Ventana");
        ventana.setSize(1080, 720);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
                 */

        /*
        LocalDate inicio = LocalDate.of(1980, 1, 1);
        LocalDate fin = LocalDate.of(1999, 12, 31);
        for (int i = 0; i < 10; i++) {
            System.out.println(Fechas.fechaEntre(inicio, fin));
        }
*/
        String dniTest = "44083909W";

        System.out.println(Dni.esValido(dniTest));;


    }
}