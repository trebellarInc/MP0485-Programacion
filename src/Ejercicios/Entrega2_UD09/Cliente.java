package Ejercicios.Entrega2_UD09;

public class Cliente {

    int id;
    String nombre;
    double cuenta;

    public Cliente(int id, String nombre, double cuenta) {
        this.id = id;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }

    public void show() {
        System.out.println(id +" "+ nombre +" "+ cuenta);
    }



}
