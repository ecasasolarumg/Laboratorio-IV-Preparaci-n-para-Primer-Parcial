package Ejercicio1;

public abstract class Animal {
    
    protected String nombre;
    
   
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    // Método abstracto (no tiene llaves {}, solo define la acción)
    public abstract void hacerSonido();
}