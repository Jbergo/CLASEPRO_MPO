package controller;

import model.Libro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileController {
    private static final String FILE_NAME = "favoritos.obj";

    public FileController() {
    }

    public void exportarFavoritos(List<Libro> favoritos) {
        try {
            FileOutputStream file = new FileOutputStream(FILE_NAME);
            ObjectOutputStream object = new ObjectOutputStream(file);
            object.writeObject(favoritos);
            object.close();

        } catch (Exception e) {
            System.out.println("Error en la escritura del fichero");
        }
    }

    public List<Libro> importarFavoritos() {
        try {
            FileInputStream file = new FileInputStream(FILE_NAME);
            ObjectInputStream object = new ObjectInputStream(file);
            List<Libro> libros = (List<Libro>) object.readObject();
            object.close();
            return libros;

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error con el objeto del archivo");
        } catch (ClassNotFoundException e) {
            System.out.println("Objeto no encontrado");
        }

        return new ArrayList<>();
    }
}
