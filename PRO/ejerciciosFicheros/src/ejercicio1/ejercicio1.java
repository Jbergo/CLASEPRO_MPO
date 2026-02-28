package ejercicio1;

/*
Escribe un programa que lea el contenido de un archivo de texto existente y lo muestre por consola.
El programa debe solicitar al usuario la ruta del archivo a leer.
 */

import java.io.*;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la ruta del archivo");
        String ruta = sc.nextLine();

        leerArchivo(ruta);

    }

    private static void leerArchivo(String path) {
        File archivo = new File(path);

        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(archivo));

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error con la lectura del archivo");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error");
            }
        }
    }
}
