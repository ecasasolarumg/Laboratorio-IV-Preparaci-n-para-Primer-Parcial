package Ejercicio15;
public class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;
    public EmpleadoTiempoCompleto(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }
    @Override
    public double calcularPago() { return salarioMensual; }
}