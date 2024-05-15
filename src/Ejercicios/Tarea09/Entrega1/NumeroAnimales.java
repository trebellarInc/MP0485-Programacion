package Ejercicios.Tarea09.Entrega1;

import java.io.Serializable;

public class NumeroAnimales implements Serializable {
    int animales;

    public NumeroAnimales(int animales) {
        this.animales = animales;
    }

    public int getAnimales() {
        return animales;
    }

    public void setAnimales(int animales) {
        this.animales = animales;
    }

    @Override
    public String toString() {
        return "NumeroObjetos{" +
                "animales=" + animales +
                '}';
    }
}
