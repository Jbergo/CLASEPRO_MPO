package Ejercicio2;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaMatematica, notaProgramacion, notaIngles;

    public Estudiante(String nombre, int edad, double notaMatematica, double notaProgramacion, double notaIngles) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMatematica = notaMatematica;
        this.notaProgramacion = notaProgramacion;
        this.notaIngles = notaIngles;
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

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaProgramacion() {
        return notaProgramacion;
    }

    public void setNotaProgramacion(double notaProgramacion) {
        this.notaProgramacion = notaProgramacion;
    }

    public double getNotaIngles() {
        return notaIngles;
    }

    public void setNotaIngles(double notaIngles) {
        this.notaIngles = notaIngles;
    }

    public double calcularPromedio() {
        return (notaIngles+notaMatematica+notaProgramacion)/3;
    }

    public boolean estaAprobado() {
        if (calcularPromedio()>=5){
            return true;
        }
        return false;
    }

    public String obtenerCalificacion() {
        double nota = calcularPromedio();
        if (nota>=9&&nota<=10) {
            return "Sobresaliente";
        } else if (nota>=7&&nota<9) {
            return "Notable";
        } else if(nota>=6&&nota<7) {
            return "Bien";
        } else if(nota>=5&&nota<6) {
            return "Suficiente";
        }
        return "Insuficiente";
    }

    public void mostrarInforme() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nota Matemática: " + getNotaMatematica());
        System.out.println("Nota Programación: " + getNotaProgramacion());
        System.out.println("Nota Inglés: " + getNotaIngles());
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Calificación: " + obtenerCalificacion());
    }

}
