package Ejercicios.polimorfismo;

public class Perro extends Animal{
    Boolean raboLargo ;
    String tipo = "PERRO";

    public Perro(String nombre, int edad, Boolean raboLargo, String tipo) {
        super(nombre, edad);
        this.raboLargo = raboLargo;
        this.tipo = tipo;
    }

    public Boolean getRaboLargo() {
        return raboLargo;
    }

    public void setRaboLargo(Boolean raboLargo) {
        this.raboLargo = raboLargo;
    }

    public String getTipo() {
        return tipo;
    }

    public void comunicacion (){
        System.out.println("GUAU");
    }


}
