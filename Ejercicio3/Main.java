package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        
        Pago pagoPizza = new PagoTarjeta(135.50, "****-8921");
        Pago cuotaCuchubal = new PagoEfectivo(500.00);
        
        System.out.println("--- Sistema de Pagos ---");
        
        System.out.println("\nCobrando orden de comida:");
        pagoPizza.procesarPago();
        
        System.out.println("\nRegistrando aporte mensual:");
        cuotaCuchubal.procesarPago();
    }
}

