package Prog3Eval;

import java.time.LocalDate;

public class AlumnoPresencial extends Persona {

    Boolean activo = true;
    public AlumnoPresencial(String dni, LocalDate fechaNacimiento, String nombre, String apellido1, String apellido2) {
        super(dni, fechaNacimiento, nombre, apellido1, apellido2);
    }

    @Override
    public String toString() {
        return "AlumnoPresencial{" +
                "activo=" + activo +
                ", Dni='" + Dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido1='" + Apellido1 + '\'' +
                ", Apellido2='" + Apellido2 + '\'' +
                '}';
    }
}
