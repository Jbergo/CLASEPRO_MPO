package Ejercicio1;

import Ejercicio1.controller.GestionNotas;
import Ejercicio1.model.Alumno;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static GestionNotas notas = new GestionNotas();

    public static void main(String[] args) {

        int opcion;
        do {
            System.out.println("""
                    MENÚ:
                    1- Introducir alumno
                    2- Buscar alumno
                    3- Ver mejores expedientes
                    4- Ver expedientes superiores a una nota
                    5- Vaciar lista
                    6- Salir
                    Introduce la opción a realizar
                    """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Introduciendo al alumno");
                    System.out.println("-----------------------");
                    System.out.println("Introduce su nombre");
                    String nombre = sc.next();
                    System.out.println("Introduce su apellido");
                    String apellido = sc.next();
                    System.out.println("Introduce su DNI");
                    String dni = sc.next();
                    System.out.println("Introduce su nota");
                    double nota = sc.nextDouble();

                    if (notas.introducirAlumno(dni, nombre, apellido, nota)) {
                        System.out.println("Alumno agregado correctamente");
                    } else {
                        System.out.println("Alumno duplicado");
                    }
                }

                case 2 -> {
                    System.out.println("Buscando al alumno");
                    System.out.println("------------------");
                    System.out.println("Introduce el DNI del alumno");
                    String dni = sc.next();

                    System.out.println(notas.buscarAlumnoNota(dni));
                }

                case 3 -> {
                    System.out.println("Viendo mejores expedientes");
                    System.out.println("--------------------------");
                    System.out.println("Introduce el límite de búsqueda");
                    int limite = sc.nextInt();

                    for (Alumno alumno : notas.verMejoresExpedientes(limite)) {
                        System.out.println(alumno.getNombre());
                        System.out.println(alumno.getNota());
                    }

                }

                case 4 -> {
                    System.out.println("Viendo expedientes superiores a la nota");
                    System.out.println("---------------------------------------");
                    System.out.println("Introduce la nota mínima");
                    double nota = sc.nextDouble();

                    for (Alumno alumno : notas.verExpedientesSuperiores(nota)) {
                        System.out.println(alumno.getNombre());
                        System.out.println(alumno.getNota());
                    }

                }

                case 5 -> {
                    System.out.println("Lista vaciada");
                    notas.vaciarLista();
                }

                case 6 -> {
                    System.out.println("Saliendo");
                }

            }
        } while (opcion != 6);

    }
}
