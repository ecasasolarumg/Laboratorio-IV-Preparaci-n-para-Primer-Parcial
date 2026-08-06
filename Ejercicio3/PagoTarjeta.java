package Ejercicio3;

public class PagoTarjeta extends Pago {
    private String numeroTarjeta;

    public PagoTarjeta(double monto, String numeroTarjeta) {
        super(monto); // Pasamos el monto a la clase padre
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago de Q" + monto + " con la tarjeta terminada en: " + numeroTarjeta);
        System.out.println("¡Transacción aprobada!");
    }
}
