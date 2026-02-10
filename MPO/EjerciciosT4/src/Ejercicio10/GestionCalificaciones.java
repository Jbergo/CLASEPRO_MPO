package Ejercicio10;

import java.util.List;
import java.util.function.*;

public class GestionCalificaciones {
    public double calcularNotaFinal(Alumno alumno) {
        BiFunction<Double, Double, Double> notaFinal = (aDouble, aDouble2) -> aDouble * 0.4 + aDouble2 * 0.6;
        return notaFinal.apply(alumno.getNotaPractica(), alumno.getNotaTeoria());
    }

    public void estaAprobado(Alumno alumno) {
        BiPredicate<Double, Double> aprobado = (aDouble, aDouble2) -> aDouble >= 5 && aDouble2 >= 5;
        if (aprobado.test(alumno.getNotaPractica(), alumno.getNotaTeoria())) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }
    }

    public void convertNumLetra(Alumno alumno) {
        Function<Double, Character> conversion = aDouble -> {
            if (aDouble >= 9) return 'A';
            if (aDouble >= 7) return 'B';
            if (aDouble >= 6) return 'C';
            if (aDouble >= 5) return 'D';
            return 'F';
        };
        System.out.println(conversion.apply(calcularNotaFinal(alumno)));
    }

    public void mostrarInforme(Alumno alumno, String nombre) {
        BiConsumer<Alumno, String> informe = (alum, s) -> {
            if (alum.getNombre().equalsIgnoreCase(s)) {
                alum.mostrarDatos();
                calcularNotaFinal(alum);
                convertNumLetra(alum);
                estaAprobado(alum);
            }
        };

        informe.accept(alumno, nombre);
    }

    public void filtrarAprobados(List<Alumno> listAlumnos) {
        Predicate<Alumno> aprobado = alumno -> {
            double notaFinal = calcularNotaFinal(alumno);
            return notaFinal >= 5;
        };

        Predicate<Alumno> suspenso = alumno -> {
            double notaFinal = calcularNotaFinal(alumno);
            return notaFinal < 5;
        };

        List<Alumno> aprobados = listAlumnos.stream().filter(aprobado).toList();
        List<Alumno> suspensos = listAlumnos.stream().filter(suspenso).toList();

        System.out.println("Aprobados:");
        aprobados.forEach(alumno -> System.out.println(alumno.getNombre()));
        System.out.println("---------------------");
        System.out.println("Suspensos:");
        suspensos.forEach(alumno -> System.out.println(alumno.getNombre()));
    }
}
