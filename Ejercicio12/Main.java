package Ejercicio12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Menú Básico ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.print("Seleccione una opción: ");
        
        int opcion = sc.nextInt();
        System.out.print("Ingrese valor A: ");
        int a = sc.nextInt();
        System.out.print("Ingrese valor B: ");
        int b = sc.nextInt();
        
        switch (opcion) {
            case 1: System.out.println("Suma: " + (a + b)); break;
            case 2: System.out.println("Resta: " + (a - b)); break;
            default: System.out.println("Opción inválida");
        }
    }
}