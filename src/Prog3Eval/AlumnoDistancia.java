package Prog3Eval;

import java.time.LocalDate;

public class AlumnoDistancia extends Persona {

    Boolean activo = true;

    public AlumnoDistancia(String dni, LocalDate fechaNacimiento, String nombre, String apellido1, String apellido2) {
        super(dni, fechaNacimiento, nombre, apellido1, apellido2);
    }

    @Override
    public String toString() {
        return "AlumnoDistancia{" +
                "activo=" + activo +
                ", Dni='" + Dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido1='" + Apellido1 + '\'' +
                ", Apellido2='" + Apellido2 + '\'' +
                '}';
    }



}
