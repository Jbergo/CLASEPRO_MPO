package Ejercicio3;

import java.util.Scanner;

public class Main {
    /*
    Desarrolla un programa en Java que permita registrar, calcular e informar
    las notas de varios alumnos utilizando arrays.
        a. Declara un array de tipo double para almacenar las notas de 10 alumnos.
        b. Solicita al usuario que introduzca las 10 notas. En caso de introducir una
        nota inferior a 0 y superior a 10 volverá a pedirla
        c. Calcula y muestra:
            i. La nota media de la clase.
            ii. La nota más alta y la más baja.
            iii. Cuántos alumnos han aprobado (nota igual o mayor a 5) y cuántos han
            suspendido.
     */
    
    /*
        alumno1 -> {nota1, nota2, nota3, ..., nota10}
        alumno2 -> {nota1, nota2, nota3, ..., nota10}
        alumno3 -> {nota1, nota2, nota3, ..., nota10}
        ...
        alumno10 -> {nota1, nota2, nota3, ..., nota10}
     */

    static Scanner sc = new Scanner(System.in);

    static double[][] notasAlumnos = new double[10][10];

    public static void main() {

        //Pedir las notas
        asignarNotas(notasAlumnos);

        //Mostrar notasAlumnos
        mostrarArray(notasAlumnos);

        //Calcular nota media de la clase
        CalculoNotas calculoNotas = new CalculoNotas();
        calculoNotas.notaMedia(notasAlumnos);

        //Calcular nota alta y baja
        System.out.println();
        calculoNotas.notaAltaBaja(notasAlumnos);

        //Calcular aprobados y suspensos
        System.out.println();
        calculoNotas.aprobadosSuspensos(notasAlumnos);
    }

    private static void mostrarArray(double[][] array) {
        for (double[] item : array) {
            System.out.println("Alumno");
            for (double anItem : item) {
                System.out.printf("%.2f\t", anItem);
            }
            System.out.println();
        }
    }

    private static void asignarNotas(double[][] array) {

        // Opción correcta
        /*
        for (int i = 0; i < notasAlumnos.length; i++) {
            for (int j = 0; j < notasAlumnos[i].length; j++) {
                System.out.println("Introduce la nota " + j + " del alumno " + i);
                double nota = sc.nextDouble();
                validarNota(nota);
                notasAlumnos[i][j] = nota;
            }
        }
        */

        //Opción más eficiente
        for (int i = 0; i < notasAlumnos.length; i++) {
            for (int j = 0; j < notasAlumnos[i].length; j++) {
                notasAlumnos[i][j] = Math.random()*11;
            }
        }
    }

    private void validarNota(double num) {
        while(num < 0 || num > 10){
            System.out.println("Nota incorrecta, vuelve a introducirla");
            num = sc.nextDouble();
        }
    }
}
