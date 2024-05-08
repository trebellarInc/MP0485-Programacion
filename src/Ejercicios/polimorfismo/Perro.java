package Ejercicios.polimorfismo;

public class Perro extends Animal{
   private Boolean raboLargo ;
    private String tipo = "PERRO";

    public Perro(String nombre, int edad, Boolean raboLargo) {
        super(nombre, edad);
        this.raboLargo = raboLargo;
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

    @Override
    public String toString() {
        return "Perro{" +
                "raboLargo=" + raboLargo +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void comunicacion (){
        System.out.println("GUAU");
    }


}
