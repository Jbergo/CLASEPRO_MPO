import java.util.Scanner;

/**
 * Proyecto: Cuadrado Mágico
 * Descripción: Genera y valida matrices mágicas de tamaño n
 *
 * @author Jorge Bermúdez
 */

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static Matriz matriz = new Matriz();
    private static Validacion validacion = new Validacion();

    public static void main(String[] args) {

        //Pedir tamaño matriz
        System.out.println("Introduce el tamaño de la matriz (n):");
        System.out.println("¡Ten en cuenta: con n=2, no existen cuadrados mágicos; y con n>3, pueden tardar mucho. Lo ideal es n=3!");
        int tamanioMatriz = sc.nextInt();

        //Generar matrizMagica
        int[][] matrizMagica = null;
        int intentos = 0;
        boolean esMagica = false;
        while (!esMagica) {

            //Generar
            matrizMagica = matriz.generarMatriz(tamanioMatriz);

            //Validar
            esMagica = validacion.esMagico(matrizMagica);

            //Contar intentos
            intentos++;
        }

        //Mostrar matriz
        mostrarMatriz(matrizMagica, intentos);


    }

    private static int calcularConstante(int[][] matrizMagica) {
        int consMagica = 0;

        //Constante magica
        for (int i = 0; i < matrizMagica[0].length; i++) {
            consMagica += matrizMagica[0][i];
        }

        return consMagica;
    }

    private static void mostrarMatriz(int[][] matrizMagica, int intentos) {

        System.out.println("=== CUADRADO MÁGICO ENCONTRADO ===");
        for (int[] item : matrizMagica) {
            for (int anItem : item) {
                System.out.print(anItem + "\t");
            }
            System.out.println();
        }

        System.out.println("Constante mágica: " + calcularConstante(matrizMagica));
        System.out.println("Intentos realizados: " + intentos);

    }
}
