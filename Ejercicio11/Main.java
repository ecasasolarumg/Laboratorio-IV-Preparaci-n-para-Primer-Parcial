package Ejercicio11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        
        if (edad < 13) {
            System.out.println("Clasificación: Niño");
        } else if (edad < 18) {
            System.out.println("Clasificación: Adolescente");
        } else {
            System.out.println("Clasificación: Adulto");
        }
    }
}