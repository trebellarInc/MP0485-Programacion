package Ejercicios.polimorfismo;

public class Gato extends Animal{

private Boolean bigotesLargos ;
private String tipo = "GATO";

    public Gato(String nombre, int edad, Boolean bigotesLargos) {
        super(nombre, edad);
        this.bigotesLargos = bigotesLargos;

    }

    public Boolean getBigotesLargos() {
        return bigotesLargos;
    }

    public void setBigotesLargos(Boolean bigotesLargos) {
        this.bigotesLargos = bigotesLargos;
    }

    public String getTipo() {
        return tipo;
    }


    public void comunicacion (){
    System.out.println("MIAU");
}

}
