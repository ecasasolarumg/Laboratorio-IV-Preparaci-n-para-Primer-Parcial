package Ejercicio14;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Diagrama de Secuencia (Interacción Estudiante) ===");
        System.out.println("1. [Usuario] -> solicitaInformacion() -> [Sistema]");
        System.out.println("2. [Sistema] -> buscarDatos(Luis Rodolfo Porras García) -> [Base de Datos]");
        System.out.println("3. [Base de Datos] -> retornaRegistro() -> [Sistema]");
        System.out.println("4. [Sistema] -> mostrarEnPantalla() -> [Usuario]");
    }
}