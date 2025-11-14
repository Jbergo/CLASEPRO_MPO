package ejercicio1;

import java.util.Scanner;

public class Main {

    /*
    Crea un programa de adivinación de números El programa genera de manera
    aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
    máximo de 7 intentos. Después de cada intento, indica si el número es mayor
    o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
    de intentos utilizado; si no, mostrar un aviso de que debe introducir
    nuevamente un número.

    0- Necesito pedir cosas por teclado
    1- Generar un aleatorio entre 1-50
    2- 7 intentos/repeticiones mientras no se acierta
    3- Indicar si el número es mayor o menor del elegido
    4- Mostrar un aviso con el número de intentos utilizado
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        int numeroSistema = (int)(Math.random()*50)+1;
        int intentos = 7;
        int numeroUsuario;
        boolean acierto = false;

        do {
            System.out.println("Indica el número con el que juegas");
            numeroUsuario = sc.nextInt();
            intentos--;

            if (numeroUsuario==numeroSistema){
                System.out.println("Has acertado el número");
                acierto = true;
                break;
            } else {
                if (numeroSistema<numeroUsuario){
                    System.out.println("Número demasiado grande");
                } else {
                    System.out.println("Número demasiado pequeño");
                }
            }

            System.out.println("Has consumido "+(7-intentos)+" intentos");
        } while (intentos>0);

        if (!acierto) {
            System.out.println("Has perdido");
        }

        sc.close();
    }
}