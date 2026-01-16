package Ejercicio10;

import Ejercicio10.Libro;

public class Biblioteca {
    private String nombre;
    private Libro[] libros;
    private int numLibros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new Libro[50];
        this.numLibros = 0;
    }

    public boolean agregarLibro(Libro libro) {
        if (numLibros >= libros.length) return false;
        libros[numLibros] = libro;
        numLibros++;
        return true;
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].getIsbn().equals(isbn)) {
                return libros[i];
            }
        }
        return null;
    }

    public boolean prestarLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro == null) return false;
        return libro.prestar();
    }

    public boolean devolverLibro(String isbn) {
        Libro libro = buscarLibroPorIsbn(isbn);
        if (libro == null) return false;
        return libro.devolver();
    }

    public void listarLibrosDisponibles() {
        for (int i = 0; i < numLibros; i++) {
            if (!libros[i].isPrestado()) {
                System.out.println(libros[i]);
            }
        }
    }

    public void listarLibrosPrestados() {
        for (int i = 0; i < numLibros; i++) {
            if (libros[i].isPrestado()) {
                System.out.println(libros[i]);
            }
        }
    }
}
