package Ejercicio4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
    Crear una aplicación que permita realizar el sorteo del mundial. Para ello el
    sistema pedirá los nombres de las selecciones de los dos bombos, 5 por bombo.
    Una vez introducidos. Mostrar los emparejamientos de los equipos. Ten en cuenta
    que un mismo equipo no puede jugar más de un partido.
     */

    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();

    static String[] bombo1 = new String[5];
    static String[] bombo2 = new String[5];

    public static void main(String[] args) {

        //Asignar valores bombos 1 y 2
        asignarValores(bombo1);
        asignarValores(bombo2);

        //Realizar emparejamientos
        emparejamiento(bombo1, bombo2);

    }

    private static void asignarValores(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el nombre de la selección " + i + " del bombo 1");
            array[i] = sc.next();
        }
    }

    private static void mostrarArray(String[] array) {
        for (String item : array) {
            System.out.print(item + "\t");
        }
    }

    private static void emparejamiento(String[] array, String[] array2) {
        String[] replicaArray = array2.clone();

        //Aleatorizar bombo2
        for (int i = 0; i < replicaArray.length; i++) {
            int j = rd.nextInt();
            String temp = replicaArray[i];
            replicaArray[i] = replicaArray[j];
            replicaArray[j] = temp;
        }

        //Emparejamientos
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " vs " + replicaArray[i]);
        }
    }
}
