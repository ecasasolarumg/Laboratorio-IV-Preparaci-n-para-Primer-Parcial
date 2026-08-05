package Ejercicio2;

public class Moto extends Vehiculo {
    // Encapsulamiento
    private int cilindrada;

    // Constructor
    public Moto(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    // Polimorfismo
    @Override
    public void mostrarDatos() {
        System.out.println("Moto: " + marca + " " + modelo + " - Cilindrada: " + cilindrada + "cc");
    }
}