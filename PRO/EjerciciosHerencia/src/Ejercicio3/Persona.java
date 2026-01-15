package Ejercicio3;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void presentarse(){
        System.out.println("Hola");
        System.out.println("Me llamo " + nombre);
        System.out.println("Tengo " + edad + " años");
    }

}
