package ejercicio4;

/*
Desarrolla un programa que obtenga y muestre información detallada sobre un archivo especificado por el
usuario, como su tamaño, fecha de última modificación, permisos de lectura/escritura y si es un archivo oculto o no.
 */

import java.io.File;

public class ejercicio4 {
    public static void main(String[] args) {

        File file = new File("src/prueba.txt");
        System.out.println("Espacio - " + file.getTotalSpace());
        System.out.println("Fecha última modificación - " + file.lastModified());
        System.out.println("Permiso lectura - " + file.canRead());
        System.out.println("Permiso escritura - " + file.canWrite());
        System.out.println("Es archivo oculto - " + file.isHidden());

    }
}
