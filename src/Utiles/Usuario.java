package Utiles;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Usuario implements Serializable {
    private String nombre;
    private String passwd;
    private boolean activo = true;
    private LocalDateTime fechaIngreso = LocalDateTime.now();

    // En proyecto
    // private LocalDateTime fechaModificacion;

    /**
     * La clave se cifra a md5 y se guarda asi en el objeto, nadie sabra la clave real.
     *
     * @param nombre
     * @param passwd
     */
    public Usuario(String nombre, String passwd) {
        this.nombre = nombre;
        this.passwd = Cifrado.md5(passwd);

    }

    public String getNombre() {
        return nombre;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nombre='" + nombre + '\'' +
                ", passwd='" + passwd + '\'' +
                ", activo=" + activo +
                ", fechaIngreso=" + fechaIngreso +
                '}';
    }
}
