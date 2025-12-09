package Ejercicio2;

import java.util.Scanner;

public class Main {
    /*
    Crea un array de 10 posiciones y rellénalo con números aleatorios entre el 1
    y el 20, pudiendo repetirse. Una vez rellenado, crear un menú para que el usuario
    seleccione la acción que quiere realizar:
        a. Imprimir array
        b. Mover a izquierda
        c. Mover a derecha
        d. Invertir
     */

    static Scanner sc = new Scanner(System.in);

    static int[] matriz = new int[10];

    public static void main(String[] args) {

        //Asignar valores matriz
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = (int) (Math.random() * 20) + 1;
        }

        //Menú
        int opcion = 0;
        do {
            System.out.println("""
                    
                    Elige una opción a realizar:
                    1. Imprimir array
                    2. Mover a izquierda
                    3. Mover a derecha
                    4. Invertir
                    5. Salir
                    """);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    mostrarArray(matriz);
                }
                case 2 -> {
                    System.out.println("Moviendo una posición a la izquierda");

                    int temporal = matriz[0];

                    for (int i = 0; i < matriz.length - 1; i++) {
                        matriz[i] = matriz[i + 1];
                    }
                    matriz[matriz.length - 1] = temporal;

                    mostrarArray(matriz);
                }
                case 3 -> {
                    System.out.println("Moviendo una posición a la derecha");

                    int temporal = matriz[matriz.length - 1];

                    for (int i = matriz.length - 1; i > 0; i--) {
                        matriz[i] = matriz[i - 1];
                    }

                    matriz[0] = temporal;

                    mostrarArray(matriz);
                }
                case 4 -> {
                    System.out.println("Inviertiendo array");

                    for (int i = 0; i < matriz.length / 2; i++) {
                        int temporal = matriz[i];
                        matriz[i] = matriz[matriz.length - 1 - i];
                        matriz[matriz.length - 1 - i] = temporal;
                    }

                    mostrarArray(matriz);
                }
                case 5 -> {
                    System.out.println("Programa finalizado");
                }
            }
        } while (opcion != 5);

    }

    private static void mostrarArray(int[] array) {
        System.out.println("Mostrando array");
        for (int item : array) {
            System.out.print(item + "\t");
        }
    }
}
