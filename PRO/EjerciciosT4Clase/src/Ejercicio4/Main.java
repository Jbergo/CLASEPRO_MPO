package Ejercicio4;

import java.util.Scanner;

public class Main {
    /*
    Crear una aplicación que permita realizar el sorteo del mundial. Para ello el
    sistema pedirá los nombres de las selecciones de los dos bombos, 5 por bombo.
    Una vez introducidos. Mostrar los emparejamientos de los equipos. Ten en cuenta
    que un mismo equipo no puede jugar más de un partido.
     */

    static Scanner sc = new Scanner(System.in);

    static String[] bombo1 = new String[5];
    static String[] bombo2 = new String[5];

    public static void main(String[] args) {

        //Asignar valores bombos 1 y 2
        for (int i = 0; i < bombo1.length; i++) {
            System.out.println("Introduce el nombre de la seleccion " + i + " del bombo 1");
            String seleccion = sc.next();
            bombo1[i] = seleccion;
        }

        for (int i = 0; i < bombo2.length; i++) {
            System.out.println("Introduce el nombre de la seleccion " + i + " del bombo 2");
            String seleccion = sc.next();
            bombo2[i] = seleccion;
        }


        //Mostrar bombo 1 y 2
        System.out.println("Bombo 1");
        mostrarArray(bombo1);

        System.out.println("\n Bombo 2");
        mostrarArray(bombo2);

    }

    private static void mostrarArray(String[] array) {
        for (String item : array) {
            System.out.print(item + "\t");
        }
    }
}
