package ejercicio2;

/*
Escribe un programa que busque cuántas veces aparece una palabra específica en un archivo de texto.
El usuario debe introducir la ruta del archivo y la palabra a buscar.
 */

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo");
        String ruta = sc.nextLine();
        System.out.println("Introduce la palabra a buscar");
        String palabra = sc.next();

        buscarPalabra(ruta, palabra);
    }

    private static void buscarPalabra(String path, String word) {
        File file = new File(path);

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));

            int contador = 0;

            String[] palabras = br.readLine().split(" ");
            for (String palabra : palabras) {
                if (palabra.equalsIgnoreCase(word)) {
                    contador++;
                }
            }

            System.out.println("Palabras: " + contador);

        } catch (FileNotFoundException e) {
            System.out.println("Error al buscar el archivo");
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error");
            }
        }
    }
}
