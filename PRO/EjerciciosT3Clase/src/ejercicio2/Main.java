package ejercicio2;

import java.util.Scanner;

public class Main {
    /*
    Crea una aplicación que simule el funcionamiento del wordle. Para ello realiza
    las siguientes acciones:
        a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)
        b. El programa debe seleccionar aleatoriamente una palabra del array y
            almacenarla como la palabra secreta.
        c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
        d. En cada intento, el usuario introduce una palabra por teclado.
        e. Tras cada intento, el programa debe indicar al usuario:
                i. Aciertos: cuántas letras tiene en la misma posición que la palabra
                   secreta.
                ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
                    posición diferente.
                iii. Fallos: cuántas letras no están presentes en la palabra secreta.
    El juego termina cuando el usuario adivina la palabra o se acaban los 5 intentos.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        String[] palabras = {"datos", "cosas", "lucia", "manta"};
        String palabraSecreta = palabras[(int) (Math.random() * 4)];
        System.out.println("PALABRA SECRETA: " + palabraSecreta);

        int intentos = 5;
        String palabraUsuario;


        do {
            System.out.println("Introduce una palabra");
            do {
                palabraUsuario = sc.next();
            } while (palabraUsuario.length() != 5);

            System.out.println("Intento gastado");
            intentos--;

            int numAcierto = 0, numAprox = 0, numError = 0;

            if (palabraUsuario.equals(palabraSecreta)) {
                System.out.println("Palabra adivinada");
                numAcierto = 5;
                break;
            } else {
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraUsuario.charAt(i) == palabraSecreta.charAt(i)) {
                        numAcierto++;
                    } else if (palabraSecreta.contains(String.valueOf(palabraUsuario.charAt(i)))) {
                        numAprox++;
                    } else {
                        numError++;
                    }
                }
            }

            System.out.println("El número de aciertos es: " + numAcierto);
            System.out.println("El número de aproximaciones es: " + numAprox);
            System.out.println("El número de fallos es: " + numError);

        } while (intentos > 0);

        System.out.println("Fin del juego");
        sc.close();
    }
}
