package Controller;

import Model.Audio;
import Model.ElementoMultimedia;
import Model.Video;

import java.util.HashMap;

public class GestionApp implements ListarYBuscar {
    private HashMap<Integer, ElementoMultimedia> listaElementos;

    public GestionApp() {
        listaElementos = new HashMap<>();
    }

    public boolean nuevoElemento(ElementoMultimedia tipo) {
        if (validarId(tipo.getId())) {
            return false;
        }
        listaElementos.put(tipo.getId(), tipo);
        return true;
    }

    private boolean validarId(int id) {
        return !listaElementos.containsKey(id);
    }

    public boolean eliminarElemento(int id) {
        if (listaElementos.containsKey(id)) {
            listaElementos.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public void listarElementos(String tipo) {
        for (ElementoMultimedia item : listaElementos.values()) {
            if (tipo.equalsIgnoreCase("todos")) {
                item.mostrarInfo();
            }
            if (tipo.equalsIgnoreCase("video") && item instanceof Video) {
                item.mostrarInfo();
            }
            if (tipo.equalsIgnoreCase("audio") && item instanceof Audio) {
                item.mostrarInfo();
            }
        }
    }

    @Override
    public void buscarPorAutor(String autor) {
        for (ElementoMultimedia item : listaElementos.values()) {
            if (item.getAutor().equals(autor.toLowerCase())) {
                item.mostrarInfo();
            }
        }
    }

    @Override
    public void buscarPorActor(String actor) {
        for (ElementoMultimedia item : listaElementos.values()) {
            if (item instanceof Video && ((Video) item).getActores().contains(actor.toLowerCase())) {
                item.mostrarInfo();
            }
        }
    }

    @Override
    public void buscarPorDirector(String director) {
        for (ElementoMultimedia item : listaElementos.values()) {
            if (item instanceof Video && ((Video) item).getDirector().equals(director.toLowerCase())) {
                item.mostrarInfo();
            }
        }
    }

    public HashMap<Integer, ElementoMultimedia> getListaElementos() {
        return listaElementos;
    }

    public void setListaElementos(HashMap<Integer, ElementoMultimedia> listaElementos) {
        this.listaElementos = listaElementos;
    }
}
