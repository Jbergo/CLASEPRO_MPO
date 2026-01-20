package Ejercicio4;

public class Main {
    public static void main(String[] args) {

        SistemaCalificaciones calificaciones = new SistemaCalificaciones();
        calificaciones.agregarEstudiante("jorge");
        calificaciones.agregarCalificacion("jorge", 8);
        calificaciones.agregarCalificacion("jorge", 7);
        calificaciones.agregarCalificacion("jorge", 6);
        calificaciones.agregarEstudiante("david");
        calificaciones.agregarCalificacion("david", 4);
        calificaciones.agregarCalificacion("david", 4);
        calificaciones.agregarCalificacion("david", 4);
        System.out.println(calificaciones.calcularPromedio("jorge"));
        calificaciones.mostrarCalificaciones("jorge");
        System.out.println(calificaciones.mejorEstudiante());
        calificaciones.listarEstudiantesAprobados(5);
        System.out.println(calificaciones.promedioGeneral());
    }
}
