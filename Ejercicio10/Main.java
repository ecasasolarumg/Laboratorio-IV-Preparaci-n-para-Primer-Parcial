package Ejercicio10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        
        System.out.println("Ingrese 5 números:");
        for(int i = 0; i < 5; i++) {
            numeros[i] = sc.nextInt();
            suma += numeros[i];
            if(numeros[i] > mayor) mayor = numeros[i];
            if(numeros[i] < menor) menor = numeros[i];
        }
        
        System.out.println("--- Estadísticas ---");
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + (suma / 5.0));
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}