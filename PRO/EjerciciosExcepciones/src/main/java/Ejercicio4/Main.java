package Ejercicio4;

/*
Crea una clase EdadInvalidaException que herede de Exception.
Crea un método validarEdad(int edad) que lance esta excepción si la edad es menor que 0 o mayor que 120.
En el método main, pide al usuario su edad y usa try-catch para capturar y manejar la excepción personalizada.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una edad");
        int edad = sc.nextInt();

        try {
            validarEdad(edad);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException{
        if (edad<0||edad>120) {
            throw new EdadInvalidaException("Edad inválida");
        }
    }
}
