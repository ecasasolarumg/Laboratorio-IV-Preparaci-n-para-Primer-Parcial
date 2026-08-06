package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        // Notas de cursos (ej. Programación I, Lógica de Sistemas, etc.)
        double[] notas = {85.5, 90.0, 78.0, 92.5, 88.0}; 
        double suma = 0;
        
        for(double n : notas) {
            suma += n;
        }
        
        System.out.println("--- Sistema de Notas ---");
        System.out.println("El promedio del semestre es: " + (suma / notas.length));
    }
}