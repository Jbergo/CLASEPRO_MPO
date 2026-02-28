package ejercicio6;

public class Estudiante {
    private String nombre;
    private int edad;
    private double calificacion;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double clasificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
