package Ejercicio3;

/*
Crea un programa que pida al usuario que introduzca un número como texto y lo convierta a entero usando Integer.parseInt().
Usa try-catch para capturar la excepción NumberFormatException si el usuario introduce algo que no es un número válido.
El programa debe seguir pidiendo un número hasta que el usuario introduzca uno válido.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        String numText = sc.next();

        boolean action = false;
        do {
            try {
                int num = Integer.parseInt(numText);
                System.out.println(num);
                action = true;
            } catch (NumberFormatException e) {
                System.out.println("Carácter no válido");
                System.out.println("Introduce un número");
                numText = sc.next();
            }
        } while (!action);

    }
}
