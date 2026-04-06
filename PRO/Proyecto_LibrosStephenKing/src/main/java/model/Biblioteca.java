package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros, favoritos;

    public Biblioteca() {
        libros = new ArrayList<>();
        favoritos = new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Libro> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<Libro> favoritos) {
        this.favoritos = favoritos;
    }
}