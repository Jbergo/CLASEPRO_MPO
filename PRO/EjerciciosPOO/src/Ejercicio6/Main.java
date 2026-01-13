package Ejercicio6;

/*
Crea una clase Estudiante con atributos privados nombre, edad y nota.
La nota debe estar entre 0 y 10. Implementa el setter de nota validando
que esté en el rango correcto (si no lo está, muestra un mensaje de error).
Crea un objeto y prueba con diferentes valores.
 */

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Jorge", 5);
        System.out.println(estudiante.setNota(77));
        System.out.println(estudiante.getNota());
    }
}
