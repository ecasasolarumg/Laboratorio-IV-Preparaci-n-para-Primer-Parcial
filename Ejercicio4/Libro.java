package Ejercicio4;

public class Libro extends Material {
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | Páginas: " + numeroPaginas);
    }
}