package Ejercicio4;

public class Revista extends Material {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int numeroEdicion) {
        super(titulo, autor);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Revista: " + titulo + " | Autor: " + autor + " | Edición N°: " + numeroEdicion);
    }
}