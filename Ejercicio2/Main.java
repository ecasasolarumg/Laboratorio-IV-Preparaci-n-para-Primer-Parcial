package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        
        Vehiculo miNave = new Carro("Toyota", "IA", 4);
        Vehiculo miMoto = new Moto("Suzuki","2025",125);

        System.out.println("---Registro de Vehículos---");

        miNave.mostrarDatos();
        miMoto.mostrarDatos();

    }
    
}
