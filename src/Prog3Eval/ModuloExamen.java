package Prog3Eval;

import java.time.LocalDate;

public class ModuloExamen {

    LocalDate fechaExamen;
    String idModulo;
    String idDocente;
    String idAlumno;
    int nota;

    public ModuloExamen(LocalDate fechaExamen, String idModulo, String idDocente, String idAlumno, int nota) {
        this.fechaExamen = fechaExamen;
        this.idModulo = idModulo;
        this.idDocente = idDocente;
        this.idAlumno = idAlumno;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "ModuloExamen{" +
                "fechaExamen=" + fechaExamen +
                ", idModulo='" + idModulo + '\'' +
                ", idDocente='" + idDocente + '\'' +
                ", idAlumno='" + idAlumno + '\'' +
                ", nota=" + nota +
                '}';
    }
}
