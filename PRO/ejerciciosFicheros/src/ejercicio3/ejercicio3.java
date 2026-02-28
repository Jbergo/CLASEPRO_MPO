package ejercicio3;

/*
Crea un programa que copie el contenido de un archivo a otro.
El programa debe solicitar al usuario la ruta del archivo de origen y la ruta del archivo de destino.
 */

import java.io.*;

public class ejercicio3 {
    public static void main(String[] args) {
        copiarArchivo("src/prueba.txt", "src/pruebaCopia.txt");
    }

    private static void copiarArchivo(String pathOrigen, String pathDestino) {
        File fileOrigen = new File(pathOrigen);
        File fileDestino = new File(pathDestino);

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(fileOrigen));
            bw = new BufferedWriter(new FileWriter(fileDestino));

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error leyendo el archivo de origen");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo de destino");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error");
            }
            try {
                bw.close();
            } catch (IOException e) {
                System.out.println("Error");
            }
        }

    }
}
