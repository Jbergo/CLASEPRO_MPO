package ejercicio4;

import java.util.Scanner;

public class Main {
    /*
    Crea un programa para jugar una partida virtual de dardos entre dos
    jugadores. El objetivo es que uno de los jugadores llegue exactamente a 0 puntos
    partiendo desde 301.

    Reglas:
    • Nada más empezar pide el nombre de cada jugador.
    • Cada jugador comienza con 301 puntos.
    • En cada turno, un jugador lanza 3 dardos. Cada dardo genera un número
      aleatorio entre 0 y 60 (simulando puntuación en dardos).
    • La puntuación del turno es la suma de los 3 dardos.
    • Resta la puntuación del turno al total de puntos del jugador.
    • Si la puntuación restante es menor que 0, se considera que el jugador "se
      pasa" y su total no cambia ese turno.
    • El primer jugador que llegue exactamente a 0 gana la partida.
    • Después de cada turno, muestra las puntuaciones actuales y quién va
      ganando (el que tiene menos puntos).
    • Al finalizar, muestra el ganador y cuántos turnos tomó la partida.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del primer jugador");
        String j1 = sc.next();
        System.out.println("Nombre del segundo jugador");
        String j2 = sc.next();

        int p1 = 301;
        int p2 = 301;

        int i = 1;
        while (true) {
            System.out.println("TURNO " + i);

            /*JUGADOR 1*/
            int j1i1 = (int) (Math.random() * 61);
            int j1i2 = (int) (Math.random() * 61);
            int j1i3 = (int) (Math.random() * 61);

            int sum1 = j1i1 + j1i2 + j1i3;

            if (p1 - sum1 < 0) {
                System.out.println("JUGADOR 1 se ha pasado de la puntuación");
                System.out.println("Vuelve a intentarlo!");
            } else {
                p1 -= sum1;
            }

            /*JUGADOR 2*/
            int j2i1 = (int) (Math.random() * 61);
            int j2i2 = (int) (Math.random() * 61);
            int j2i3 = (int) (Math.random() * 61);

            int sum2 = j2i1 + j2i2 + j2i3;

            if (p2 - sum2 < 0) {
                System.out.println("JUGADOR 2 se ha pasado de la puntuación");
                System.out.println("Vuelve a intentarlo!");
            } else {
                p2 -= sum2;
            }

            /*MOSTRAR RESULTADO Y QUIEN VA GANANDO*/
            System.out.println("RESUMEN INTENTO " + i + ":\n" + "Jugador 1 : " + p1 + "\n" + "Jugador 2 : " + p2);
            if (p1>p2){
                System.out.println("¡JUGADOR 1 va por delante!");
            } else if (p1<p2){
                System.out.println("¡JUGADOR 2 va por delante!");
            } else {
                System.out.println("¡Empate!");
            }

            /*COMPROBAR GANADOR*/
            if (p1 == 0) {
                System.out.println("¡JUGADOR 1 HA GANADO LA PARTIDA!");
                System.out.println("Intentos realizados: " + i);
                break;
            } else if (p2 == 0) {
                System.out.println("¡JUGADOR 2 HA GANADO LA PARTIDA!");
                System.out.println("Intentos realizados: " + i);
                break;
            }

            i++;
        }
    }
}
