package ejercicio8;

/*
Desarrolla una aplicación que lea un archivo de texto y cuente cuántas palabras contiene.
El programa debe mostrar también cuáles son las 5 palabras más frecuentes y cuántas veces aparece cada una.
Ignora signos de puntuación y trata las palabras sin distinguir entre mayúsculas y minúsculas.
 */

import java.io.*;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo");
        String path = sc.nextLine();

        File file = new File(path);
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));

            String linea;
            int contador = 0;
            while((linea = br.readLine()) != null){
                linea = linea.replaceAll("[^\\p{L}\\p{N}]+", " ").trim();
                if (!linea.isEmpty()){
                    contador += linea.split("\\s+").length;
                }
            }

            System.out.println("Palabras = " + contador);

        } catch (FileNotFoundException e) {
            System.out.println("Error al buscar el archivo");
        } catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
        } finally {
            try {
                br.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error");
            }
        }

    }
}
