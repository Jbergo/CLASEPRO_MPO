package Ejercicio7;

/*
**Ejercicio 7 - BiFunction con Objetos: Gestión de Productos**

Crea una clase Producto con nombre y precio.
Implementa una BiFunction que reciba dos Productos y devuelva el producto con mayor precio.
Pruébala con una lista de al menos 5 productos.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Comparator<Producto> porPrecio = Comparator.comparingDouble(Producto::getPrecio);
        BiFunction<Producto, Producto, String> mayorPrecio = (producto, producto2) ->
                (porPrecio.compare(producto, producto2) >= 0) ? producto.getNombre() : producto2.getNombre();

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Pan", 1.20));
        productos.add(new Producto("Leche", 0.95));
        productos.add(new Producto("Queso", 3.50));
        productos.add(new Producto("Café", 4.80));
        productos.add(new Producto("Arroz", 1.75));

        Producto producto = productos.getFirst();
        for (Producto item : productos) {
            System.out.println(mayorPrecio.apply(producto, item));
        }

    }
}
