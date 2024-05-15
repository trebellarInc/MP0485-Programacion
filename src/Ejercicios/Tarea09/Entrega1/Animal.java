package Ejercicios.Tarea09.Entrega1;

import java.io.Serializable;

public class Animal implements Serializable {
    String nombre ;
    int edad;



    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public void comunicacion() {
        System.out.println("Hace un sonido");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
