package Ejercicio15;
public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new EmpleadoTiempoCompleto("Soporte Redes Institucional", 5000.00);
        Empleado emp2 = new EmpleadoPorHoras("Técnico Mantenimiento de Impresoras Canon", 45, 120.00);
        
        System.out.println("Pago Empleado Fijo: Q" + emp1.calcularPago());
        System.out.println("Pago Empleado Horas: Q" + emp2.calcularPago());
    }
}