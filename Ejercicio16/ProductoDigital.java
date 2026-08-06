package Ejercicio16;
public class ProductoDigital extends Producto {
    private double tamañoMB;
    public ProductoDigital(String nombre, double precio, double tamañoMB) {
        super(nombre, precio);
        this.tamañoMB = tamañoMB;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Digital: " + nombre + " | Precio: Q" + precio + " | Tamaño: " + tamañoMB + " MB");
    }
}