package Ejercicio2;

/*
Crea un programa que defina un array de 5 elementos con números enteros.
Pide al usuario una posición del array y muestra el elemento en esa posición.
Usa try-catch para capturar la excepción ArrayIndexOutOfBoundsException si el usuario introduce un índice inválido.
 */

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] elementos = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la posición a la que quieres acceder");
        int position = sc.nextInt();

        try {
            System.out.println(elementos[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("La posición es incorrecta, sobrepasa los límites del array");
        }
    }
}
