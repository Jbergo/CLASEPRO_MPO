package Ejercicio10;

/*
**Ejercicio 10 - Sistema Completo: Gestor de Calificaciones Avanzado**

Crea un sistema de gestión de calificaciones que utilice:

- BiFunction para calcular la nota final (teoría 60%, práctica 40%)
- BiPredicate para verificar si un alumno ha aprobado (nota >= 5)
- Function para convertir notas numéricas a letras (A, B, C, D, F)
- BiConsumer para imprimir el informe completo del alumno
- Predicate para filtrar alumnos aprobados/suspensos

Implementa una clase Alumno con nombre, nota de teoría y nota de práctica.
Crea una lista de al menos 8 alumnos y aplica todas las funciones lambda para generar un informe completo.
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Alumno> alumnos = List.of(
                new Alumno("Ana", 8.5, 7.0),
                new Alumno("Luis", 3.0, 5.5),
                new Alumno("Marta", 9.0, 8.0),
                new Alumno("Carlos", 7.5, 6.0),
                new Alumno("Sofía", 5.0, 6.5),
                new Alumno("Javier", 8.0, 9.0),
                new Alumno("Elena", 6.5, 7.5),
                new Alumno("Pablo", 4.5, 5.0)
        );


        GestionCalificaciones gestion = new GestionCalificaciones();

        /*alumnos.forEach(alumno -> {
            System.out.println(alumno.getNombre());
            System.out.println(gestion.calcularNotaFinal(alumno));
            gestion.convertNumLetra(alumno);
            gestion.estaAprobado(alumno);
            System.out.println("-----------------------");
        });*/

        //alumnos.forEach(alumno -> gestion.mostrarInforme(alumno, "luis"));

        //gestion.filtrarAprobados(alumnos);
    }
}
