package Ejercicio6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese numerador: ");
            int a = sc.nextInt();
            System.out.print("Ingrese denominador: ");
            int b = sc.nextInt();
            System.out.println("Resultado de la división: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Error Crítico: No se puede dividir entre cero.");
        }
    }
}