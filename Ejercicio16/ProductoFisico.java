package Ejercicio16;
public class ProductoFisico extends Producto {
    private double pesoKg;
    public ProductoFisico(String nombre, double precio, double pesoKg) {
        super(nombre, precio);
        this.pesoKg = pesoKg;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("Producto Físico: " + nombre + " | Precio: Q" + precio + " | Peso: " + pesoKg + " kg");
    }
}