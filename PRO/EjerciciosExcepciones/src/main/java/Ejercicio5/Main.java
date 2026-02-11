package Ejercicio5;

/*
Crea un programa que pida al usuario dos números y la operación a realizar (+, -, *, /).
Usa múltiples bloques catch para manejar diferentes excepciones:
ArithmeticException (división por cero), NumberFormatException (entrada no numérica) e InputMismatchException (si usas Scanner).
Añade un bloque finally que siempre muestre el mensaje "Fin del programa".
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Introduce el primer número");
            int num1 = sc.nextInt();
            System.out.println("Introduce el segundo número");
            int num2 = sc.nextInt();
            System.out.println("Qué operación quieres realizar?: Suma, Resta, Multiplicacion o Division");
            String op = sc.next();
            switch (op.toLowerCase()) {
                case "suma" -> {
                    System.out.println(num1 + num2);
                }
                case "resta" -> {
                    System.out.println(num1 - num2);
                }
                case "multiplicacion" -> {
                    System.out.println(num1 * num2);
                }
                case "division" -> {
                    System.out.println(num1 / num2);
                }
                default -> {
                    System.out.println("No ha habido coincidencia con ninguna operacion");
                }
            }
        } catch (ArithmeticException e) {
            System.out.println("División entre 0");
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida");
        } catch (InputMismatchException e) {
            System.out.println("Problema con el Scanner");
        } finally {
            System.out.println("Fin del programa");
        }

    }
}
