package ejercicio7;

/*
Crea un programa que solicite al usuario una ruta de directorio y muestre una lista de todos los archivos y subdirectorios contenidos en él.
Para cada elemento, indica si es un archivo o un directorio, su tamaño en bytes (si es un archivo) y la fecha de última modificación.
 */

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta del directorio a comprobar");
        String path = sc.nextLine();
        try {
            File file = new File(path);
            for (File item : file.listFiles()) {
                System.out.println(item.getName());
                if (item.isFile()) {
                    System.out.println("Este es un archivo");
                } else {
                    System.out.println("Este es un directorio");
                }
                System.out.println(item.getTotalSpace());
                System.out.println(item.lastModified());
            }
        } catch (NullPointerException e) {
            System.out.println("Error con la ruta del archivo");
        }


    }
}
