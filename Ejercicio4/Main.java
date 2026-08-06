package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Material miLibro = new Libro("Arquitectura de Computadoras", "M. Morris Mano", 600);
        Material miRevista = new Revista("PC World", "Varios Autores", 102);
        
        System.out.println("--- Catálogo de la Biblioteca ---");
        miLibro.mostrarInformacion();
        miRevista.mostrarInformacion();
    }
}