package Ejercicio1;
/*
Crea un programa que pida al usuario dos números y realice la división del primero entre el segundo.
Usa try-catch para capturar la excepción ArithmeticException que ocurre cuando se intenta dividir por cero.
Muestra un mensaje apropiado si ocurre el error.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int num2 = sc.nextInt();

        try {
            int division = num1 / num2;
            System.out.println(division);

        } catch (ArithmeticException e) {
            System.out.println("Estás intentando dividir entre 0");
        }

    }
}
