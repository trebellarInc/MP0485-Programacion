package Ejercicios.Entrega2_UD09;

public class Cliente {

    int id;
    String nombre;
    double saldoCuenta;

    public Cliente(int id, String nombre, double saldoCuenta) {
        this.id = id;
        this.nombre = nombre;
        this.saldoCuenta = saldoCuenta;
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

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void show() {
        System.out.println(id +" "+ nombre +" "+ saldoCuenta + " €");
    }



}
