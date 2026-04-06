package controller;

import model.Biblioteca;
import model.Libro;

import java.util.List;

public class BibliotecaController {
    private Biblioteca biblioteca;
    private APIController apiController;
    private FileController filecontroller;

    public BibliotecaController() {
        this.apiController = new APIController();
        this.filecontroller = new FileController();
        biblioteca = new Biblioteca();
    }

    private Libro buscarLibroPorId(int id) {
        for (Libro item : biblioteca.getLibros()) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public boolean agregarFavorito(int id) {
        Libro libroEncontrado = buscarLibroPorId(id);

        if (libroEncontrado == null) {
            return false;
        }

        for (Libro item : biblioteca.getFavoritos()) {
            if (item.getId() == libroEncontrado.getId()) {
                return false;
            }
        }

        biblioteca.getFavoritos().add(libroEncontrado);
        return true;
    }

    public List<Libro> obtenerFavoritos() {
        return biblioteca.getFavoritos();
    }

    public void importarLibros() {
        biblioteca.setLibros(apiController.obtenerLibros());
    }

    public void exportarFavoritos() {
        filecontroller.exportarFavoritos(biblioteca.getFavoritos());
    }

    public void importarFavoritos() {
        biblioteca.setFavoritos(filecontroller.importarFavoritos());
    }
}
