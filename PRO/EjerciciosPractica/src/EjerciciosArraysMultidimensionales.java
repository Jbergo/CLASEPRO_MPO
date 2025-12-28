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

        for (int i = 0; i < matriz[0].length; i++) {
            int numMayor = matriz[0][i];
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[j][i] > numMayor) {
                    numMayor = matriz[j][i];
                }
            }
            System.out.println("NumMayor: " + numMayor);
        }

    }

    public void ejercicio7() {
        /*
        Crea un programa que defina una matriz de 3x4.
        Usa bucles for anidados para crear una nueva matriz
        transpuesta (4x3) donde las filas se convierten en columnas.
        Muestra ambas matrices.
         */

        int[][] matriz = new int[3][4];

        //Asignar valores a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 14);
            }
        }

        System.out.println("Matriz original");
        //Mostrar matriz
        for (int[] item : matriz) {
            for (int anitem : item) {
                System.out.print(anitem + "\t");
            }
            System.out.println();
        }

        int[][] matriz2 = new int[matriz[0].length][matriz.length];

        //Recorrer matriz y guardar en matriz2
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz2[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transpuesta");
        //Mostrar matriz2
        for (int[] item : matriz2) {
            for (int anitem : item) {
                System.out.print(anitem + "\t");
            }
            System.out.println();
        }

    }

    public void ejercicio8() {
        /*
        Desarrolla un programa que cree una matriz de 4x5 con números enteros.
        Usa bucles for anidados para contar cuántos números
        pares e impares hay en toda la matriz.
        Muestra ambos contadores.
         */

        //Creación array y variables
        int[][] matriz = new int[4][5];
        int pares = 0, impares = 0;

        //Asignar valores a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 25);
            }
        }

        //Validación par o impar
        for (int[] item : matriz) {
            for (int anitem : item) {
                if (anitem % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        //Mostrar resultado
        System.out.println("Pares: " + pares + "\t Impares: " + impares);

    }

    public void ejercicio9() {
        /*
        Escribe un programa que genere una matriz de 10x10 que
        represente las tablas de multiplicar del 1 al 10.
        Usa bucles for anidados para llenar la matriz donde
        cada elemento [i][j] contenga el resultado de (i+1) * (j+1).
        Muestra la matriz completa.
        */

        //Crear array
        int[][] matriz = new int[10][10];

        //Asignar valores a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }

        //Mostrar matriz
        for (int[] item : matriz) {
            for (int anitem : item) {
                System.out.print(anitem + "\t");
            }
            System.out.println();
        }

    }

    public void ejercicio10() {
        /*
        Desarrolla un programa que pida al usuario cuántos estudiantes
        y cuántas asignaturas hay. Crea una matriz para almacenar las
        notas (estudiantes x asignaturas).
        Usa bucles for anidados para rellenar la matriz con las notas.
        Luego:
            1. Muestra todas las notas en formato de tabla

            2. Calcula y muestra el promedio de cada estudiante

            3. Calcula y muestra el promedio de cada asignatura

            4. Encuentra la nota más alta de toda la clase y su posición
         */

        /*
                         asignatura 1 | asignatura 2 | asignatura 3 | asignatura4
        Estudiante 1 -> {nota1        , nota 2       , nota 3       , nota4      }
        Estudiante 2 -> {nota1        , nota 2       , nota 3       , nota4      }
        Estudiante 3 -> {nota1        , nota 2       , nota 3       , nota4      }
         */

        //Crear array con nº estudiantes
        System.out.println("¿Cuántos estudiantes hay?");
        int nAlumnos = sc.nextInt();
        System.out.println("¿Cuántas asignaturas tienen?");
        int nAsignaturas = sc.nextInt();

        int[][] notas = new int[nAlumnos][nAsignaturas];

        //Almacenar nota en notas
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Introduce la nota " + (j + 1) + " del estudiante " + (i + 1));
                int nota = sc.nextInt();
                while (!(nota >= 0 && nota <= 10)) {
                    System.out.println("Nota incorrecta, vuelve a introducirla");
                    nota = sc.nextInt();
                }
                notas[i][j] = nota;
            }
        }

        //Mostrar notas
        for (int[] nota : notas) {
            System.out.println("Estudiante " + (notas.length + 1));
            for (int i : nota) {
                System.out.print(i + "\t" + "|" + "\t");
            }
            System.out.println();
        }

        //Calcular promedio de cada estudiante
        int acumuladorEst = 0, nNotas = 1;
        for (int[] item : notas) {
            for (int anItem : item) {
                acumuladorEst += anItem;
                nNotas++;
            }
            System.out.println("Promedio: " + (acumuladorEst / nNotas));
            acumuladorEst = 0;
            nNotas = 1;
        }

        //Calcular promedio de cada asignatura
        int acumuladorAs = 0;
        for (int i = 0; i < notas[0].length; i++) {
            for (int[] nota : notas) {
                acumuladorAs += nota[i];
            }
            System.out.println("Promedio: " + (acumuladorAs / nAsignaturas));
            acumuladorAs = 0;
        }

        //Nota más alta y más baja de notas
        int notaAlta = notas[0][0], notaBaja = notas[0][0];

        for (int[] item : notas) {
            for (int anItem : item) {
                if (anItem > notaAlta) {
                    notaAlta = anItem;
                }
                if (anItem < notaBaja) {
                    notaBaja = anItem;
                }
            }

        }

        System.out.println("Nota más alta: " + notaAlta);
        System.out.println("Nota más baja: " + notaBaja);


    }
}