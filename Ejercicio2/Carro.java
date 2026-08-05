package Ejercicio2;

public class Carro extends Vehiculo {

    private int numeroPuertas;

    public Carro(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo); 
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Carro: " + marca + " " + modelo + " - Puertas: " + numeroPuertas);
    }
}
