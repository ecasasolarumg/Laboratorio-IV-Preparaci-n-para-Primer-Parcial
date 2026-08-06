package Ejercicio5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        try {
            int edad = Integer.parseInt(sc.nextLine());
            if (edad < 0) {
                throw new Exception("La edad no puede ser negativa.");
            }
            System.out.println("Validación exitosa. Edad registrada: " + edad);
        } catch (Exception e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}