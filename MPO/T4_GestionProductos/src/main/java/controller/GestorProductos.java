package controller;

import model.Producto;

import java.util.HashMap;
import java.util.function.BiPredicate;

public class GestorProductos {
    private HashMap<String, Producto> listaProductos;

    public GestorProductos() {
        listaProductos = new HashMap<>();
    }

    private boolean validarCodigo(String cod) {
        BiPredicate<String, HashMap<String, Producto>> validarCod = (s, lista) -> lista.containsKey(s);
        return validarCod.test(cod, listaProductos);
    }
}
