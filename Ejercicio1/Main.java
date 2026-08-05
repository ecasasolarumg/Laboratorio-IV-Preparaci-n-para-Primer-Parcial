package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        
        Animal miPerro = new Perro("Firulais");
        Animal miGato = new Gato("Michi");
        
        System.out.println("--- Prueba de sonido ---");
        miPerro.hacerSonido();
        miGato.hacerSonido();
    }
}
