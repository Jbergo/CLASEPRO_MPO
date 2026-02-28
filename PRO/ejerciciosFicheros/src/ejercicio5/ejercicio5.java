package ejercicio5;

/*
Desarrolla un programa que cuente el número de líneas que contiene un archivo de texto.
El programa debe solicitar al usuario la ruta del archivo a analizar.
 */

import java.io.*;

public class ejercicio5 {
    public static void main(String[] args) {
        File file = new File("src/prueba.txt");

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));

            int contador = 0;

            while (br.readLine() != null) {
                contador++;
            }

            System.out.println("Lineas = " + contador);

        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo");
        } catch (IOException e) {
            System.out.println("Error con el archivo");
        } finally {
            try {
                br.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error");
            }
        }

    }
}
