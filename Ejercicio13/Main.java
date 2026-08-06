package Ejercicio13;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Diagrama de Clases (Representación en Consola) ===");
        System.out.println("[ Persona ]  <|--- Hereda --- [ Estudiante ]");
        System.out.println("+ String nombre                 + String carnet (Ej. 0900-25-15758)");
        System.out.println("+ int edad                      + String carrera");
        System.out.println();
        System.out.println("          [ Estudiante ] "1" ---- "N" [ Curso ]");
        System.out.println("                                      + String nombreCurso");
    }
}