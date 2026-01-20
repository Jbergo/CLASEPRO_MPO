package Ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;

public class SistemaCalificaciones {
    private HashMap<String, ArrayList<Double>> calificaciones;

    public SistemaCalificaciones() {
        calificaciones = new HashMap<>();
    }

    public void agregarEstudiante(String nombre) {
        calificaciones.put(nombre, new ArrayList<>());
    }

    public void agregarCalificacion(String nombre, double calificacion) {
        calificaciones.get(nombre).add(calificacion);
    }

    public double calcularPromedio(String nombre) {
        double promedio = 0;
        for (double item : calificaciones.get(nombre)) {
            promedio += item;
        }
        return promedio / calificaciones.get(nombre).size();
    }

    public void mostrarCalificaciones(String nombre) {
        System.out.println("Calificaciones: ");
        for (double item : calificaciones.get(nombre)) {
            System.out.println("Nota: " + item);
        }
    }

    public String mejorEstudiante() {
        String estudiante = "";
        double notaEstudiante = 0;
        for (String persona : calificaciones.keySet()) {
            double promedio = calcularPromedio(persona);
            if (promedio > notaEstudiante) {
                notaEstudiante = promedio;
                estudiante = persona;
            }
        }
        return "Estudiante con la mejor nota: " + estudiante;
    }

    public void listarEstudiantesAprobados(double notaMinima) {
        for (String estudiante : calificaciones.keySet()) {
            double promedio = calcularPromedio(estudiante);
            if (promedio >= notaMinima) {
                System.out.println(estudiante);
            }
        }

    }

    public double promedioGeneral() {
        double promedioTotal = 0;

        for (String estudiante : calificaciones.keySet()) {
            promedioTotal += calcularPromedio(estudiante);
        }

        return promedioTotal / calificaciones.size();
    }

    public HashMap<String, ArrayList<Double>> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(HashMap<String, ArrayList<Double>> calificaciones) {
        this.calificaciones = calificaciones;
    }
}
