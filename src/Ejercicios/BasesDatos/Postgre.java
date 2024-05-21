package Ejercicios.BasesDatos;

import java.sql.*;

public class Postgre {
    private static final String url = "jdbc:postgresql://ciclo-dam-9917.7tc.aws-eu-central-1.cockroachlabs.cloud:26257/dam";
    private static final String user = "soporte";
    private static final String password = "qTU1gLxVIM8UlgabQvV1Rw";

    public static void main(String[] args) {

        System.out.println("hola");

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);

            if (conn != null) {
                System.out.println("Connected to the PostgreSQL server successfully.");

                PreparedStatement ps = conn.prepareStatement("SELECT * FROM paises_europeos");

                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    float id = rs.getFloat("id");
                    String nombre = rs.getString("nombre_pais");
                    String capital = rs.getString("capital");
                    int extension = rs.getInt("extension_km2");
                    int poblacion = rs.getInt("poblacion");
                    System.out.println(id + "," + nombre + "," + capital + "," + extension + "," + poblacion);
                }

            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}
