package Ejercicio15;
public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaPorHora;
    public EmpleadoPorHoras(String nombre, int horas, double tarifa) {
        super(nombre);
        this.horasTrabajadas = horas;
        this.tarifaPorHora = tarifa;
    }
    @Override
    public double calcularPago() { return horasTrabajadas * tarifaPorHora; }
}