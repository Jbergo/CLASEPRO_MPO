package Ejercicio6;

public class Estudiante {
    private String nombre;
    private int edad;
    private double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public String setNota(double nota) {
        if (nota>=0&&nota<=10) {
            this.nota = nota;
            return "Nota Correcta";
        }
        return "Nota no válida";
    }

}
