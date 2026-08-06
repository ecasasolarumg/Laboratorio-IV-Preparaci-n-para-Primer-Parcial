package Ejercicio3;

public class PagoEfectivo extends Pago {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo por Q" + monto);
        System.out.println("Calculando vuelto en caja... ¡Pago recibido!");
    }
}