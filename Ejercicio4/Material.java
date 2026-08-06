package Ejercicio4;

public abstract class Material {
    protected String titulo;
    protected String autor;

    public Material(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract void mostrarInformacion();
}