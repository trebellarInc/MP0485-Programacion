package Prog3Eval;

import java.io.Serializable;
import java.time.LocalDate;

public class Persona implements Serializable {

    String Dni;
    LocalDate fechaNacimiento;
    String Nombre ;
    String Apellido1;
    String Apellido2;

    public Persona(String dni, LocalDate fechaNacimiento, String nombre, String apellido1, String apellido2) {
        Dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        Nombre = nombre;
        Apellido1 = apellido1;
        Apellido2 = apellido2;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String apellido1) {
        Apellido1 = apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String apellido2) {
        Apellido2 = apellido2;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "Dni='" + Dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido1='" + Apellido1 + '\'' +
                ", Apellido2='" + Apellido2 + '\'' +
                '}';
    }
}
