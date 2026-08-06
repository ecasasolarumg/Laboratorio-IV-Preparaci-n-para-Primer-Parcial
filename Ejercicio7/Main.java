package Ejercicio7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        try {
            int numero = sc.nextInt();
            System.out.println("Número ingresado correctamente: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingresó texto o un formato inválido en lugar de un número.");
        }
    }
}