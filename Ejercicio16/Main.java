package Ejercicio16;
public class Main {
    public static void main(String[] args) {
        Producto lap = new ProductoFisico("Laptop MSI Thin 15", 7500.00, 1.8);
        Producto juego = new ProductoDigital("Valorant Points (1000 VP)", 80.00, 0.0);
        
        System.out.println("--- Inventario de Productos ---");
        lap.mostrarDetalles();
        juego.mostrarDetalles();
    }
}