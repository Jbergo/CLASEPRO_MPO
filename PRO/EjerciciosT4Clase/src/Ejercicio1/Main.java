package Ejercicio1;

import java.util.Scanner;

public class Main {
    /*
    Crea un programa que permita sumar arrays multidimensionales. Para ello
    siguiente estos pasos:
        a. Pide al usuario el tamaño de las matrices
        b. Se crearán automáticamente dos matrices con números aleatorios entre 0 y
            50
        c. Se crea una tercera matriz llamada sumaMatrices donde se guarda la suma
            de las celdas de las generadas en el punto anterior
        d. Mostrar cada una de las matrices donde cada una tiene un titulo diferente
            para poder identificarlas
     */

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //Definir variables y array
        System.out.println("Introduce el tamaño de las matrices");
        int tamanio = sc.nextInt();

        int[][] matriz1 = new int[tamanio][tamanio];
        int[][] matriz2 = new int[tamanio][tamanio];
        int[][] matriz3 = new int[tamanio][tamanio];

        //Asignar números a los array
        asignarNumArray(matriz1);
        asignarNumArray(matriz2);

        //Suma matrices en una nueva
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        //Mostrar matrices
        System.out.println("Matriz 1");
        mostrarArray(matriz1);

        System.out.println("Matriz 2");
        mostrarArray(matriz2);

        System.out.println("Suma de las matrices");
        mostrarArray(matriz3);

    }

    private static void asignarNumArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 51);
            }
        }
    }

    private static void mostrarArray(int[][] array) {
        for (int[] item : array) {
            for (int anItem : item) {
                System.out.print(anItem + "\t");
            }
            System.out.println();
        }

    }
}