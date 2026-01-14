package Ejercicio11.Controller;

import Ejercicio11.Model.Carrito;
import Ejercicio11.Model.Producto;

public class GestionTienda {

    private int buscarIndice(Carrito carrito, Producto producto) {

        for (int i = 0; i < carrito.getProductos().size(); i++) {
            if(producto.getCodigo().equals(carrito.getProductos().get(i).getCodigo())) {
                return i;
            }
        }

        return -1;
    }

    public void nuevoProducto(Producto producto, Carrito carrito) {

        int indice = buscarIndice(carrito, producto);

        if (indice == -1) {
            carrito.getProductos().add(producto);
            carrito.getCantidades().add(1);
        }

        if (indice != -1) {
            int actual = carrito.getCantidades().get(indice);
            carrito.getCantidades().set(indice, actual + 1);
        }
    }

    public double calcularTotal(Carrito carrito) {
        double total = 0;

        for (int i = 0; i < carrito.getProductos().size(); i++) {
            double valor = carrito.getProductos().get(i).getPrecio() * carrito.getCantidades().get(i);
            total+=valor;
        }

        return total;
    }

    public String eliminarProducto(Carrito carrito, Producto producto) {

        int indice = buscarIndice(carrito, producto);

        if (indice == -1) {
            return "El producto no se encuentra en la lista";
        } else {
            carrito.getProductos().remove(indice);
            carrito.getCantidades().remove(indice);
        }

        return "Producto eliminado correctamente";
    }

    public void actualizarCarrito(Carrito carrito) {

        for (int i = 0; i < carrito.getProductos().size(); i++) {
            Producto producto = carrito.getProductos().get(i);
            int cantidad = carrito.getCantidades().get(i);

            int resta = producto.getStock()-cantidad;

            producto.setStock(resta);
        }

        carrito.getProductos().clear();
        carrito.getCantidades().clear();

    }
}
