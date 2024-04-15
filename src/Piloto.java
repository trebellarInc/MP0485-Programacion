import java.time.LocalDate;

public class Piloto {

    private int dorsal;
    private String nombre;
    private String escuderia;
    private LocalDate fechaNacimiento;
    private int puntos;
    private String nacionalidad;

    public Piloto(int dorsal, String nombre, String escuderia, LocalDate fechaNacimiento, int puntos, String nacionalidad) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.escuderia = escuderia;
        this.fechaNacimiento = fechaNacimiento;
        this.puntos = puntos;
        this.nacionalidad = nacionalidad;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getPuntos() {
        return puntos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", escuderia='" + escuderia + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", puntos=" + puntos +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
