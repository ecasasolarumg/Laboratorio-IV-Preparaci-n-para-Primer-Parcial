package Ejercicio9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 3 números:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int mayor = Math.max(a, Math.max(b, c));
        System.out.println("El número mayor es: " + mayor);
    }
}