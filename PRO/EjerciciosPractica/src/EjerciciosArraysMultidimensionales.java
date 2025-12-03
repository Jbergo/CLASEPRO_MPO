import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosArraysMultidimensionales {
    Scanner sc = new Scanner(System.in);

    public void ejercicio1() {
        /*
        Crea un programa que defina una matriz de 3x3 con números del 1 al 9.
        Usa bucles for anidados para mostrar la matriz en formato de tabla.
        */

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9) + 1;
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void ejercicio2() {
        /*
        Desarrolla un programa que cree una matriz de 2x4.
        Usa bucles for anidados para pedir al usuario que
        introduzca 8 números y los almacene en la matriz.
        Al final, muestra la matriz completa.
         */

        int[][] matriz = new int[2][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce el valor de la matriz en posición " + i + "," + j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("MATRIZ COMPLETA:");
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        sc.close();
    }

    public void ejercicio3() {
        /*
        Escribe un programa que defina una matriz de 4x4 con números.
        Usa bucles for anidados para recorrer la matriz y calcular
        la suma de todos sus elementos.
        Muestra el resultado.
         */

        int[][] matriz = new int[4][4];

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 20);
                suma += matriz[i][j];
            }
        }

        System.out.println("Resultado = " + suma);
    }

    public void ejercicio4() {
        /*
        Crea un programa con una matriz de 3x5 con números.
        Pide al usuario un número a buscar y usa bucles for
        anidados para encontrarlo.
        Si existe, muestra su posición (fila y columna).
        Si no existe, indica que no se encontró.
         */

        int[][] matriz = new int[3][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) ((Math.random() * 15) + 1);
            }
        }

        /*
        for (int[] item : matriz) {
            for (int anitem : item) {
                System.out.print(anitem + "\t");
            }
            System.out.println();
        }
         */


        System.out.println("Introduce un número");
        int num = sc.nextInt();

        boolean acierto = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (num == matriz[i][j]) {
                    System.out.println("El número está en la posición " + i + "," + j);
                    acierto = true;
                }
            }
        }

        if (!acierto) {
            System.out.println("No se encontró el número en la matriz");
        }
        sc.close();
    }

    public void ejercicio5() {
        /*
        Desarrolla un programa que defina una matriz de 4x3 con números decimales.
        Usa bucles for anidados para calcular y mostrar el promedio de cada fila de la matriz.
         */

        double[][] matriz = new double[4][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (Math.random() * 15);
            }
        }

        double promedio = 0;
        for (double[] doubles : matriz) {
            for (double aDouble : doubles) {
                System.out.printf("%.2f" + "\t", aDouble);
                promedio += aDouble;
            }
            System.out.printf("Promedio = %.2f", (promedio / 3));
            System.out.println();
        }

    }

    public void ejercicio6() {
        /*
        Escribe un programa que cree una matriz de 3x4 con números.
        Usa bucles for para encontrar el número mayor de cada columna
        y muestra los resultados.
         */

        int[][] matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 15);
            }
        }

        for (int[] item : matriz) {
            for (int anitem : item) {
                System.out.print(anitem + "\t");
            }
            System.out.println();
        }

        int numMayor = 0;
        for (int[] item : matriz) {
            for (int anitem : item) {
                if (anitem > numMayor) {
                    numMayor = anitem;
                }
            }
            System.out.print("N.M.: " + numMayor + "\t");
            numMayor = 0;
        }

    }
}
