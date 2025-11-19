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

        int j1i1, j1i2, j1i3, j2i1, j2i2, j2i3;
        int sum1, sum2;

        int i = 1;
        do {
            System.out.println("INTENTO " + i);
            j1i1 = (int) (Math.random() * 61);
            j1i2 = (int) (Math.random() * 61);
            j1i3 = (int) (Math.random() * 61);

            sum1 = j1i1 + j1i2 + j1i3;
            p1 -= sum1;

            j2i1 = (int) (Math.random() * 61);
            j2i2 = (int) (Math.random() * 61);
            j2i3 = (int) (Math.random() * 61);

            sum2 = j2i1 + j2i2 + j2i3;
            p2 -= sum2;

            if (p1 == 0) {
                System.out.println("¡JUGADOR 1 HA GANADO LA PARTIDA!");
                System.out.println("Intentos realizados: " + i);
                return;
            } else if (p2 == 0) {
                System.out.println("¡JUGADOR 2 HA GANADO LA PARTIDA!");
                System.out.println("Intentos realizados: " + i);
                return;
            } else if (p1 < 0) {
                System.out.println("JUGADOR 1 se ha pasado de la puntuación");
                System.out.println("Vuelve a intentarlo!");
                p1 += sum1;
                System.out.println("RESUMEN INTENTO " + i + ":\n" + "Jugador 1 : " + p1 + "\n" + "Jugador 2 : " + p2);
                i++;
            } else if (p2 < 0) {
                System.out.println("JUGADOR 2 se ha pasado de la puntuación");
                System.out.println("Vuelve a intentarlo!");
                p2 += sum2;
                System.out.println("RESUMEN INTENTO " + i + ":\n" + "Jugador 1 : " + p1 + "\n" + "Jugador 2 : " + p2);
                i++;
            } else {
                System.out.println("RESUMEN INTENTO " + i + ":\n" + "Jugador 1 : " + p1 + "\n" + "Jugador 2 : " + p2);
                i++;
            }


        } while (true);


    }
}
