package ejercicio6;

/*
Escribe un programa que cree un archivo CSV (valores separados por comas) con información de 3 estudiantes.
Para cada estudiante, guarda su nombre, edad y calificación. Luego, lee el archivo y muestra su contenido en la consola.
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ejercicio6 {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("jorge", 23, 8.4);
        Estudiante estudiante2 = new Estudiante("alberto", 24, 6);
        Estudiante estudiante3 = new Estudiante("sara", 26, 9);

        String est1 = estudiante.getNombre() + ", " + estudiante.getEdad() + ", " + estudiante.getCalificacion();
        String est2 = estudiante2.getNombre() + ", " + estudiante2.getEdad() + ", " + estudiante2.getCalificacion();
        String est3 = estudiante3.getNombre() + ", " + estudiante3.getEdad() + ", " + estudiante3.getCalificacion();

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("src/ejercicio6/estudiantes.csv"));
            bw.write(est1);
            bw.newLine();
            bw.write(est2);
            bw.newLine();
            bw.write(est3);

        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        } finally {
            try {
                bw.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error");
            }
        }
    }
}
